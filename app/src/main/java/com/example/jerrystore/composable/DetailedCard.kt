package com.example.jerrystore.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
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
import com.example.jerrystore.ui.theme.ibm_plex_sans_arabic

@Composable
fun DetailsCard(
    icon: ImageVector,
    iconColor: Color,
    title: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Card(
        colors = CardColors(
            containerColor = Color(0xFFD0E5F0),
            contentColor = Color(0x99121212),
            disabledContainerColor = Color(0xFFD0E5F0),
            disabledContentColor = Color(0x99121212),
        ),
        shape = RoundedCornerShape(12.dp),
        modifier = modifier

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "temperature icon",
                modifier = Modifier.padding(bottom = 12.dp).size(30.dp),
                tint = iconColor
            )

            Text(
                text = title,
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 16.sp,
                    fontFamily = ibm_plex_sans_arabic,
                    fontWeight = FontWeight.Medium,
                    color = Color(0x99121212),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier.padding(bottom = 4.dp)
            )

            Text(
                text = description,
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 16.sp,
                    fontFamily = ibm_plex_sans_arabic,
                    fontWeight = FontWeight.Medium,
                    color = Color(0x5E121212),
                    textAlign = TextAlign.Center,
                )
            )
        }
    }
}