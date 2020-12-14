package com.deenoo.airport.flights

import android.app.Application
import android.util.Log
import androidx.lifecycle.*
import com.deenoo.airport.data.Flight
import com.deenoo.airport.data.FlightRepository
import com.deenoo.airport.data.local.FlightDatabase
import com.deenoo.airport.data.remote.FlightApi
import com.deenoo.core.TAG
import com.deenoo.core.Result
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FlightListViewModel(application: Application) : AndroidViewModel(application){

    private val mutableLoading = MutableLiveData<Boolean>().apply { value = false }
    private val mutableException = MutableLiveData<Exception>().apply { value = null }

    val flights: LiveData<List<Flight>>
    val loading: LiveData<Boolean> = mutableLoading
    val loadingError: LiveData<Exception> = mutableException
    private val flightRepository: FlightRepository

    init {
        val flightDAO = FlightDatabase.getDatabase(application,viewModelScope).flightDao()
        flightRepository = FlightRepository(flightDAO)
        flights = flightRepository.flights
        CoroutineScope(Dispatchers.Main).launch { collectEvents() }
    }

    fun loadFlights() {
        viewModelScope.launch {
            Log.v(TAG, "loadFlights...");
            mutableLoading.value = true
            mutableException.value = null
            when (val result = flightRepository.refresh()) {
                is Result.Success -> {
                    Log.d(TAG, "refresh succeeded")
                    mutableLoading.value = false
                }
                is Result.Error -> {
                    Log.w(TAG, "refresh failed", result.exception)
                    mutableException.value = result.exception
                }
            }
        }
    }

    suspend fun collectEvents() {
        while (true) {
            val event = FlightApi.RemoteDataSource.eventChannel.receive()
            Log.d("ws", event)
            Log.d("MainActivity", "received $event")
            loadFlights()
        }
    }

}