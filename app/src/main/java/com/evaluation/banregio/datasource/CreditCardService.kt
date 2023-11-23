package com.evaluation.banregio.datasource

import com.evaluation.banregio.model.CreditCard

interface CreditCardService {

    suspend fun fetchCreditCard() : CreditCard
}