package com.deenoo.airport.flights

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import com.deenoo.R
import com.deenoo.core.TAG
import kotlinx.android.synthetic.main.fragment_flight_list.*

class FlightListFragment: Fragment() {
    private lateinit var flightsListAdapter: FlightListAdapter
    private lateinit var flightsModel: FlightListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v(TAG, "onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_flight_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.v(TAG, "onActivityCreated")
        setupFlightsList()
        fab.setOnClickListener {
            Log.v(TAG, "add new item")
            findNavController().navigate(R.id.FlightEditFragment) // modificat
        }
    }

    private fun setupFlightsList() {
        flightsListAdapter = FlightListAdapter(this)
        flight_list.adapter = flightsListAdapter
        flightsModel = ViewModelProvider(this).get(FlightListViewModel::class.java)
        flightsModel.flights.observe(viewLifecycleOwner) { flights ->
            Log.v(TAG, "update flights")
            flightsListAdapter.flights = flights
        }
        flightsModel.loading.observe(viewLifecycleOwner) { loading ->
            Log.i(TAG, "update loading")
            progress.visibility = if (loading) View.VISIBLE else View.GONE
        }
        flightsModel.loadingError.observe(viewLifecycleOwner) { exception ->
            if (exception != null) { //exception can be null, leave this here
                Log.i(TAG, "update loading error")
                val message = "Loading exception ${exception.message}"
                Toast.makeText(activity, message, Toast.LENGTH_SHORT).show()
            }
        }
        flightsModel.loadFlights()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v(TAG, "onDestroy")
    }
}