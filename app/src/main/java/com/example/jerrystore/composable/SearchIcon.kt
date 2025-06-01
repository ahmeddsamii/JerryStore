package com.example.jerrystore.composable

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.example.jerrystore.R

@Composable
fun SearchIcon() {
    Icon(
        imageVector = ImageVector.vectorResource(R.drawable.search_normal),
        contentDescription = "Search Icon"
    )
}