/*
 * LoginUseCase.kt
 * Cleania Android
 * Created by isai.garcia on 6/22/19 12:50 AM
 */

package com.mosso.cleania.login.domain

import com.mosso.cleania.login.contract.LoginContract
import com.mosso.cleania.login.models.request.LoginRequest
import com.mosso.cleania.login.models.response.LoginResponse
import com.mosso.cleania.shared.PostExecutionThread
import com.mosso.cleania.shared.SingleUseCase
import com.mosso.cleania.shared.ThreadExecutor
import com.mosso.masterchef.shared.domain.Transform
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers


class LoginUseCase(
    private val threadExecutor: ThreadExecutor,
    private val postExecutionThread: PostExecutionThread,
    private val loginRepository: LoginContract.Repository,
    private val mapper: Transform<com.mosso.cleania.login.data.models.LoginResponse, LoginResponse>
) : SingleUseCase<LoginRequest, LoginResponse>(threadExecutor, postExecutionThread) {

    override fun buildUseCase(params: LoginRequest?): Single<LoginResponse> {
        return params?.let {
            loginRepository.loginAttempt(params)
                .map { loginResponseDomain ->
                    return@map mapper.transform(loginResponseDomain)
                }
                .subscribeOn(Schedulers.from(threadExecutor))
                .observeOn(postExecutionThread.getScheduler())
        } ?: Single.error(LoginUseCaseException.GeneralException())
    }

    data class Params(val loginRequest: LoginRequest)

    sealed class LoginUseCaseException {
        class GeneralException : Exception()

    }
}