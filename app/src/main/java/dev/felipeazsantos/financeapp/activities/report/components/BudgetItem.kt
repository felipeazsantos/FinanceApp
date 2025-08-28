package dev.felipeazsantos.financeapp.activities.report.components

import android.icu.text.DecimalFormat
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.felipeazsantos.financeapp.R
import dev.felipeazsantos.financeapp.domain.BudgetDomain

@Composable
fun BudgetItem(
    budget: BudgetDomain,
    index: Int
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(110.dp)
            .background(Color.White, RoundedCornerShape(16.dp))
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(16.dp)
    ) {
        val indexColor = if ((index % 2) == 1) colorResource(id = R.color.blue)
                            else colorResource(id = R.color.pink)

        Row {
            Box(
                modifier = Modifier
                    .height(110.dp)
            ) {
                CircularProgressBar(
                    progress = budget.percent.toFloat(),
                    max = 100f,
                    color = indexColor,
                    backgroundColor = colorResource(id = R.color.lightGrey),
                    stroke = 7.dp,
                    modifier = Modifier
                        .size(70.dp)
                )

                Column(
                    modifier = Modifier
                        .padding(bottom = 6.dp)
                        .fillMaxHeight()
                        .width(68.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "$${budget.percent}",
                        color = indexColor,
                    )
                }

            }


            Column(
                verticalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier
                    .padding(top = 8.dp, start = 8.dp)
            ) {
                Text(
                    text = budget.title,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )

                Text(
                    text = "$${DecimalFormat("###,###,###,###").format(budget.price)} /Month",
                    color = colorResource(id = R.color.grey)
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun BudgetItemPreview() {
    val budget = BudgetDomain(title = "Food", price = 100.0, percent = 50.0)
    BudgetItem(budget, 0)
}