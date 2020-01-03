/*
 * LoginRepository.kt
 * Cleania Android
 * Created by isai.garcia on 6/21/19 11:12 AM
 */

package com.mosso.cleania.login.data

import com.mosso.cleania.login.contract.LoginContract
import com.mosso.cleania.login.models.response.LoginResponse
import io.reactivex.Single

class LoginRepository: LoginContract.Repository{

    override fun loginAttempt(user: String, password: String): Single<LoginResponse> {

    }

}

