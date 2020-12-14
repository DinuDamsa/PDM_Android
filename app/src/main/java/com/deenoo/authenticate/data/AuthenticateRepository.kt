package com.deenoo.authenticate.data

import android.util.Log
import com.deenoo.authenticate.data.remote.RemoteAuthDataSource
import com.deenoo.core.Api
import com.deenoo.core.Constants
import com.deenoo.core.Result

object AuthenticateRepository {
    var user: User? = null
        private set

    val isLoggedIn: Boolean
        get() = user != null

    init {
        user = null
    }

    fun logout() {
        user = null
        Api.tokenInterceptor.token = null
        Constants.instance()?.deleteValueString("token")
        Constants.instance()?.deleteValueString("_id")
    }

    suspend fun login(username: String, password: String): Result<TokenHolder> {
        val user = User(username, password)
        val result = RemoteAuthDataSource.login(user)
        if (result is Result.Success<TokenHolder>) {
            setLoggedInUser(user, result.data)
            Constants.instance()?.storeValueString("token",result.data.token)
            Constants.instance()?.storeValueString("_id", result.data._id)
        }
        return result
    }

    private fun setLoggedInUser(user: User, tokenHolder: TokenHolder) {
        this.user = user
        Api.tokenInterceptor.token = tokenHolder.token
    }
}
