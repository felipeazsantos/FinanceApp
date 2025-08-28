package dev.felipeazsantos.financeapp.activities.report.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
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
fun SummaryColumns(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.height(IntrinsicSize.Min),
        verticalAlignment = Alignment.CenterVertically,
    ){
        SummaryColumn(
            title = "Total Balance",
            value = "$8,576.32",
            percent = "+25%",
            percentColor = colorResource(id = R.color.green),
            modifier = Modifier.weight(1f)
        )
        VerticalDivider()

        SummaryColumn(
            title = "Income",
            value = "$3,225.45",
            percent = "-10%",
            percentColor = colorResource(id = R.color.red),
            modifier = Modifier.weight(1f)
        )
        VerticalDivider()

        SummaryColumn(
            title = "Saving",
            value = "$2,387.50",
            percent = "+16%",
            percentColor = colorResource(id = R.color.green),
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
fun SummaryColumn(
    title: String,
    value: String,
    percent: String,
    percentColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(
                horizontal = 8.dp,
                vertical = 4.dp,
            )
    ) {
        Text(
            text = title,
            color = colorResource(id = R.color.darkBlue)
        )

        Text(
            text = value,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 19.sp,
            modifier = Modifier
                .padding(vertical = 4.dp)
        )

        Text(
            text = percent,
            color = percentColor
        )
    }
}

@Preview
@Composable
fun SummaryColumnsPreview() {
    SummaryColumns()
}