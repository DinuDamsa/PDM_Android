package com.deenoo.airport.flight

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.deenoo.airport.data.Flight
import com.deenoo.airport.data.FlightRepository
import com.deenoo.core.TAG
import kotlinx.coroutines.launch

class FlightEditViewModel: ViewModel() {
    private val mutableFlight = MutableLiveData<Flight>().apply { value = Flight("", "",
        0,
        "2020-10-10 20:02",
        false) }
    private val mutableFetching = MutableLiveData<Boolean>().apply { value = false }
    private val mutableCompleted = MutableLiveData<Boolean>().apply { value = false }
    private val mutableException = MutableLiveData<Exception>().apply { value = null }

    val flight: LiveData<Flight> = mutableFlight
    val fetching: LiveData<Boolean> = mutableFetching
    val fetchingError: LiveData<Exception> = mutableException
    val completed: LiveData<Boolean> = mutableCompleted

    fun loadFlight(flightId: String) {
        viewModelScope.launch {
            Log.i(TAG, "loadFlight...")
            mutableFetching.value = true
            mutableException.value = null
            try {
                mutableFlight.value = FlightRepository.loadFlight(flightId)
                Log.i(TAG, "loadFlight succeeded")
                mutableFetching.value = false
            } catch (e: Exception) {
                Log.w(TAG, "loadFlight failed", e)
                mutableException.value = e
                mutableFetching.value = false
            }
        }
    }

    fun saveOrUpdateFlight(name: String, isFull: Boolean, noPassengers: Int, dateOfFlight:String) {
        viewModelScope.launch {
            Log.i(TAG, "saveOrUpdateFlight...");
            val flight = mutableFlight.value ?: return@launch
            flight.name = name
            flight.noPassengers = noPassengers
            flight.dateOfFlight = dateOfFlight
            flight.isFull = isFull
            mutableFetching.value = true
            mutableException.value = null
            try {
                if (flight.id.isNotEmpty()) {
                    mutableFlight.value = FlightRepository.update(flight)
                } else {
                    mutableFlight.value = FlightRepository.save(flight)
                }
                Log.i(TAG, "saveOrUpdateFlight succeeded");
                mutableCompleted.value = true
                mutableFetching.value = false
            } catch (e: Exception) {
                Log.w(TAG, "saveOrUpdateFlight failed", e);
                mutableException.value = e
                mutableFetching.value = false
            }
        }
    }

}