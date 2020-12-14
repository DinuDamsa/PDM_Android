package com.deenoo.airport.data.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.deenoo.airport.data.Flight

@Dao
interface FlightDAO {
    @Query("SELECT * FROM flights")
    fun getAll(): LiveData<List<Flight>>

    @Query("SELECT * FROM flights WHERE userId=:userID")
    fun getAllByUserId(userID:String): LiveData<List<Flight>>


    @Query("SELECT * FROM flights WHERE _id=:id")
    fun getById(id: String): LiveData<Flight>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(flight: Flight)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(flight: Flight)
}