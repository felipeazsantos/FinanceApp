package dev.felipeazsantos.financeapp.activities.report

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import dev.felipeazsantos.financeapp.activities.report.screens.ReportScreen
import dev.felipeazsantos.financeapp.viewmodel.MainViewModel


class ReportActivity : ComponentActivity() {
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ReportScreen(
                budgets = mainViewModel.loadBugets(),
                onBack = { finish() }
            )
        }
    }
}