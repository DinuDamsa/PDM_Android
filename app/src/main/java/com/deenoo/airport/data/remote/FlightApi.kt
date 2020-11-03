package com.deenoo.airport.data.remote

import com.deenoo.airport.data.Flight
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.http.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object FlightApi {
    private const val URL = "http://192.168.84.209:3000/"

    interface Service {
        @GET("/flight")
        suspend fun getAll(): List<Flight>

        @GET("/flight/{id}")
        suspend fun getOne(@Path("id") flightId: String): Flight

        @Headers("Content-Type: application/json")
        @POST("/flight")
        suspend fun create(@Body flight: Flight): Flight

        @PUT("/flight/{id}")
        suspend fun update(@Path("id") flightId: String, @Body flight: Flight): Flight
    }

    private val client: OkHttpClient = OkHttpClient.Builder().build()

    private var gson= GsonBuilder().setLenient().create()

    private val retrofit = Retrofit.Builder()
        .baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .client(client)
        .build()

    val service: Service = retrofit.create(Service::class.java)
}