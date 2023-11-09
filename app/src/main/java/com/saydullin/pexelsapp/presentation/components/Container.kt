package com.saydullin.pexelsapp.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.saydullin.pexelsapp.R

@Composable
fun Container(
    modifier: Modifier = Modifier,
    innerPadding: PaddingValues = PaddingValues.Absolute(),
    isActive: Boolean = false,
    content: @Composable () -> Unit
) {

    val cornerRadius = dimensionResource(R.dimen.corner_radius)
    val color = if (isActive)
            MaterialTheme.colorScheme.primary
        else
            MaterialTheme.colorScheme.secondary

    Box(
        modifier = Modifier
            .padding(innerPadding)
    ) {
        Box(
            modifier = modifier
                .clip(RoundedCornerShape(cornerRadius))
                .background(
                    color = color,
                    shape = RoundedCornerShape(cornerRadius)
                )
                .padding(horizontal = 22.dp, vertical = 10.dp)
        ) {
            content()
        }
    }

}