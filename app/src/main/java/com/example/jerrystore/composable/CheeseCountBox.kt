package com.example.jerrystore.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jerrystore.R
import com.example.jerrystore.screens.HomeScreen
import com.example.jerrystore.ui.theme.ibm_plex_sans_arabic

@Composable
fun CheeseCountBox(
    cheeseCount: Int,
    isDiscountApplied: Boolean,
    modifier: Modifier = Modifier
){
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterHorizontally)
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(R.drawable.bag),
                contentDescription = "Bag icon",
                tint = Color(0xff03578A),
                modifier = Modifier.padding(end = 4.dp)
            )
            if (isDiscountApplied){
                Text(
                    text = "5",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = ibm_plex_sans_arabic,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF03578A),
                    ),
                    textDecoration = TextDecoration.LineThrough
                )
            }

            Text(
                text = "$cheeseCount cheeses",
                style = TextStyle(
                    fontSize = 12.sp,
                    fontFamily = ibm_plex_sans_arabic,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF03578A),
                )
            )
        }

    }
}

@Preview(name = "Phone - Medium", widthDp = 360, showBackground = true, showSystemUi = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}