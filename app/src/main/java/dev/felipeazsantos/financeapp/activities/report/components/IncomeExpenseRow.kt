package dev.felipeazsantos.financeapp.activities.report.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

@Composable
fun InfoItem(
    icon: Int,
    title: String,
    amount: String,
    titleColor: Color,
    amountColor: Color
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = null
            )

            Text(
                text = title,
                color = titleColor,
                fontWeight = FontWeight.Bold,
                fontSize = 19.sp,
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        Text(
            text = amount,
            color = amountColor,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}