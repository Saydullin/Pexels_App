package com.saydullin.pexelsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.saydullin.pexelsapp.screens.HomeScreen
import com.saydullin.pexelsapp.ui.theme.PexelTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            PexelTheme {
                HomeScreen()
            }
        }

    }
}


