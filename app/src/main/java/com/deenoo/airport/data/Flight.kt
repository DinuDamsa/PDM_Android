package com.deenoo.airport.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "flights")
data class Flight(
    @PrimaryKey @ColumnInfo(name = "_id")
    var _id: String,
    @ColumnInfo(name = "userId")
    var userId: String,
    @ColumnInfo(name = "name")
    var name: String,
    @ColumnInfo(name = "noPassengers")
    var noPassengers: Int,
    @ColumnInfo(name = "dateOfFlight")
    var dateOfFlight: String,
    @ColumnInfo(name = "isFull")
    var isFull: Boolean

) {
    override fun toString(): String {
        return "$name, $noPassengers, $dateOfFlight, $isFull"
    }
}