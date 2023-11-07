package com.saydullin.pexelsapp.ui.typegrophy

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontLoadingStrategy
import com.saydullin.pexelsapp.R

object MulishFont {
    val Bold = FontFamily(Font(resId = R.font.mulish_bold, loadingStrategy = FontLoadingStrategy.Async))
    val Medium = FontFamily(Font(resId = R.font.mulish_medium, loadingStrategy = FontLoadingStrategy.Async))
    val Regular = FontFamily(Font(resId = R.font.mulish, loadingStrategy = FontLoadingStrategy.Async))
}


