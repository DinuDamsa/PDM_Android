package com.deenoo.authenticate.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/deenoo/authenticate/data/remote/RemoteAuthDataSource;", "", "()V", "authService", "Lcom/deenoo/authenticate/data/remote/RemoteAuthDataSource$AuthService;", "login", "Lcom/deenoo/core/Result;", "Lcom/deenoo/authenticate/data/TokenHolder;", "user", "Lcom/deenoo/authenticate/data/User;", "(Lcom/deenoo/authenticate/data/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AuthService", "app_debug"})
public final class RemoteAuthDataSource {
    private static final com.deenoo.authenticate.data.remote.RemoteAuthDataSource.AuthService authService = null;
    public static final com.deenoo.authenticate.data.remote.RemoteAuthDataSource INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull()
    com.deenoo.authenticate.data.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.deenoo.core.Result<com.deenoo.authenticate.data.TokenHolder>> p1) {
        return null;
    }
    
    private RemoteAuthDataSource() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/deenoo/authenticate/data/remote/RemoteAuthDataSource$AuthService;", "", "login", "Lcom/deenoo/authenticate/data/TokenHolder;", "user", "Lcom/deenoo/authenticate/data/User;", "(Lcom/deenoo/authenticate/data/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static abstract interface AuthService {
        
        @org.jetbrains.annotations.Nullable()
        @retrofit2.http.POST(value = "/api/auth/login")
        @retrofit2.http.Headers(value = {"Content-Type: application/json"})
        public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Body()
        com.deenoo.authenticate.data.User user, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super com.deenoo.authenticate.data.TokenHolder> p1);
    }
}