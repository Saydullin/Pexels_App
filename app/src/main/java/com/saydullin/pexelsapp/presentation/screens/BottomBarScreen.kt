package com.saydullin.pexelsapp.presentation.screens

import com.saydullin.pexelsapp.R

sealed class Screen(
    val route: String,
    val title: String,
    val icon: Int,
    val activeIcon: Int
) {
    object Home : Screen(
        route = "home",
        title = "Home",
        icon = R.drawable.home_icon,
        activeIcon = R.drawable.home_screen_active
    )
    object Bookmark : Screen(
        route = "bookmark",
        title = "Bookmark",
        icon = R.drawable.bookmark_icon,
        activeIcon = R.drawable.bookmark_screen_active
    )
}


