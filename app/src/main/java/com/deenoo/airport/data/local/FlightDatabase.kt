package com.deenoo.airport.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.deenoo.airport.data.Flight
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Database(entities = [Flight::class], version = 1)
abstract class FlightDatabase: RoomDatabase() {
    abstract fun flightDao(): FlightDAO

    companion object {
        @Volatile
        private var INSTANCE: FlightDatabase? = null

        fun getDatabase(context: Context, scope: CoroutineScope): FlightDatabase {
            val inst = INSTANCE
            if (inst != null) {
                return inst
            }
            val instance =
                Room.databaseBuilder(
                    context.applicationContext,
                    FlightDatabase::class.java,
                    "flight_db"
                )
                    .addCallback(FlightDatabaseCallback(scope))
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            INSTANCE = instance
            return instance
        }

        private class FlightDatabaseCallback(private val scope: CoroutineScope) :
            RoomDatabase.Callback() {

            override fun onOpen(db: SupportSQLiteDatabase) {
                super.onOpen(db)
                INSTANCE?.let { database ->
                    scope.launch(Dispatchers.IO) {
                        populateDatabase(database.flightDao())
                    }
                }
            }
        }

        suspend fun populateDatabase(flightDAO: FlightDAO) {
//            flightDAO.deleteAll()
        }
    }
}