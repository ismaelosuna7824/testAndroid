package com.evaluation.banregio.di

import com.evaluation.banregio.datasource.CreditCardService
import com.evaluation.banregio.datasource.TransactionService
import com.evaluation.banregio.service.CreditCardServiceImp
import com.evaluation.banregio.service.TransactionServiceImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun creditCardService(repo: CreditCardServiceImp) : CreditCardService

    @Singleton
    @Binds
    abstract fun transactionService(repo: TransactionServiceImp) : TransactionService
}