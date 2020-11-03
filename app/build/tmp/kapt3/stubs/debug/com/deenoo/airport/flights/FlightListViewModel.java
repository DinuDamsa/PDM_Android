package com.deenoo.airport.flights;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0015R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\f\u001a\f\u0012\b\u0012\u00060\rj\u0002`\u000e0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u0018\u0010\u0010\u001a\f\u0012\b\u0012\u00060\rj\u0002`\u000e0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/deenoo/airport/flights/FlightListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "flights", "Landroidx/lifecycle/LiveData;", "", "Lcom/deenoo/airport/data/Flight;", "getFlights", "()Landroidx/lifecycle/LiveData;", "loading", "", "getLoading", "loadingError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getLoadingError", "mutableException", "Landroidx/lifecycle/MutableLiveData;", "mutableFlights", "mutableLoading", "createFlight", "", "position", "", "loadFlights", "app_debug"})
public final class FlightListViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.deenoo.airport.data.Flight>> mutableFlights = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> mutableLoading = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Exception> mutableException = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.deenoo.airport.data.Flight>> flights = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> loading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Exception> loadingError = null;
    
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
    
    public final void createFlight(int position) {
    }
    
    public final void loadFlights() {
    }
    
    public FlightListViewModel() {
        super();
    }
}