package com.example.jerrystore.composable

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jerrystore.R
import com.example.jerrystore.ui.theme.ibm_plex_sans_arabic

@Composable
fun StatItem(
    title: String,
    description: String,
    @DrawableRes icon: Int,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = painterResource(icon),
            contentDescription = "Devil face",
            modifier = Modifier
                .padding(start = 12.dp)
                .size(40.dp)
        )


        Column(
            modifier = Modifier.padding(start = 10.dp)
        ) {
            Text(
                text = title,
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 16.sp,
                    fontFamily = ibm_plex_sans_arabic,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0x99121212),
                    textAlign = TextAlign.Center,
                )
            )

            Text(
                text = description,
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 12.sp,
                    fontFamily = ibm_plex_sans_arabic,
                    fontWeight = FontWeight.Medium,
                    color = Color(0x5E121212),
                    textAlign = TextAlign.Center,
                )
            )
        }
    }
}