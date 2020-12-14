package com.deenoo.airport.flights

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.deenoo.R
import com.deenoo.airport.data.Flight
import com.deenoo.airport.flight.FlightEditFragment
import com.deenoo.core.TAG
import kotlinx.android.synthetic.main.view_flight.view.*

class FlightListAdapter (
    private val fragment: Fragment
) : RecyclerView.Adapter<FlightListAdapter.ViewHolder>() {

    var flights = emptyList<Flight>()
        set(value) {
            field = value
            notifyDataSetChanged();
        }

    private var onFlightClick: View.OnClickListener;

    init {
        onFlightClick = View.OnClickListener { view ->
            val flight = view.tag as Flight
            fragment.findNavController().navigate(R.id.FlightEditFragment, Bundle().apply {
                putString(FlightEditFragment.FLIGHT_ID, flight._id)
            })
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_flight, parent, false)
        Log.v(TAG, "onCreateViewHolder")
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.v(TAG, "onBindViewHolder $position")
        val flight = flights[position]
        holder.itemView.tag = flight
        holder.textView.text = flight.name
        holder.itemView.setOnClickListener(onFlightClick)
    }

    override fun getItemCount() = flights.size

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.name
    }
}