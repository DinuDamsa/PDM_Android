package com.deenoo.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u001a\u0010\u001b\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001e"}, d2 = {"Lcom/deenoo/core/Constants;", "", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "sharedPref", "Landroid/content/SharedPreferences;", "getSharedPref", "()Landroid/content/SharedPreferences;", "setSharedPref", "(Landroid/content/SharedPreferences;)V", "sharedPrefEditor", "Landroid/content/SharedPreferences$Editor;", "getSharedPrefEditor", "()Landroid/content/SharedPreferences$Editor;", "setSharedPrefEditor", "(Landroid/content/SharedPreferences$Editor;)V", "configSessionUtils", "", "deleteValueString", "key", "", "fetchValueString", "storeValueString", "value", "Companion", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.Nullable()
    private android.content.Context context;
    @org.jetbrains.annotations.Nullable()
    private android.content.SharedPreferences sharedPref;
    @org.jetbrains.annotations.Nullable()
    private android.content.SharedPreferences.Editor sharedPrefEditor;
    @org.jetbrains.annotations.Nullable()
    private static com.deenoo.core.Constants _instance;
    public static final com.deenoo.core.Constants.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.Nullable()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.SharedPreferences getSharedPref() {
        return null;
    }
    
    public final void setSharedPref(@org.jetbrains.annotations.Nullable()
    android.content.SharedPreferences p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.SharedPreferences.Editor getSharedPrefEditor() {
        return null;
    }
    
    public final void setSharedPrefEditor(@org.jetbrains.annotations.Nullable()
    android.content.SharedPreferences.Editor p0) {
    }
    
    public final void configSessionUtils(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void storeValueString(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fetchValueString(@org.jetbrains.annotations.Nullable()
    java.lang.String key) {
        return null;
    }
    
    public final void deleteValueString(@org.jetbrains.annotations.Nullable()
    java.lang.String key) {
    }
    
    public Constants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/deenoo/core/Constants$Companion;", "", "()V", "_instance", "Lcom/deenoo/core/Constants;", "get_instance", "()Lcom/deenoo/core/Constants;", "set_instance", "(Lcom/deenoo/core/Constants;)V", "instance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.deenoo.core.Constants get_instance() {
            return null;
        }
        
        public final void set_instance(@org.jetbrains.annotations.Nullable()
        com.deenoo.core.Constants p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.deenoo.core.Constants instance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.deenoo.core.Constants instance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}