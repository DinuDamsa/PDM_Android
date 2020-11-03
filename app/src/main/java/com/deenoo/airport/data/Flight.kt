package com.deenoo.airport.data

import java.time.LocalDateTime

data class Flight(
    val id: String,
    var name: String,
    var noPassengers: Int,
    var dateOfFlight: String,
    var isFull: Boolean

){
    override fun toString(): String {
        return "$name, $noPassengers, $dateOfFlight, $isFull"
    }
}