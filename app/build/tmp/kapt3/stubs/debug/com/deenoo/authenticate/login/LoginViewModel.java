package com.deenoo.authenticate.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0012H\u0002J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/deenoo/authenticate/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "loginFormState", "Landroidx/lifecycle/LiveData;", "Lcom/deenoo/authenticate/login/LoginFormState;", "getLoginFormState", "()Landroidx/lifecycle/LiveData;", "loginResult", "Lcom/deenoo/core/Result;", "Lcom/deenoo/authenticate/data/TokenHolder;", "getLoginResult", "mutableLoginFormState", "Landroidx/lifecycle/MutableLiveData;", "mutableLoginResult", "isPasswordValid", "", "password", "", "isUserNameValid", "username", "login", "", "loginDataChanged", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.deenoo.authenticate.login.LoginFormState> mutableLoginFormState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.deenoo.authenticate.login.LoginFormState> loginFormState = null;
    private final androidx.lifecycle.MutableLiveData<com.deenoo.core.Result<com.deenoo.authenticate.data.TokenHolder>> mutableLoginResult = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.deenoo.core.Result<com.deenoo.authenticate.data.TokenHolder>> loginResult = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.deenoo.authenticate.login.LoginFormState> getLoginFormState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.deenoo.core.Result<com.deenoo.authenticate.data.TokenHolder>> getLoginResult() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void loginDataChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    private final boolean isUserNameValid(java.lang.String username) {
        return false;
    }
    
    private final boolean isPasswordValid(java.lang.String password) {
        return false;
    }
    
    public LoginViewModel() {
        super();
    }
}