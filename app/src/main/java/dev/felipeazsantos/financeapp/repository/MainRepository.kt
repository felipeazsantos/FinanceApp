package dev.felipeazsantos.financeapp.repository

import dev.felipeazsantos.financeapp.domain.ExpenseDomain

class MainRepository {
    val items = mutableListOf(
        ExpenseDomain("Restaurant", 57.12, "img1", "15 jun 2025 18:20"),
        ExpenseDomain("Restaurant", 57.12, "img2", "18 jun 2025 12:33"),
        ExpenseDomain("Restaurant", 57.12, "img3", "18 jun 2025 14:15"),
        ExpenseDomain("Restaurant", 57.12, "img4", "16 jun 2025 18:47")
    )
}