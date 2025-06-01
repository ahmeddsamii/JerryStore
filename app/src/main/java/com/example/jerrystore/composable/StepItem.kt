package com.example.tomkitchen.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jerrystore.ui.theme.ibm_plex_sans_arabic

@Composable
fun StepItem(
    stepNumber: Int,
    stepText: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = Color.White,
                shape = RoundedCornerShape(
                    topStart = 100.dp,
                    bottomStart = 100.dp,
                    bottomEnd =  12.dp,
                    topEnd = 12.dp
                )
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Box(
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = Color(0xFFD0E5F0),
                    shape = RoundedCornerShape(size = 100.dp)
                )
                .width(36.dp)
                .height(36.dp)
                .background(
                    color = Color(0xFFFFFFFF),
                    shape = RoundedCornerShape(size = 100.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = stepNumber.toString(),
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 16.sp,
                    fontFamily = ibm_plex_sans_arabic,
                    fontWeight = FontWeight(500),
                    color = Color(0xFF035587),
                    textAlign = TextAlign.Center,
                )
            )
        }

        Text(
            text = stepText,
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 16.sp,
                fontFamily = ibm_plex_sans_arabic,
                fontWeight = FontWeight.Normal,
                color = Color(0x99121212),
                textAlign = TextAlign.Center,
            )
        )
    }
}