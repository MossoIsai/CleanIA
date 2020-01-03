/*
 * UseCase.kt
 * Cleania Android
 * Created by isai.garcia on 6/21/19 12:15 PM
 */

package com.mosso.cleania.shared

import io.reactivex.disposables.Disposable


abstract class UseCase<Params, R : Any> {

    private var disposable: Disposable? = null

    protected abstract fun buildUseCase(params: Params? = null): R

    fun dispose() {
        disposable?.let {
            if (!it.isDisposed) {
                it.dispose()
            }
        }
    }

    protected fun subscribe(subscription: Disposable? = null) {
        disposable = subscription
    }

}