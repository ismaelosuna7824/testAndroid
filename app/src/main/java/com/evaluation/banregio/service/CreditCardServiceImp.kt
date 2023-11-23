package com.evaluation.banregio.service

import android.util.Log
import com.evaluation.banregio.datasource.CreditCardService
import com.evaluation.banregio.datasource.RestDataSource
import com.evaluation.banregio.model.CreditCard
import javax.inject.Inject

class CreditCardServiceImp @Inject constructor(
    private val dataSource: RestDataSource
) : CreditCardService {
    override suspend fun fetchCreditCard(): CreditCard {
        Log.d("prueba", "fetchCreditCard: " + dataSource.getCreditCard().Titular_Tarjeta)
        return dataSource.getCreditCard()
    }
}