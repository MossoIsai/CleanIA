/*
 * LoginContract.kt
 * Cleania Android
 * Created by isai.garcia on 6/21/19 11:18 AM
 */

package com.mosso.cleania.login.contract

import com.mosso.cleania.login.data.models.LoginResponse
import com.mosso.cleania.login.models.request.LoginRequest
import io.reactivex.Single


interface LoginContract {

    interface View {
        fun showLoader()
        fun hideLoader()
        fun showError()
    }

    interface Presenter {
        fun loginAttempt(user: String, password: String)
        fun stop()
    }

    interface Repository{
        fun loginAttempt(loginRequest: LoginRequest): Single<LoginResponse>
    }

}

