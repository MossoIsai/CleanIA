/*
 * LoginResponse.kt
 * Cleania Android
 * Created by isai.garcia on 6/22/19 12:56 AM
 */

package com.mosso.cleania.login.models.response


data class LoginResponse(
    var userId: Int?,
    var nameComplete: String?,
    var email: String?,
    var code: Int?,
    var estatus: Boolean?,
    var message: String?
)