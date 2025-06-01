package com.example.jerrystore.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jerrystore.R
import com.example.jerrystore.ui.theme.ibm_plex_sans_arabic

@Composable
fun CustomLinearCard() {
    Box(
        modifier = Modifier
            .padding(top = 24.dp)
            .height(92.dp)
            .fillMaxWidth()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF03446A),
                        Color(0xFF0685D0)
                    ),
                    start = Offset(0f, 0f),
                    end = Offset.Infinite
                ),
                shape = RoundedCornerShape(16.dp)
            )
    ) {
        Row(
            horizontalArrangement = Arrangement.Absolute.SpaceBetween,
        ) {
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.White,
                    disabledContainerColor = Color.Transparent,
                    disabledContentColor = Color.White
                )
            ) {
                Column(
                    modifier = Modifier
                        .padding(12.dp)
                        .weight(2f)
                ) {
                    Text(
                        text = "Buy 1 Tom and get 2 for free",
                        fontFamily = ibm_plex_sans_arabic,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold
                    )

                    Text(
                        modifier = Modifier.padding(top = 8.dp),
                        text = "Adopt Tom!(Free Fail-Free\nGuarantee)",
                        fontFamily = ibm_plex_sans_arabic,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.White.copy(alpha = 0.8f),
                        lineHeight = 19.sp
                    )
                }
            }

            Box(
                modifier = Modifier
                    .height(92.dp)
                    .weight(1f),
                contentAlignment = Alignment.BottomCenter
            ) {
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.ellipse_2),
                    contentDescription = "ellipse",
                    modifier = Modifier
                        .offset(x = 29.dp)
                        .requiredWidth(132.05.dp),
                    contentScale = ContentScale.FillWidth
                )

                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.ellipse_1),
                    contentDescription = "ellipse",
                    modifier = Modifier
                        .offset(x = 30.dp)
                        .requiredWidth(139.22.dp)
                        .padding(start = 10.dp),
                    contentScale = ContentScale.FillWidth
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(y = (-8).dp)
                        .requiredHeight(108.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.tom_gredient_card),
                        contentDescription = "tom",
                        contentScale = ContentScale.FillBounds
                    )
                }
            }
        }
    }
}