package com.evaluation.banregio.datasource

import com.evaluation.banregio.model.Transaction

interface TransactionService {
    suspend fun fetchTransaction() : List<Transaction>
}