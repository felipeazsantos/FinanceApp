package dev.felipeazsantos.financeapp.viewmodel

import androidx.lifecycle.ViewModel
import dev.felipeazsantos.financeapp.repository.MainRepository

class MainViewModel(val repository: MainRepository) : ViewModel() {
    constructor() : this(MainRepository())

    fun loadData() = repository.items
    fun loadBugets() = repository.budgets
}