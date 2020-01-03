/*
 * LoginPresenter.kt
 * Cleania Android
 * Created by isai.garcia on 6/22/19 12:49 AM
 */

package com.mosso.cleania.login.presentation.presenter

import com.mosso.cleania.login.contract.LoginContract
import com.mosso.cleania.login.domain.LoginUseCase
import com.mosso.cleania.login.models.request.LoginRequest
import io.reactivex.disposables.CompositeDisposable


class LoginPresenter(
    private val view: LoginContract.View,
    private val loginUseCase: LoginUseCase
) : LoginContract.Presenter {

    private val disposable = CompositeDisposable()


    override fun loginAttempt(user: String, password: String) {
        view.showLoader()
        disposable.add(
            loginUseCase.execute(LoginRequest(user, password))
                .subscribe()
        )

    }

    override fun stop() {

    }


}