package com.saydullin.pexelsapp.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.saydullin.pexelsapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    value: String = "",
    searchPlaceholder: String,
    onSearchTextChanged: ((String) -> Unit)? = null,
    onSearchSubmit: ((String) -> Unit)? = null,
) {

    val cornerRadius = dimensionResource(R.dimen.corner_radius)
    val searchText = remember {
        mutableStateOf(value)
    }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(dimensionResource(R.dimen.side_margins))
            .background(Color.Transparent),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        TextField(
            value = searchText.value,
            onValueChange = {
                searchText.value = it
                onSearchTextChanged?.invoke(it)
            },
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.search_icon),
                    tint = colorScheme.primary,
                    contentDescription = "Icon",
                )
            },
            singleLine = true,
            textStyle = typography.labelMedium,
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(colorScheme.secondary, shape = RoundedCornerShape(cornerRadius))
                .clip(RoundedCornerShape(cornerRadius))
                .border(0.dp, Color.Transparent),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = colorScheme.secondary,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            placeholder = {
                Text(
                    text = searchPlaceholder,
                    color = colorScheme.onSurface
                )
            },
            keyboardActions = KeyboardActions(
                onSearch = { onSearchSubmit?.invoke(searchText.value) }
            )
        )
        if (searchText.value.isNotEmpty()) {
            IconButton(
                onClick = { searchText.value = "" },
                modifier = Modifier.padding(0.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.clear_icon),
                    tint = colorScheme.primary,
                    contentDescription = "Clear",
                )
            }
        }
    }
}


