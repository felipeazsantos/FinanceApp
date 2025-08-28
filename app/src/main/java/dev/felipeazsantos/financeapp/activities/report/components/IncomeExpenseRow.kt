package dev.felipeazsantos.financeapp.activities.report.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import dev.felipeazsantos.financeapp.R

@Composable
fun IncomeExpenseRow() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            InfoItem(
                icon = R.drawable.income,
                title = "Income",
                amount = "$8,949.22",
                titleColor = colorResource(id = R.color.darkBlue),
                amountColor = colorResource(id = R.color.green)
            )

            InfoItem(
                icon = R.drawable.expense,
                title = "Expense",
                amount = "$2,545.87",
                titleColor = colorResource(id = R.color.darkBlue),
                amountColor = colorResource(id = R.color.red)
            )
        }
    }
}