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
import com.deenoo.core.TAG
import kotlinx.android.synthetic.main.fragment_flight_edit.*

class FlightEditFragment : Fragment() {
    companion object{
        const val FLIGHT_ID = "FLIGHT_ID"
        const val NAME = "NAME"
        const val NO_PASSENGERS = "NO_PASSENGERS"
        const val DATE_OF_FLIGHT = "DATE_OF_FLIGHT"
        const val IS_FULL = "IS_FULL"
    }

    private lateinit var viewModel: FlightEditViewModel
    private var flightId: String? = null
    private var name: String? = null
    private var noPassengers: Int? = null
    private var dateOfFlight: String? = null
    private var isFull: Boolean? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v(TAG, "onCreate")
        arguments?.let {
            if (it.containsKey(FLIGHT_ID)) {
                flightId = it.getString(FLIGHT_ID).toString()
            }
            if (it.containsKey(NAME)) {
                name = it.getString(NAME).toString()
            }
            if (it.containsKey(NO_PASSENGERS)) {
                noPassengers = it.getInt(NO_PASSENGERS)
            }
            if (it.containsKey(DATE_OF_FLIGHT)) {
                dateOfFlight = it.getString(DATE_OF_FLIGHT).toString()
            }
            if (it.containsKey(IS_FULL)) {
                isFull = it.getBoolean(IS_FULL)
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
        flight_number_of_passengers.setText(noPassengers.toString())
        if (isFull != null)
            flight_is_full.isChecked = isFull!!
        else
            flight_is_full.isChecked = true
        flight_date.setText(dateOfFlight)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.v(TAG, "onActivityCreated")
        setupViewModel()
        fab.setOnClickListener {
            Log.v(TAG, "save item")
            viewModel.saveOrUpdateFlight(
                flight_name.text.toString(),
                flight_is_full.isChecked,
                flight_number_of_passengers.text.toString().toInt(),
                flight_date.text.toString())
        }
    }
    private fun setupViewModel() {
        viewModel = ViewModelProvider(this).get(FlightEditViewModel::class.java)
        viewModel.flight.observe(viewLifecycleOwner) { flight ->
            Log.v(TAG, "update flight")
            flight_name.setText(flight.name)
            flight_date.setText(flight.dateOfFlight)
            flight_is_full.isChecked = flight.isFull
            flight_number_of_passengers.setText(flight.noPassengers.toString())

        }
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
        if (id != null) {
            viewModel.loadFlight(id)
        }
    }
}