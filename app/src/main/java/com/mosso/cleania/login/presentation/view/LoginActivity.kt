/*
 * LoginActivity.kt
 * Cleania Android
 * Created by isai.garcia on 6/21/19 11:05 AM
 */

package com.mosso.cleania.login.presentation.view

import android.os.Bundle
import com.mosso.cleania.R
import com.mosso.cleania.core.BaseActivity
import com.mosso.cleania.login.contract.LoginContract


class LoginActivity: BaseActivity(), LoginContract.View {


    override fun getLayoutId(): Int = R.layout.login_activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun showLoader() {

    }

    override fun hideLoader() {

    }

    override fun showError() {

    }

}