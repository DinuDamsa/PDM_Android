package com.deenoo.airport.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\t\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/deenoo/airport/data/remote/FlightApi;", "", "()V", "WSURL", "", "service", "Lcom/deenoo/airport/data/remote/FlightApi$Service;", "getService", "()Lcom/deenoo/airport/data/remote/FlightApi$Service;", "RemoteDataSource", "Service", "app_debug"})
public final class FlightApi {
    private static final java.lang.String WSURL = "ws://192.168.0.80:3000";
    @org.jetbrains.annotations.NotNull()
    private static final com.deenoo.airport.data.remote.FlightApi.Service service = null;
    public static final com.deenoo.airport.data.remote.FlightApi INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.deenoo.airport.data.remote.FlightApi.Service getService() {
        return null;
    }
    
    private FlightApi() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ%\u0010\r\u001a\u00020\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/deenoo/airport/data/remote/FlightApi$Service;", "", "create", "Lcom/deenoo/airport/data/Flight;", "flight", "(Lcom/deenoo/airport/data/Flight;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAll", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOne", "flightId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "(Ljava/lang/String;Lcom/deenoo/airport/data/Flight;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static abstract interface Service {
        
        @org.jetbrains.annotations.Nullable()
        @retrofit2.http.GET(value = "/api/flight")
        public abstract java.lang.Object getAll(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.util.List<com.deenoo.airport.data.Flight>> p0);
        
        @org.jetbrains.annotations.Nullable()
        @retrofit2.http.GET(value = "/api/flight/{id}")
        public abstract java.lang.Object getOne(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Path(value = "id")
        java.lang.String flightId, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.deenoo.airport.data.Flight> p1);
        
        @org.jetbrains.annotations.Nullable()
        @retrofit2.http.POST(value = "/api/flight")
        @retrofit2.http.Headers(value = {"Content-Type: application/json"})
        public abstract java.lang.Object create(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Body()
        com.deenoo.airport.data.Flight flight, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.deenoo.airport.data.Flight> p1);
        
        @org.jetbrains.annotations.Nullable()
        @retrofit2.http.PUT(value = "/api/flight/{id}")
        public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Path(value = "id")
        java.lang.String flightId, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Body()
        com.deenoo.airport.data.Flight flight, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.deenoo.airport.data.Flight> p2);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/deenoo/airport/data/remote/FlightApi$RemoteDataSource;", "", "()V", "eventChannel", "Lkotlinx/coroutines/channels/Channel;", "", "getEventChannel", "()Lkotlinx/coroutines/channels/Channel;", "MyWebSocketListener", "app_debug"})
    public static final class RemoteDataSource {
        @org.jetbrains.annotations.NotNull()
        private static final kotlinx.coroutines.channels.Channel<java.lang.String> eventChannel = null;
        public static final com.deenoo.airport.data.remote.FlightApi.RemoteDataSource INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.coroutines.channels.Channel<java.lang.String> getEventChannel() {
            return null;
        }
        
        private RemoteDataSource() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\nH\u0002\u00a8\u0006\u0017"}, d2 = {"Lcom/deenoo/airport/data/remote/FlightApi$RemoteDataSource$MyWebSocketListener;", "Lokhttp3/WebSocketListener;", "()V", "onClosing", "", "webSocket", "Lokhttp3/WebSocket;", "code", "", "reason", "", "onFailure", "t", "", "response", "Lokhttp3/Response;", "onMessage", "text", "bytes", "Lokio/ByteString;", "onOpen", "output", "txt", "app_debug"})
        static final class MyWebSocketListener extends okhttp3.WebSocketListener {
            
            @java.lang.Override()
            public void onOpen(@org.jetbrains.annotations.NotNull()
            okhttp3.WebSocket webSocket, @org.jetbrains.annotations.NotNull()
            okhttp3.Response response) {
            }
            
            @java.lang.Override()
            public void onMessage(@org.jetbrains.annotations.NotNull()
            okhttp3.WebSocket webSocket, @org.jetbrains.annotations.NotNull()
            java.lang.String text) {
            }
            
            @java.lang.Override()
            public void onMessage(@org.jetbrains.annotations.NotNull()
            okhttp3.WebSocket webSocket, @org.jetbrains.annotations.NotNull()
            okio.ByteString bytes) {
            }
            
            @java.lang.Override()
            public void onClosing(@org.jetbrains.annotations.NotNull()
            okhttp3.WebSocket webSocket, int code, @org.jetbrains.annotations.NotNull()
            java.lang.String reason) {
            }
            
            @java.lang.Override()
            public void onFailure(@org.jetbrains.annotations.NotNull()
            okhttp3.WebSocket webSocket, @org.jetbrains.annotations.NotNull()
            java.lang.Throwable t, @org.jetbrains.annotations.Nullable()
            okhttp3.Response response) {
            }
            
            private final void output(java.lang.String txt) {
            }
            
            public MyWebSocketListener() {
                super();
            }
        }
    }
}