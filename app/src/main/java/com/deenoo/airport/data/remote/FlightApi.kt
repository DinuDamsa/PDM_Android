package com.deenoo.airport.data.remote

import android.util.Log
import com.deenoo.airport.data.Flight
import com.deenoo.core.Api
import com.deenoo.core.Constants
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.runBlocking
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.WebSocket
import okhttp3.WebSocketListener
import okio.ByteString
import retrofit2.http.*


object FlightApi {
    private const val WSURL = "ws://192.168.0.80:3000" // "ws://192.168.0.150:3000"

    interface Service {
        @GET("/api/flight")
        suspend fun getAll(): List<Flight>

        @GET("/api/flight/{id}")
        suspend fun getOne(@Path("id") flightId: String): Flight

        @Headers("Content-Type: application/json")
        @POST("/api/flight")
        suspend fun create(@Body flight: Flight): Flight

        @PUT("/api/flight/{id}")
        suspend fun update(@Path("id") flightId: String, @Body flight: Flight): Flight
    }

    val service: Service = Api.retrofit.create(Service::class.java)

    object RemoteDataSource {
        val eventChannel = Channel<String>()

        init {
            val request = Request.Builder().url(WSURL).build()
            OkHttpClient().newWebSocket(request, MyWebSocketListener()).request()
        }

        private class MyWebSocketListener : WebSocketListener() {
            override fun onOpen(webSocket: WebSocket, response: okhttp3.Response) {
                Log.d("WebSocket", "onOpen")
                val token = Constants.instance()?.fetchValueString("token")
                val json =
                    "{\"type\":\"authorization\",\"payload\":{\"token\":\"$token\"}}"
                Log.d("json", json)
                webSocket.send(json)
            }

            override fun onMessage(webSocket: WebSocket, text: String) {
                Log.d("WebSocket", "onMessage$text")
                runBlocking { eventChannel.send(text) }
            }

            override fun onMessage(webSocket: WebSocket, bytes: ByteString) {
                Log.d("WebSocket", "onMessage bytes")
                output("Receiving bytes : " + bytes.hex())
            }

            override fun onClosing(webSocket: WebSocket, code: Int, reason: String) {
            }

            override fun onFailure(webSocket: WebSocket, t: Throwable, response: okhttp3.Response?) {
                Log.e("WebSocket", "onFailure", t)
                t.printStackTrace()
            }

            private fun output(txt: String) {
                Log.d("WebSocket", txt)
            }
        }
    }
}