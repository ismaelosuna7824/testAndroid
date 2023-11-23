package com.evaluation.banregio.service

import android.util.Log
import com.evaluation.banregio.datasource.RestDataSource
import com.evaluation.banregio.datasource.TransactionService
import com.evaluation.banregio.model.Transaction
import javax.inject.Inject

class TransactionServiceImp @Inject constructor(
    private val dataSource: RestDataSource
) : TransactionService {
    override suspend fun fetchTransaction(): List<Transaction> {
        Log.d("prueba", "fetchCreditCard: " + dataSource.getTransaction())
        // Obtener la lista de transacciones desde el dataSource
        val transactionList = dataSource.getTransaction().map {
            // Mapear los datos del dataSource a objetos Transaction
            Transaction(
                pkMovimientosID = it.pkMovimientosID,
                Descripcion = it.Descripcion,
                Fecha = it.Fecha,
                Monto = it.Monto
            )
        }

        return transactionList
    }
}