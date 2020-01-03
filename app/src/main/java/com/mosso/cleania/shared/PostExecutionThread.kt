/*
 * PostExecutionThread.kt
 * Cleania Android
 * Created by isai.garcia on 6/21/19 12:51 PM
 */

package com.mosso.cleania.shared

import io.reactivex.Scheduler


interface PostExecutionThread {
    fun getScheduler(): Scheduler
}