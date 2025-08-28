package dev.felipeazsantos.financeapp.activities.dashboard.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.felipeazsantos.financeapp.R

@Composable
fun BottomNavigationBar(
    onItemSelected: (Int) -> Unit,
    modifier: Modifier
) {
    NavigationBar(
        containerColor = colorResource(id = R.color.lightBlue),
        modifier = modifier
            .fillMaxWidth()
            .height(80.dp)
    ){
        NavigationBarItem(
            selected = true,
            onClick = { onItemSelected(R.id.wallet) },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.wallet),
                    contentDescription = "Wallet bottom menu"
                )
            },
            label = {
                Text(text = stringResource(id = R.string.home))
            }
        )

        NavigationBarItem(
            selected = false,
            onClick = { onItemSelected(R.id.market) },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.market),
                    contentDescription = "Wallet bottom menu"
                )
            },
            label = {
                Text(text = stringResource(id = R.string.market))
            }
        )

        NavigationBarItem(
            selected = false,
            onClick = { onItemSelected(R.id.trade) },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.trade),
                    contentDescription = "Wallet bottom menu"
                )
            },
            label = {
                Text(text =stringResource(id = R.string.trade))
            }
        )

        NavigationBarItem(
            selected = false,
            onClick = { onItemSelected(R.id.futures) },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.futures),
                    contentDescription = "Wallet bottom menu"
                )
            },
            label = {
                Text(text =stringResource(id = R.string.futures))
            }
        )

        NavigationBarItem(
            selected = false,
            onClick = { onItemSelected(R.id.profile) },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Wallet bottom menu"
                )
            },
            label = {
                Text(text = stringResource(id = R.string.profile))
            }
        )
    }
}

@Preview
@Composable
fun BottomNavigationBarPreview() {
    BottomNavigationBar(
        onItemSelected = {},
        Modifier
            .fillMaxWidth()
            .height(80.dp)
    )
}