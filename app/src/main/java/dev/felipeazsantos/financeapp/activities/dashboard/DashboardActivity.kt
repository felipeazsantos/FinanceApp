package dev.felipeazsantos.financeapp.activities.dashboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import dev.felipeazsantos.financeapp.ui.theme.FinanceAppTheme

class DashboardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FinanceAppTheme {
                Scaffold() { }
            }
        }
    }
}