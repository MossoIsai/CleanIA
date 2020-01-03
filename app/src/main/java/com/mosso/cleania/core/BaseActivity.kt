/*
 * BaseActivity.kt
 * Cleania Android
 * Created by isai.garcia on 6/21/19 11:06 AM
 */

package com.mosso.cleania.core

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


abstract class BaseActivity: AppCompatActivity() {

   abstract fun getLayoutId() : Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
    }

}