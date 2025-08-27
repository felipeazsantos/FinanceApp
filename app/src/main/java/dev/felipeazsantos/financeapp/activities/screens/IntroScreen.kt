package dev.felipeazsantos.financeapp.activities.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import dev.felipeazsantos.financeapp.R

@Composable
@Preview(showBackground = true)
fun IntroScreen(
    onStartClick: () -> Unit = {}
) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (image, btn, title) = createRefs()
        Image(
            painter = painterResource(id = R.drawable.intro_pic),
            contentDescription = ""
        )
    }
}