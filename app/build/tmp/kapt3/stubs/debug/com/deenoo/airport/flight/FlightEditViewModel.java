package com.deenoo.airport.flight;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0017R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001b\u0010\f\u001a\f\u0012\b\u0012\u00060\rj\u0002`\u000e0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\f\u0012\b\u0012\u00060\rj\u0002`\u000e0\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/deenoo/airport/flight/FlightEditViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "completed", "Landroidx/lifecycle/LiveData;", "", "getCompleted", "()Landroidx/lifecycle/LiveData;", "fetching", "getFetching", "fetchingError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getFetchingError", "flightRepository", "Lcom/deenoo/airport/data/FlightRepository;", "mutableCompleted", "Landroidx/lifecycle/MutableLiveData;", "mutableException", "mutableFetching", "getFlightById", "Lcom/deenoo/airport/data/Flight;", "flightId", "", "random", "saveOrUpdateFlight", "", "flight", "app_debug"})
public final class FlightEditViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> mutableFetching = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> mutableCompleted = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Exception> mutableException = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> fetching = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Exception> fetchingError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> completed = null;
    private final com.deenoo.airport.data.FlightRepository flightRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getFetching() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Exception> getFetchingError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getCompleted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.deenoo.airport.data.Flight> getFlightById(@org.jetbrains.annotations.NotNull()
    java.lang.String flightId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String random() {
        return null;
    }
    
    public final void saveOrUpdateFlight(@org.jetbrains.annotations.NotNull()
    com.deenoo.airport.data.Flight flight) {
    }
    
    public FlightEditViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        super(null);
    }
}