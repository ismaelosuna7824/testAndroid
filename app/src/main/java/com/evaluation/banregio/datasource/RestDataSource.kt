package com.evaluation.banregio.datasource

import com.evaluation.banregio.model.CreditCard
import com.evaluation.banregio.model.Transaction
import retrofit2.http.GET

interface RestDataSource {
    @GET("/rest/tarjetacredito.php/1")
    suspend fun getCreditCard() : CreditCard

    @GET("/rest/tarjetacredito-movimientos.php/3")
    suspend fun getTransaction() : List<Transaction>
}