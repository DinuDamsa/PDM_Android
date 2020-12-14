package com.deenoo.airport.flights;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0017\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u0018R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001b\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0018\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/deenoo/airport/flights/FlightListViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "flightRepository", "Lcom/deenoo/airport/data/FlightRepository;", "flights", "Landroidx/lifecycle/LiveData;", "", "Lcom/deenoo/airport/data/Flight;", "getFlights", "()Landroidx/lifecycle/LiveData;", "loading", "", "getLoading", "loadingError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getLoadingError", "mutableException", "Landroidx/lifecycle/MutableLiveData;", "mutableLoading", "collectEvents", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFlights", "app_debug"})
public final class FlightListViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> mutableLoading = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Exception> mutableException = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.deenoo.airport.data.Flight>> flights = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> loading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Exception> loadingError = null;
    private final com.deenoo.airport.data.FlightRepository flightRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.deenoo.airport.data.Flight>> getFlights() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Exception> getLoadingError() {
        return null;
    }
    
    public final void loadFlights() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object collectEvents(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    public FlightListViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}