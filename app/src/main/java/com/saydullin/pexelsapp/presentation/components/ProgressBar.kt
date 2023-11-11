package com.saydullin.pexelsapp.presentation.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.Dp

@Composable
fun ProgressBar(
    progress: Float,
    progressColor: Color,
    backgroundColor: Color,
    height: Dp,
    modifier: Modifier = Modifier
) {

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(height)
            .clip(MaterialTheme.shapes.small)
            .background(backgroundColor)
    ) {
        Canvas(modifier = Modifier.fillMaxWidth()) {
            val barWidth = size.width * progress
            drawRect(
                color = progressColor,
                topLeft = Offset(0f, 0f),
                size = Size(barWidth, size.height),
                style = Stroke(width = size.height)
            )
        }
    }

}


