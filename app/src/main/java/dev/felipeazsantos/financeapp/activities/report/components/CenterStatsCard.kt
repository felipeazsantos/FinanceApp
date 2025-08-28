package dev.felipeazsantos.financeapp.activities.report.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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

@Composable
fun CenterStatsCard(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .background(Color.White, shape = RoundedCornerShape(24.dp))
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = RoundedCornerShape(24.dp)
            )
            .padding(12.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(175.dp)
                .padding(top = 16.dp)
        ) {
            CircularProgressBar(
                progress = 60f,
                max = 100f,
                color = colorResource(id = R.color.blue),
                backgroundColor = colorResource(id = R.color.lightGrey),
                stroke = 15.dp,
                modifier = Modifier
                    .fillMaxSize()
            )

            Row(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "$7,233.56",
                    color = colorResource(id = R.color.darkBlue),
                    fontWeight = FontWeight.Bold,
                    fontSize = 21.sp
                )

                Text(
                    text = "Total",
                    color = colorResource(id = R.color.darkBlue),
                )
            }
        }

        IncomeExpenseRow()
    }
}

@Preview
@Composable
fun CenterStatsCardPreview() {
    CenterStatsCard()
}