package com.deenoo.airport.flight

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.*
import com.deenoo.airport.data.Flight
import com.deenoo.airport.data.FlightRepository
import com.deenoo.airport.data.local.FlightDatabase
import com.deenoo.core.TAG
import kotlinx.coroutines.launch
import java.util.*
import com.deenoo.core.Result

class FlightEditViewModel(app: Application): AndroidViewModel(app) {
    private val mutableFetching = MutableLiveData<Boolean>().apply { value = false }
    private val mutableCompleted = MutableLiveData<Boolean>().apply { value = false }
    private val mutableException = MutableLiveData<Exception>().apply { value = null }

    val fetching: LiveData<Boolean> = mutableFetching
    val fetchingError: LiveData<Exception> = mutableException
    val completed: LiveData<Boolean> = mutableCompleted

    private val flightRepository: FlightRepository

    init {
        val flightDAO = FlightDatabase.getDatabase(app, viewModelScope).flightDao()
        flightRepository = FlightRepository(flightDAO)
    }

    fun getFlightById(flightId: String): LiveData<Flight> {
        Log.v(TAG, "getFlightById...")
        return flightRepository.loadFlight(flightId)
    }

    fun random(): String {
        val generator = Random()
        val randomStringBuilder = StringBuilder()
        val randomLength: Int = generator.nextInt(20)
        var tempChar: Char
        for (i in 0 until randomLength) {
            tempChar = ((generator.nextInt(96) + 32).toChar())
            randomStringBuilder.append(tempChar)
        }
        return randomStringBuilder.toString()
    }

    fun saveOrUpdateFlight(flight: Flight) {
        viewModelScope.launch {
            Log.v(TAG, "saveOrUpdateFlight...")
            mutableFetching.value = true
            mutableException.value = null
            val result: Result<Flight> = if (flight._id.isNotEmpty()) {
                flightRepository.update(flight)
            } else {
                flight._id = random()
                flightRepository.save(flight)
            }
            when (result) {
                is Result.Success -> {
                    Log.d(TAG, "saveOrUpdateFlight succeeded");
                }
                is Result.Error -> {
                    Log.w(TAG, "saveOrUpdateFlight failed", result.exception);
                    mutableException.value = result.exception
                }
            }
            mutableCompleted.value = true
            mutableFetching.value = false
        }
    }
}