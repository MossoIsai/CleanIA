/*
 * LoginResponse.kt
 * Cleania Android
 * Created by isai.garcia on 6/22/19 3:11 PM
 */

package com.mosso.cleania.login.data.models

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("Id") var userId: Int?,
    @SerializedName("NombreCompleto") var nameComplete: String?,
    @SerializedName("Email") var email: String?,
    @SerializedName("Password") var password: String?,
    @SerializedName("Ubicacion") var location: String?,
    @SerializedName("Saldo") var balance: Double?,
    @SerializedName("TotalCharola") var tray: Int?,
    @SerializedName("Codigo") var code: Int?,
    @SerializedName("Estatus") var estatus: Boolean?,
    @SerializedName("Mensaje") var message: String?
)