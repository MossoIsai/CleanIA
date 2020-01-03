/*
 * LoginResponse.kt
 * Cleania Android
 * Created by isai.garcia on 6/22/19 3:10 PM
 */

package com.mosso.cleania.login.domain.models


data class LoginResponse(
    var userId: Int?,
    var nameComplete: String?,
    var email: String?,
    var code: Int?,
    var estatus: Boolean?,
    var message: String?
)