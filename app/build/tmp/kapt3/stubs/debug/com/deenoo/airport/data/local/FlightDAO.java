package com.deenoo.airport.data.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\n\u001a\u00020\bH\'J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/deenoo/airport/data/local/FlightDAO;", "", "getAll", "Landroidx/lifecycle/LiveData;", "", "Lcom/deenoo/airport/data/Flight;", "getAllByUserId", "userID", "", "getById", "id", "insert", "", "flight", "(Lcom/deenoo/airport/data/Flight;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "app_debug"})
public abstract interface FlightDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM flights")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.deenoo.airport.data.Flight>> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM flights WHERE userId=:userID")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.deenoo.airport.data.Flight>> getAllByUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String userID);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM flights WHERE _id=:id")
    public abstract androidx.lifecycle.LiveData<com.deenoo.airport.data.Flight> getById(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.deenoo.airport.data.Flight flight, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object update(@org.jetbrains.annotations.NotNull()
    com.deenoo.airport.data.Flight flight, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}