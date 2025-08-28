package dev.felipeazsantos.financeapp.activities.dashboard

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.felipeazsantos.financeapp.activities.dashboard.screens.MainScreen
import dev.felipeazsantos.financeapp.activities.report.ReportActivity
import dev.felipeazsantos.financeapp.ui.theme.FinanceAppTheme
import dev.felipeazsantos.financeapp.viewmodel.MainViewModel
import kotlin.getValue

class MainActivity : ComponentActivity() {
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FinanceAppTheme {
                MainScreen(
                    expenses = mainViewModel.loadData(),
                    onCardClick = {
                        startActivity(Intent(this, ReportActivity::class.java))
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FinanceAppPreview() {
    FinanceAppTheme {
        MainScreen(
            expenses = listOf()
        )
    }
}