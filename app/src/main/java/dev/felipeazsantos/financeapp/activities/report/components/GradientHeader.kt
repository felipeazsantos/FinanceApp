package dev.felipeazsantos.financeapp.activities.report.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.felipeazsantos.financeapp.R

@Composable
fun GradientHeader(
    modifier: Modifier = Modifier,
    onBack: () -> Unit
) {
    Column(
        modifier = modifier
            .background(
                Brush.linearGradient(
                    colors = listOf(colorResource(id = R.color.lightBlue),
                        Color.Blue,
                        colorResource(id = R.color.mediumBlue)
                    ),
                    start = Offset(0f, 0f),
                    end = Offset(1000f, 600f)
                ),
                shape = RoundedCornerShape(bottomStart = 30.dp, bottomEnd = 30.dp)
            )
            .padding(start = 16.dp, top = 48.dp)
    ) {
        Row (
//            modifier = Modifier
//                .fillMaxWidth(),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = onBack,
                modifier = Modifier
                    .size(48.dp)
                    .padding(16.dp),
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.arrow),
                    contentDescription = "",
                    tint = Color.White
                )
            }

            Text(
                text = "Monthly Report",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 19.sp,
                modifier = Modifier
            )
        }


    }
}

@Preview(showBackground = true)
@Composable
fun GradientHeaderPreview() {
    GradientHeader {  }
}