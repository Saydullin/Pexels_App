package com.saydullin.pexelsapp.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.saydullin.pexelsapp.presentation.screens.HomeScreen
import com.saydullin.pexelsapp.presentation.ui.theme.PexelTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
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


