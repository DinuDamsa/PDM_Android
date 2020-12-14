package com.deenoo.airport.data

data class MessageData(var event: String, var payload: PlantJson) {
    data class PlantJson(var flight: Flight)
}