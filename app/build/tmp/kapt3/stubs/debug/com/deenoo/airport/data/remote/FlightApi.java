package com.deenoo.airport.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \t*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0011"}, d2 = {"Lcom/deenoo/airport/data/remote/FlightApi;", "", "()V", "URL", "", "client", "Lokhttp3/OkHttpClient;", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "retrofit", "Lretrofit2/Retrofit;", "service", "Lcom/deenoo/airport/data/remote/FlightApi$Service;", "getService", "()Lcom/deenoo/airport/data/remote/FlightApi$Service;", "Service", "app_debug"})
public final class FlightApi {
    private static final java.lang.String URL = "http://192.168.84.209:3000/";
    private static final okhttp3.OkHttpClient client = null;
    private static com.google.gson.Gson gson;
    private static final retrofit2.Retrofit retrofit = null;
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
        @retrofit2.http.GET(value = "/flight")
        public abstract java.lang.Object getAll(@org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super java.util.List<com.deenoo.airport.data.Flight>> p0);
        
        @org.jetbrains.annotations.Nullable()
        @retrofit2.http.GET(value = "/flight/{id}")
        public abstract java.lang.Object getOne(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Path(value = "id")
        java.lang.String flightId, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.deenoo.airport.data.Flight> p1);
        
        @org.jetbrains.annotations.Nullable()
        @retrofit2.http.POST(value = "/flight")
        @retrofit2.http.Headers(value = {"Content-Type: application/json"})
        public abstract java.lang.Object create(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Body()
        com.deenoo.airport.data.Flight flight, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.deenoo.airport.data.Flight> p1);
        
        @org.jetbrains.annotations.Nullable()
        @retrofit2.http.PUT(value = "/flight/{id}")
        public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Path(value = "id")
        java.lang.String flightId, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Body()
        com.deenoo.airport.data.Flight flight, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.deenoo.airport.data.Flight> p2);
    }
}