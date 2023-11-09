package com.saydullin.pexelsapp.presentation.ui.typegrophy

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val PexelTypography = Typography(
    titleLarge = TextStyle(
        fontFamily = MulishFont.Bold,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    ),
    labelSmall = TextStyle(
        fontFamily = MulishFont.Bold,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    labelMedium = TextStyle(
        fontFamily = MulishFont.Regular,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
)


