package com.evaluation.banregio.ui.theme.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.evaluation.banregio.datasource.CreditCardService
import com.evaluation.banregio.datasource.TransactionService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val creditCardService: CreditCardService,
    private val transactionService: TransactionService
): ViewModel(){

    private val _creditCardNumber = MutableLiveData<String>()
    val creditCardNumber : LiveData<String> = _creditCardNumber

    private val _bankName = MutableLiveData<String>()
    val bankname : LiveData<String> = _bankName

    private val _cardOwner = MutableLiveData<String>()
    val cardOwner : LiveData<String> = _cardOwner

    private val _dateExpiration = MutableLiveData<String>()
    val dateExpiration : LiveData<String> = _dateExpiration

     fun fetchCreditCard() {
        viewModelScope.launch (Dispatchers.IO) {
            creditCardService.fetchCreditCard()
        }

    }

    fun fetchtransactionService() {
        viewModelScope.launch (Dispatchers.IO) {
            transactionService.fetchTransaction()
        }
    }
}