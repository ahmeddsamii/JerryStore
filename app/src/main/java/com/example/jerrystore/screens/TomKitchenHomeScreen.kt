package com.example.jerrystore.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
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
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jerrystore.R
import com.example.jerrystore.composable.CheeseCountBox
import com.example.jerrystore.composable.DetailsCard
import com.example.jerrystore.ui.theme.ibm_plex_sans_arabic
import com.example.tomkitchen.composable.FoodTitle
import com.example.tomkitchen.composable.StepItem

@Composable
fun TomKitchenHomeScreen() {
    val icons = listOf(
        R.drawable.temperature,
        R.drawable.clock,
        R.drawable.devil_face_svg,
    )

    val titles = listOf(
        "1000 V",
        "3 sparks",
        "1M 12K",
    )

    val descriptions = listOf(
        "Temperature",
        "Time",
        "No. of deaths",
    )

    val steps = listOf(
        "Put the pasta in a toaster.",
        "Pour battery juice over it.",
        "Wait for the spark to ignite.",
        "Serve with an insulating glove.",
    )

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .background(color = Color(0x80035484))
        ) {
            Image(
                painter = painterResource(R.drawable.ellipse),
                contentDescription = "ellipse",
                modifier = Modifier
                    .width(384.7502.dp)
                    .height(414.2118.dp)
                    .offset(x = (-95).dp, y = (-25).dp)
            )

            Column(
                verticalArrangement = Arrangement.spacedBy(20.dp),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .padding(top = 40.dp, bottom = 58.dp, start = 16.dp),
            ) {
                FoodTitle(
                    title = "High tension",
                    description = "Shocking foods"
                )
            }
        }

        Card(
            modifier = Modifier
                .fillMaxSize()
                .offset(y = 202.dp)
                .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)),
            colors = CardColors(
                containerColor = Color(0xffEEF4F6),
                contentColor = Color.Black,
                disabledContainerColor = Color(0xffEEF4F6),
                disabledContentColor = Color.Black
            )
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 16.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                Spacer(Modifier.height(32.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Text(
                            text = "Electric Tom pasta",
                            style = TextStyle(
                                fontSize = 20.sp,
                                lineHeight = 16.sp,
                                fontFamily = ibm_plex_sans_arabic,
                                fontWeight = FontWeight.Medium,
                                color = Color(0xDE121212),
                                textAlign = TextAlign.Center,
                                letterSpacing = 0.5.sp,
                            )
                        )

                        Box(
                            modifier = Modifier
                                .padding(end = 8.dp)
                                .height(30.dp)
                                .background(
                                    color = Color(0xffD0E5F0),
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .padding(horizontal = 8.dp, vertical = 4.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            CheeseCountBox(5, isDiscountApplied = false)
                        }
                    }

                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.heart),
                        contentDescription = "heart icon",
                        modifier = Modifier
                            .width(20.dp)
                            .height(17.dp),
                        tint = Color(0xFF03578A)
                    )
                }

                Spacer(Modifier.height(22.dp))

                Text(
                    text = "Pasta cooked with a charger cable and sprinkled with questionable cheese." +
                            " Make sure to unplug it before eating (or not, you decide).",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontFamily = ibm_plex_sans_arabic,
                        fontWeight = FontWeight.Medium,
                        color = Color(0x99121212),
                    ),
                )

                Spacer(Modifier.height(24.dp))

                Text(
                    text = "Details",
                    style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 16.sp,
                        fontFamily = ibm_plex_sans_arabic,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xDE1F1F1E),
                        textAlign = TextAlign.Center,
                    )
                )

                Spacer(Modifier.height(8.dp))

                Row (
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    DetailsCard(
                        icon = ImageVector.vectorResource(icons[0]),
                        iconColor = Color(0xff035587),
                        title = titles[0],
                        description = descriptions[0],
                        modifier = Modifier.height(105.dp).weight(1f)
                    )

                    DetailsCard(
                        icon = ImageVector.vectorResource(icons[1]),
                        iconColor = Color(0xff035587),
                        title = titles[1],
                        description = descriptions[1],
                        modifier = Modifier.height(105.dp).weight(1f)
                    )

                    DetailsCard(
                        icon = ImageVector.vectorResource(icons[2]),
                        iconColor = Color(0xff035587),
                        title = titles[2],
                        description = descriptions[2],
                        modifier = Modifier.height(105.dp).weight(1f)
                    )
                }

                Spacer(Modifier.height(24.dp))

                Text(
                    text = "Preparation method",
                    style = TextStyle(
                        fontSize = 18.sp,
                        lineHeight = 16.sp,
                        fontFamily = ibm_plex_sans_arabic,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xDE1F1F1E),
                    )
                )

                Spacer(Modifier.height(8.dp))

                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.padding(bottom = 290.dp)
                ) {
                    steps.forEachIndexed { index, step ->
                        StepItem(
                            stepNumber = index + 1,
                            stepText = step
                        )
                    }
                }

            }
        }

        Image(
            painter = painterResource(R.drawable.dish),
            contentDescription = "dish",
            modifier = Modifier
                .padding(end = 24.dp)
                .width(188.dp)
                .height(168.dp)
                .align(Alignment.TopEnd)
                .offset(y = 58.dp)
        )

        Card(
            colors = CardColors(
                containerColor = Color.White,
                contentColor = Color.Black,
                disabledContainerColor = Color.White,
                disabledContentColor = Color.Black
            ),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .height(86.dp)
                .border(width = 1.dp, color = Color(0x1F1F1F1E))
        ) {
            Button(
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 15.dp)
                    .fillMaxSize(),
                colors = ButtonColors(
                    containerColor = Color(0xff226993),
                    contentColor = Color(0xDEFFFFFF),
                    disabledContainerColor = Color(0xff226993),
                    disabledContentColor = Color(0xDEFFFFFF)
                ),
                shape = RoundedCornerShape(16.dp),
                onClick = {},
            ) {
                Row(
                    modifier = Modifier.fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
                ) {
                    Text(
                        text = "Add to cart",
                        style = TextStyle(
                            fontSize = 16.sp,
                            lineHeight = 16.sp,
                            fontFamily = ibm_plex_sans_arabic,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xDEFFFFFF),
                            textAlign = TextAlign.Center,
                        )
                    )

                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.small_dot),
                        contentDescription = "small dot",
                        modifier = Modifier.size(5.dp)
                    )

                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "3 cheeses",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 16.sp,
                                fontFamily = ibm_plex_sans_arabic,
                                fontWeight = FontWeight.Medium,
                                color = Color(0xFFFFFFFF),
                                textAlign = TextAlign.Center,
                            )
                        )

                        Text(
                            text = "5 cheeses",
                            style = TextStyle(
                                fontSize = 12.sp,
                                lineHeight = 16.sp,
                                fontFamily = ibm_plex_sans_arabic,
                                fontWeight = FontWeight(500),
                                color = Color(0xCCFFFFFF),
                                textAlign = TextAlign.Center,
                                letterSpacing = 0.5.sp,
                                textDecoration = TextDecoration.LineThrough,
                            )
                        )
                    }
                }
            }
        }
    }
}


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun PreviewScreen() {
    TomKitchenHomeScreen()
}