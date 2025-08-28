package dev.felipeazsantos.financeapp.domain

import java.io.Serializable

data class BudgetDomain(
    val title: String,
    val price: Double = 0.0,
    val percent: Double = 0.0
) : Serializable
