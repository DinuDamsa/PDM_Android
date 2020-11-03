package com.deenoo.airport.data

import android.util.Log
import com.deenoo.airport.data.remote.FlightApi
import com.deenoo.core.TAG

object FlightRepository {
    private var flights: MutableList<Flight>? = null

    suspend fun loadAll(): List<Flight>{
        Log.i(TAG, "loadAll")
        if (flights != null){
            return flights as List<Flight>
        }
        flights = mutableListOf()
        println()
        val flightList = FlightApi.service.getAll()
        flights?.addAll(flightList);
        return flights as List<Flight>
    }
    suspend fun loadFlight(flightId: String): Flight {
        Log.i(TAG, "load")
        val flight = flights?.find { it.id == flightId }
        if (flight != null) {
            return flight
        }
        return FlightApi.service.getOne(flightId)
    }

    suspend fun save(flight: Flight): Flight {
        Log.i(TAG, "save")
        val createdItem = FlightApi.service.create(flight)
        flights?.add(createdItem)
        return createdItem
    }

    suspend fun update(flight: Flight): Flight {
        Log.i(TAG, "update")
        val updatedFlight = FlightApi.service.update(flight.id, flight)
        val flightIndex = flights?.indexOfFirst { it.id == flight.id }
        if (flightIndex != null) {
            flights?.set(flightIndex, updatedFlight)
        }
        return updatedFlight
    }
}