package dev.felipeazsantos.financeapp.activities.dashboard.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.felipeazsantos.financeapp.activities.dashboard.components.ActionButtonRow
import dev.felipeazsantos.financeapp.activities.dashboard.components.CardSection
import dev.felipeazsantos.financeapp.activities.dashboard.components.HeaderSection
import dev.felipeazsantos.financeapp.domain.ExpenseDomain

@Composable
@Preview(showBackground = true)
fun MainScreenPreview() {
    val expenses = listOf(
        ExpenseDomain("Restaurant", 213.47, "img1", "15 jun 2025 18:20"),
        ExpenseDomain("McDonald", 120.88, "img2", "18 jun 2025 12:33"),
        ExpenseDomain("Cinema", 80.40, "img3", "18 jun 2025 14:15"),
        ExpenseDomain("Restaurant", 103.57, "img1", "16 jun 2025 18:47")
    )
    
    MainScreen(
        onCardClick = {},
        expenses = expenses
    )
}

@Composable
fun MainScreen(
    onCardClick: () -> Unit = {},
    expenses: List<ExpenseDomain>
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 70.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ){
            item { HeaderSection() }
            item { CardSection(onClick = onCardClick) }
            item { ActionButtonRow() }
        }
    }
}