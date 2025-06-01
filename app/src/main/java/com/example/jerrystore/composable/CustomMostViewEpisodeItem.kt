package com.example.jerrystore.composable

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jerrystore.ui.theme.roboto

@Composable
fun CustomMostViewEpisodeItem(
    @DrawableRes backgroundResource: Int,
    @DrawableRes iconResource: Int,
    episodeTitle: String,
    modifier: Modifier = Modifier

    ){
    Box(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(backgroundResource),
            contentDescription = "$backgroundResource image",
            modifier = Modifier.fillMaxSize()
        )

        Icon(
            imageVector = ImageVector.vectorResource(iconResource),
            contentDescription = "$iconResource icon",
            modifier = Modifier
                .padding(top = 8.dp, end = 8.dp)
                .border(
                    width = 1.dp,
                    color = Color.White.copy(alpha = 0.5f),
                    shape = RoundedCornerShape(12.dp)
                )
                .background(
                    color = Color(0x3DFFFFFF),
                    shape = RoundedCornerShape(12.dp)
                )
                .padding(vertical = 14.25.dp, horizontal = 13.25.dp)
                .align(Alignment.TopEnd),
            tint = Color(0xffFFAA00)
        )

        Text(
            text = episodeTitle,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 20.sp,
                fontFamily = roboto,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFFFFFFFF),
            ),
            modifier = Modifier
                .height(50.dp)
                .padding(start =  8.dp, end = 8.dp, bottom = 12.dp)
                .align(Alignment.BottomStart)
        )
    }
}