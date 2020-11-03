package com.deenoo.airport.flights

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.deenoo.airport.data.Flight
import com.deenoo.airport.data.FlightRepository
import com.deenoo.core.TAG
import kotlinx.coroutines.launch
import java.time.LocalDateTime

class FlightListViewModel: ViewModel() {

    private val mutableFlights = MutableLiveData<List<Flight>>().apply { value = emptyList() }
    private val mutableLoading = MutableLiveData<Boolean>().apply { value = false }
    private val mutableException = MutableLiveData<Exception>().apply { value = null }

    val flights: LiveData<List<Flight>> = mutableFlights
    val loading: LiveData<Boolean> = mutableLoading
    val loadingError: LiveData<Exception> = mutableException

    fun createFlight(position: Int): Unit {
        val list = mutableListOf<Flight>()
        list.addAll(mutableFlights.value!!) // !! for not null
        list.add(Flight(position.toString(), "Flight$position",1, "2020-10-10 20:20",true))
        mutableFlights.value = list
    }

    fun loadFlights() {
        viewModelScope.launch {
            Log.v(TAG, "loadFlights...");
            mutableLoading.value = true
            mutableException.value = null
            try {
                mutableFlights.value = FlightRepository.loadAll()
                Log.d(TAG, "loadItems succeeded");
                mutableLoading.value = false
            } catch (e: Exception) {
                Log.w(TAG, "loadFlights failed", e);
                mutableException.value = e
                mutableLoading.value = false
            }
        }
    }
}