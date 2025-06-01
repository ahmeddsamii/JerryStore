package com.example.tomkitchen.composable

import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jerrystore.R
import com.example.jerrystore.ui.theme.ibm_plex_sans_arabic


@Composable
fun FoodHeader(
    title: String,
    description: String,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(R.drawable.ruler),
            contentDescription = "ruler icon",
            modifier = Modifier.size(22.dp),
            tint = Color.White
        )

        Text(
            text = title,
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 16.sp,
                fontFamily = ibm_plex_sans_arabic,
                fontWeight = FontWeight.Medium,
                color = Color(0xDEFFFFFF),
                textAlign = TextAlign.Center,
                letterSpacing = 0.5.sp,
            ),
            modifier = Modifier
                .padding(start = 8.dp)
        )
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(R.drawable.chef),
            contentDescription = "chef icon",
            modifier = Modifier.height(21.dp).width(20.dp),
            tint = Color.White
        )

        Text(
            text = description,
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 16.sp,
                fontFamily = ibm_plex_sans_arabic,
                fontWeight = FontWeight.Medium,
                color = Color(0xDEFFFFFF),
                textAlign = TextAlign.Center,
                letterSpacing = 0.5.sp,
            ),
            modifier = Modifier
                .padding(start = 8.dp)
        )
    }
}