package com.deenoo.airport.flight

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.observe
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.deenoo.R
import com.deenoo.airport.data.Flight
import com.deenoo.core.TAG
import kotlinx.android.synthetic.main.fragment_flight_edit.*

class FlightEditFragment : Fragment() {
    companion object {
        const val FLIGHT_ID = "FLIGHT_ID"
    }

    private lateinit var viewModel: FlightEditViewModel
    private var flightId: String? = null
    private var flight: Flight? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v(TAG, "onCreate")
        arguments?.let {
            if (it.containsKey(FLIGHT_ID)) {
                flightId = it.getString(FLIGHT_ID).toString()
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.v(TAG, "onCreateView")
        return inflater.inflate(R.layout.fragment_flight_edit, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.v(TAG, "onViewCreated")
        flight_name.setText(flightId)
        flight_number_of_passengers.setText(flight?.noPassengers.toString())
        if (flight?.isFull != null)
            flight_is_full.isChecked = flight?.isFull!!
        else
            flight_is_full.isChecked = true
        flight_date.setText(flight?.dateOfFlight)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.v(TAG, "onActivityCreated")
        setupViewModel()
        fab.setOnClickListener {
            Log.v(TAG, "save item")
            val fl = flight
            if (fl != null) {
                fl.name = flight_name.text.toString()
                fl.isFull = flight_is_full.isChecked
                fl.noPassengers = flight_number_of_passengers.text.toString().toInt()
                fl.dateOfFlight = flight_date.text.toString()
                viewModel.saveOrUpdateFlight(fl)
            }
        }
    }

    private fun setupViewModel() {
        viewModel = ViewModelProvider(this).get(FlightEditViewModel::class.java)
        viewModel.fetching.observe(viewLifecycleOwner) { fetching ->
            Log.v(TAG, "update fetching")
            progress.visibility = if (fetching) View.VISIBLE else View.GONE
        }
        viewModel.fetchingError.observe(viewLifecycleOwner) { exception ->
            if (exception != null) {
                Log.v(TAG, "update fetching error")
                val message = "Fetching exception ${exception.message}"
                val parentActivity = activity?.parent
                if (parentActivity != null) {
                    Toast.makeText(parentActivity, message, Toast.LENGTH_SHORT).show()
                }
            }
        }
        viewModel.completed.observe(viewLifecycleOwner, Observer { completed ->
            if (completed) {
                Log.v(TAG, "completed, navigate back")
                findNavController().navigateUp()
            }
        })
        val id = flightId
        if (id == null) {
            flight = Flight("", "", "", 0, "", false)
        } else {
            viewModel.getFlightById(id).observe(viewLifecycleOwner) {
                Log.v(TAG, "update flight")
                if (it != null) {
                    flight = it
                    flight_name.setText(flight!!.name)
                    flight_date.setText(flight!!.dateOfFlight)
                    flight_number_of_passengers.setText(flight!!.noPassengers)
                    flight_is_full.isChecked = flight!!.isFull
                }
            }
        }
    }
}