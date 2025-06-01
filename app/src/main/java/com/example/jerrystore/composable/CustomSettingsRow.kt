package com.example.jerrystore.composable

import androidx.annotation.DrawableRes
import androidx.annotation.IntegerRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jerrystore.R
import com.example.jerrystore.ui.theme.ibm_plex_sans_arabic

@Composable
fun CustomSettingsRow(
    title: String,
    @DrawableRes iconName: Int
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(iconName),
            contentDescription = "$iconName icon",
            modifier = Modifier
                .size(40.dp)
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(8.dp)
                )
                .size(24.dp)
                .padding(8.dp)
        )

        Text(
            text = title,
            style = TextStyle(
                fontSize = 16.sp,
                fontFamily = ibm_plex_sans_arabic,
                fontWeight = FontWeight.Medium,
                color = Color(0xDE1F1F1E),
            )
        )
    }
}