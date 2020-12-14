package com.deenoo.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\n \t*\u0004\u0018\u00010\u000b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/deenoo/core/Api;", "", "()V", "URL", "", "client", "Lokhttp3/OkHttpClient;", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "tokenInterceptor", "Lcom/deenoo/core/TokenInterceptor;", "getTokenInterceptor", "()Lcom/deenoo/core/TokenInterceptor;", "app_debug"})
public final class Api {
    private static final java.lang.String URL = "http://192.168.0.80:3000/";
    @org.jetbrains.annotations.NotNull()
    private static final com.deenoo.core.TokenInterceptor tokenInterceptor = null;
    private static final okhttp3.OkHttpClient client = null;
    private static com.google.gson.Gson gson;
    private static final retrofit2.Retrofit retrofit = null;
    public static final com.deenoo.core.Api INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.deenoo.core.TokenInterceptor getTokenInterceptor() {
        return null;
    }
    
    public final retrofit2.Retrofit getRetrofit() {
        return null;
    }
    
    private Api() {
        super();
    }
}