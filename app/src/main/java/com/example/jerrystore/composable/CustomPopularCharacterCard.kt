package com.example.jerrystore.composable

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jerrystore.ui.theme.ibm_plex_sans_arabic

@Composable
fun CustomPopularCharacterCard(
    backgroundColor: Color,
    @DrawableRes characterImage: Int,
    characterName: String,
    characterDescription: String,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier
            .background(
                backgroundColor,
                shape = RoundedCornerShape(16.dp)
            )
    ) {
        Column(
            modifier = Modifier
                .layout { measurable, constraints ->
                    val placeable = measurable.measure(constraints)
                    layout(placeable.width, placeable.height - 24.dp.roundToPx()) {
                        placeable.place(0, -24.dp.roundToPx())
                    }
                }
                .padding(start = 26.dp, end = 26.dp)
                .wrapContentHeight()
                .wrapContentWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(characterImage),
                contentDescription = "$characterImage",
                Modifier
                    .size(64.dp)
                    .padding(bottom = 8.dp)
            )

            Text(
                text = characterName,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = TextStyle(
                    fontSize = 18.sp,
                    lineHeight = 20.sp,
                    fontFamily = ibm_plex_sans_arabic,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xDE1F1F1E),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier.padding(bottom = 4.dp)
            )

            Text(
                text = characterDescription,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 20.sp,
                    fontFamily = ibm_plex_sans_arabic,
                    fontWeight = FontWeight(400),
                    color = Color(0x991F1F1E),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier.padding(bottom = 12.dp)
            )
        }
    }
}