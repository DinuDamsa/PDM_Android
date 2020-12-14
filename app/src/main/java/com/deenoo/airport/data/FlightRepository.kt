package com.deenoo.airport.data

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import com.deenoo.airport.data.local.FlightDAO
import com.deenoo.airport.data.remote.FlightApi
import com.deenoo.core.Constants
import com.deenoo.core.TAG
import java.lang.Exception
import com.deenoo.core.Result

class FlightRepository(private val flightDAO: FlightDAO) {

//    val flights = flightDAO.getAll()
    val flights = MediatorLiveData<List<Flight>>().apply { postValue(emptyList()) }

    suspend fun refresh(): Result<Boolean>{
        Log.i(TAG, "getAll")
        return try {
            val flightApi = FlightApi.service.getAll()
            flights.value = flightApi
            for (plant in flightApi) {
                flightDAO.insert(plant)
            }
            Result.Success(true)
        } catch (e: Exception) {
            val userId = Constants.instance()?.fetchValueString("_id")
            flights.addSource(flightDAO.getAllByUserId(userId!!)) {
                flights.value = it
            }
            Result.Error(e)
        }
    }

    fun loadFlight(flightId: String): LiveData<Flight> {
        Log.i(TAG, "loadFlight")

        return flightDAO.getById(flightId)
    }

    suspend fun save(flight: Flight): Result<Flight> {
        Log.i(TAG, "save")
        try {
            val updatedFlight = FlightApi.service.create(flight)
            flightDAO.insert(flight)
//            flightDAO.update(flight)
            return Result.Success(updatedFlight)
        } catch (e: Exception) {
            return Result.Error(e)
        }
    }

    suspend fun update(flight: Flight): Result<Flight> {
        Log.i(TAG, "update")
        try {
            val updatedFlight = FlightApi.service.update(flight._id, flight)
            flightDAO.update(flight)
            return Result.Success(updatedFlight)
        } catch (e: Exception) {
            return Result.Error(e)
        }
    }
}