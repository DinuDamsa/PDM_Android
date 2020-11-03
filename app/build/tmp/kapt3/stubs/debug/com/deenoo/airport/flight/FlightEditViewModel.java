package com.deenoo.airport.flight;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J&\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0019R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u001b\u0010\n\u001a\f\u0012\b\u0012\u00060\u000bj\u0002`\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u000bj\u0002`\f0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/deenoo/airport/flight/FlightEditViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "completed", "Landroidx/lifecycle/LiveData;", "", "getCompleted", "()Landroidx/lifecycle/LiveData;", "fetching", "getFetching", "fetchingError", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getFetchingError", "flight", "Lcom/deenoo/airport/data/Flight;", "getFlight", "mutableCompleted", "Landroidx/lifecycle/MutableLiveData;", "mutableException", "mutableFetching", "mutableFlight", "loadFlight", "", "flightId", "", "saveOrUpdateFlight", "name", "isFull", "noPassengers", "", "dateOfFlight", "app_debug"})
public final class FlightEditViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.deenoo.airport.data.Flight> mutableFlight = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> mutableFetching = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> mutableCompleted = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Exception> mutableException = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.deenoo.airport.data.Flight> flight = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> fetching = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Exception> fetchingError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> completed = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.deenoo.airport.data.Flight> getFlight() {
        return null;
    }
    
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
    
    public final void loadFlight(@org.jetbrains.annotations.NotNull()
    java.lang.String flightId) {
    }
    
    public final void saveOrUpdateFlight(@org.jetbrains.annotations.NotNull()
    java.lang.String name, boolean isFull, int noPassengers, @org.jetbrains.annotations.NotNull()
    java.lang.String dateOfFlight) {
    }
    
    public FlightEditViewModel() {
        super();
    }
}