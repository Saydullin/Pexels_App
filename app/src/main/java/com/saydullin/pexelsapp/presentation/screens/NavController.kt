package com.saydullin.pexelsapp.presentation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Scaffold
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@SuppressLint("UseCompatLoadingForDrawables")
@Composable
fun NavController() {

    val navController = rememberNavController()
    val items = listOf(
        Screen.Home,
        Screen.Bookmark
    )

    Scaffold(
        bottomBar = {
            BottomNavigation {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination

                items.forEach { screen ->
                    val isSelected = currentDestination?.route == screen.route
                    BottomNavigationItem(
                        modifier = Modifier
                            .background(Color.White),
                        icon = {
                            Icon(
                                painter = if (isSelected) {
                                    painterResource(screen.activeIcon)
                                } else {
                                    painterResource(screen.icon)
                                },
                                contentDescription = screen.title,
                                tint = if (isSelected) {
                                    MaterialTheme.colorScheme.primary
                                } else {
                                    MaterialTheme.colorScheme.onSurface
                                }
                            )
                        },
                        selected = isSelected,
                        onClick = {
                            navController.navigate(screen.route)
                        }
                    )
                }
            }
        }
    ) { padding ->
        NavHost(
            modifier = Modifier
                .padding(bottom = padding.calculateBottomPadding()),
            navController = navController,
            startDestination = "home"
        ) {
            composable("home") {
                HomeScreen()
            }
            composable("bookmark") {
                BookmarkScreen()
            }
        }
    }

}


