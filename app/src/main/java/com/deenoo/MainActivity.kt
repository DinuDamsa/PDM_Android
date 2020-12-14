package com.deenoo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.deenoo.airport.data.remote.FlightApi
import com.deenoo.core.Constants
import com.deenoo.core.TAG
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    var isActive = false

    @InternalCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        Constants.instance(this.applicationContext);
        Log.i(TAG, "onCreate")
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onStart() {
        super.onStart()
        isActive = true
        CoroutineScope(Dispatchers.Main).launch { collectEvents() }
    }

    private suspend fun collectEvents() {
        while (isActive) {
            val event = FlightApi.RemoteDataSource.eventChannel.receive()
            Log.d("ws", event)
            Log.d("MainActivity", "received $event")
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onStop() {
        super.onStop()
        isActive = false
    }
}