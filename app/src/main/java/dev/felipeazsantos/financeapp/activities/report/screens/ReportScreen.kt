package dev.felipeazsantos.financeapp.activities.report.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.felipeazsantos.financeapp.R
import dev.felipeazsantos.financeapp.activities.report.components.CenterStatsCard
import dev.felipeazsantos.financeapp.activities.report.components.GradientHeader
import dev.felipeazsantos.financeapp.activities.report.components.SummaryColumns
import dev.felipeazsantos.financeapp.domain.BudgetDomain
import dev.felipeazsantos.financeapp.ui.theme.FinanceAppTheme

@Composable
fun ReportScreen(
    budgets: List<BudgetDomain>,
    onBack: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        ReportContent(
            budgets = budgets,
            onBack = onBack
        )
    }
}

@Composable
fun ReportContent(
    budgets: List<BudgetDomain>,
    modifier: Modifier = Modifier,
    onBack: () -> Unit
) {
    LazyColumn(
        modifier = modifier
            .background(Color.White)
    ) {
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                GradientHeader(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp),
                    onBack = onBack
                )

                CenterStatsCard(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(horizontal = 24.dp)
                        .padding(top = 150.dp, bottom = 32.dp)
                )
            }
        }

        item { SummaryColumns(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .background(
                    color = colorResource(id = R.color.lightBlue),
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(8.dp)
        ) }
    }
}

@Preview(showBackground = true)
@Composable
private fun ReportScreenPreview() {
    val budgets = listOf(
        BudgetDomain(
            title = "Groceries",
            price = 400.0,
            percent = 50.0
        ),
        BudgetDomain(
            title = "Entertainment",
            price = 230.0,
            percent = 20.0
        ),
        BudgetDomain(
            title = "Transport",
            price = 75.0,
            percent = 10.0)
    )

    FinanceAppTheme {
        ReportScreen(
            budgets = budgets, onBack = {}
        )
    }
}