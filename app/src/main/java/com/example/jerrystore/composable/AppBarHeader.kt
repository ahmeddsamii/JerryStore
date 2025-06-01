package com.example.jerrystore.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jerrystore.ui.theme.ibm_plex_sans_arabic
import com.example.jerrystore.ui.theme.lightGrey

@Composable
fun AppBarHeader(title:String, subtitle: String){
    Column(
        modifier = Modifier
            .padding(start = 8.dp)
            .padding(vertical = 0.5.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
    ) {
        Text(
            text = title,
            fontSize = 14.sp,
            fontFamily = ibm_plex_sans_arabic,
            fontWeight = FontWeight.Medium,
            lineHeight = 18.sp
        )

        Text(
            text = subtitle,
            fontSize = 12.sp,
            fontFamily = ibm_plex_sans_arabic,
            fontWeight = FontWeight.Normal,
            color = lightGrey,
            lineHeight = 16.sp
        )
    }
}