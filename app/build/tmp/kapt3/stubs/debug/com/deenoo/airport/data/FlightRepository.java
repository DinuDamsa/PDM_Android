package com.deenoo.airport.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\u0014\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\u0014\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/deenoo/airport/data/FlightRepository;", "", "flightDAO", "Lcom/deenoo/airport/data/local/FlightDAO;", "(Lcom/deenoo/airport/data/local/FlightDAO;)V", "flights", "Landroidx/lifecycle/MediatorLiveData;", "", "Lcom/deenoo/airport/data/Flight;", "getFlights", "()Landroidx/lifecycle/MediatorLiveData;", "loadFlight", "Landroidx/lifecycle/LiveData;", "flightId", "", "refresh", "Lcom/deenoo/core/Result;", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "flight", "(Lcom/deenoo/airport/data/Flight;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
public final class FlightRepository {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.util.List<com.deenoo.airport.data.Flight>> flights = null;
    private final com.deenoo.airport.data.local.FlightDAO flightDAO = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.util.List<com.deenoo.airport.data.Flight>> getFlights() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object refresh(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.deenoo.core.Result<java.lang.Boolean>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.deenoo.airport.data.Flight> loadFlight(@org.jetbrains.annotations.NotNull()
    java.lang.String flightId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object save(@org.jetbrains.annotations.NotNull()
    com.deenoo.airport.data.Flight flight, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.deenoo.core.Result<com.deenoo.airport.data.Flight>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.deenoo.airport.data.Flight flight, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.deenoo.core.Result<com.deenoo.airport.data.Flight>> p1) {
        return null;
    }
    
    public FlightRepository(@org.jetbrains.annotations.NotNull()
    com.deenoo.airport.data.local.FlightDAO flightDAO) {
        super();
    }
}