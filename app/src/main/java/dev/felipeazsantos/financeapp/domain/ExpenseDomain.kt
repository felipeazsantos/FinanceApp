package dev.felipeazsantos.financeapp.domain

import java.io.Serializable

data class ExpenseDomain(
    val title: String = "",
    val price: Double = 0.0,
    val pic: String = "",
    val time: String = ""
) : Serializable
