package dev.felipeazsantos.financeapp.repository

import dev.felipeazsantos.financeapp.domain.BudgetDomain
import dev.felipeazsantos.financeapp.domain.ExpenseDomain

class MainRepository {
    val items = mutableListOf(
        ExpenseDomain("Restaurant", 213.47, "restaurant", "15 jun 2025 18:20"),
        ExpenseDomain("McDonald", 120.88, "mcdonald", "18 jun 2025 12:33"),
        ExpenseDomain("Cinema", 80.40, "cinema", "18 jun 2025 14:15"),
        ExpenseDomain("Restaurant", 103.57, "restaurant", "16 jun 2025 18:47")
    )

    val budgets = mutableListOf(
        BudgetDomain("Home Load", 1200.0, 80.0),
        BudgetDomain("Subscription", 550.0, 10.0),
        BudgetDomain("Car Loan", 900.0, 30.0)
    )
}