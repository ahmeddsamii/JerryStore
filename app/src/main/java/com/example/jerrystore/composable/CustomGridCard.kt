package com.example.jerrystore.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jerrystore.ui.theme.ibm_plex_sans_arabic

@Composable
fun CustomGridCard(
    image: Painter,
    title: String,
    description: String,
    cheeseCount: Int,
    isDiscountApplied: Boolean,
    purchaseIcon: ImageVector,
    onPurchaseClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
    ) {
        Card(
            modifier = modifier
                .align(Alignment.BottomCenter),
            shape = RoundedCornerShape(16.dp),
            colors = CardColors(
                containerColor = Color.White,
                contentColor = Color.Black,
                disabledContainerColor = Color.White,
                disabledContentColor = Color.Black
            )
        ) {
            Spacer(Modifier.height(92.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .fillMaxHeight()
            ) {
                Text(
                    text = title,
                    fontFamily = ibm_plex_sans_arabic,
                    fontSize = 18.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.SemiBold,
                )

                Text(
                    text = description,
                    fontFamily = ibm_plex_sans_arabic,
                    fontSize = 12.sp,
                    color = Color(0xff969799),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Normal,
                    maxLines = 3,
                    lineHeight = 17.sp,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                Spacer(modifier = Modifier.weight(1f))

                Row(
                    modifier = Modifier
                        .padding(bottom = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    CheeseCountBox(
                        isDiscountApplied = isDiscountApplied,
                        cheeseCount = cheeseCount,
                        modifier = Modifier
                            .weight(1f)
                            .height(30.dp)
                            .background(
                                color = Color(0xffE9F6FB),
                                shape = RoundedCornerShape(8.dp)
                            )
                            .padding(horizontal = 8.dp, vertical = 4.dp),
                    )

                    IconButton(
                        onClick = { onPurchaseClick() },
                        modifier = Modifier
                            .padding(8.dp)
                            .border(
                                border = BorderStroke(
                                    width = 1.dp,
                                    color = Color(0xff226993)
                                ),
                                shape = RoundedCornerShape(8.dp)
                            )
                            .size(30.dp),
                        colors = IconButtonColors(
                            containerColor = Color.Transparent,
                            contentColor = Color(0xff03578A),
                            disabledContainerColor = Color.Transparent,
                            disabledContentColor = Color(0xff03578A)
                        )
                    ) {
                        Icon(
                            imageVector = purchaseIcon,
                            contentDescription = "Purchase icon",
                        )
                    }
                }
            }
        }

        Image(
            painter = image,
            contentDescription = "Tom",
            modifier = Modifier
                .width(98.44.dp)
                .height(100.dp)
                .align(Alignment.TopCenter)
                .offset(y = (-16).dp)
        )
    }
}