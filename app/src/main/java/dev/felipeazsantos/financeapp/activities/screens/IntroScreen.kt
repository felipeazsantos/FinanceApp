package dev.felipeazsantos.financeapp.activities.screens

import android.view.Surface
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.felipeazsantos.financeapp.R

@Composable
@Preview(showBackground = true)
fun IntroScreen(
    onStartClick: () -> Unit = {}
) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.intro_pic),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .padding(start = 32.dp, bottom = 48.dp)
        ) {
            Text(
                text = "The Best App to\nmanage your \nmoney",
                color = Color.White,
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 32.dp)
            )

            Box(
                modifier = Modifier
                    .width(135.dp)
                    .height(50.dp)
                    .border(
                        width = 2.dp,
                        color = Color.White,
                        shape = RoundedCornerShape( 12.dp)
                    )
                    .background(
                        color = Color.Transparent,
                        shape = RoundedCornerShape(12.dp)
                    )
                    .clickable {
                        onStartClick()
                    },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Get Started",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 22.sp
                )
            }
        }


    }
}