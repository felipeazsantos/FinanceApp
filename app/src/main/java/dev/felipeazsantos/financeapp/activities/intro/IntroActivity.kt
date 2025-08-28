package dev.felipeazsantos.financeapp.activities.intro

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dev.felipeazsantos.financeapp.activities.dashboard.MainActivity
import dev.felipeazsantos.financeapp.activities.intro.screens.IntroScreen

class IntroActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IntroScreen(
                onStartClick = {
                    startActivity(Intent(this, MainActivity::class.java))
                }
            )
        }
    }
}