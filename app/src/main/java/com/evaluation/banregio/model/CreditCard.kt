package com.evaluation.banregio.model

data class CreditCard(
    val pkTarjetaCreditoID: Int,
    val Nombre_Banco: String,
    val Numero_Tarjeta: String,
    val Titular_Tarjeta: String,
    val Fecha_Exp: String,
    val CVV: Int,
    val Monto: Float
    )
