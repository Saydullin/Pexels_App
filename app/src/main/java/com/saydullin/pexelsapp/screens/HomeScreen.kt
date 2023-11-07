package com.saydullin.pexelsapp.screens

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen() {

    Surface {
        Text(
            text = "Hello, Saydullin!",
            color = colorScheme.primary,
            style = typography.titleLarge
        )
    }

}


