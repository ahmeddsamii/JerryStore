package com.example.jerrystore.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jerrystore.R
import com.example.jerrystore.composable.CustomFavoriteFoodRow
import com.example.jerrystore.composable.CustomSettingsRow
import com.example.jerrystore.composable.StatItem
import com.example.jerrystore.ui.theme.ibm_plex_sans_arabic


@Composable
fun TomAccountScreen() {
    val statTitles = listOf(
        "2M 12K",
        "+500 h",
        "2M 12K",
        "3M 7K",
    )

    val statDescriptions = listOf(
        "No. of quarrels",
        "Chase time",
        "Hunting times",
        "Heartbroken",
    )

    val statIcons = listOf(
        R.drawable.devil_face,
        R.drawable.running_person,
        R.drawable.sad_face,
        R.drawable.broken_heart,
    )

    val statCardColors = listOf(
        Color(0xFFD0E5F0),
        Color(0xFFDEEECD),
        Color(0xFFF2D9E7),
        Color(0xFFFAEDCF),
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(242.dp)
            .background(Color(0xff226993))
    ) {
        Box(
            modifier = Modifier
                .requiredWidth(600.dp)
                .requiredHeight(300.dp)
                .offset(x = (35).dp, y = (-120.82).dp)
                .rotate(32.5f)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color.White.copy(alpha = 0.43f), Color(0xff226993))
                    )
                )
        )

        Box(
            modifier = Modifier
                .requiredWidth(508.dp)
                .requiredHeight(208.dp)
                .offset(x = (-10.51).dp, y = (-80.65).dp)
                .rotate(-15.92f)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xff226993),
                            Color.White.copy(alpha = 0.20f),
                        )
                    )
                )
        )

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .offset(y = 16.dp)
                .align(alignment = Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.jackass_tom),
                contentDescription = "Jackass tom",
                modifier = Modifier.padding(bottom = 4.dp)
            )

            Text(
                text = "Tom ",
                style = TextStyle(
                    fontSize = 18.sp,
                    lineHeight = 23.4.sp,
                    fontFamily = ibm_plex_sans_arabic,
                    fontWeight = FontWeight.Medium,
                    color = Color.White,
                )
            )

            Text(
                text = "specializes in failure!",
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 21.6.sp,
                    fontFamily = ibm_plex_sans_arabic,
                    fontWeight = FontWeight.Normal,
                    color = Color(0xCCFFFFFF),
                ),
                modifier = Modifier.padding(bottom = 4.dp)
            )

            Button(
                onClick = {},
                Modifier
                    .height(25.dp),
                colors = ButtonColors(
                    containerColor = Color(0x1FFFFFFF),
                    contentColor = Color.White,
                    disabledContainerColor = Color(0x1FFFFFFF),
                    disabledContentColor = Color.White
                ),
                shape = RoundedCornerShape(size = 40.dp),
                contentPadding = PaddingValues(horizontal = 12.dp, vertical = 6.dp)
            ) {
                Text(
                    text = "Edit foolishness",
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontFamily = ibm_plex_sans_arabic,
                        fontWeight = FontWeight(500),
                        color = Color.White,
                    ),
                )
            }
        }
    }

    Card(
        colors = CardColors(
            containerColor = Color(0xffEEF4F6),
            contentColor = Color.Black,
            disabledContainerColor = Color(0xffEEF4F6),
            disabledContentColor = Color.Black,
        ),
        shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
        modifier = Modifier
            .fillMaxWidth()
            .offset(y = 202.dp)
            .requiredHeight(LocalConfiguration.current.screenHeightDp.dp - 202.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp)
        ) {
            Spacer(Modifier.height(23.dp))

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.height(120.dp)
            ) {
                items(4) {
                    StatItem(
                        title = statTitles[it],
                        description = statDescriptions[it],
                        modifier = Modifier
                            .height(56.dp)
                            .clip(RoundedCornerShape(12.dp))
                            .background(statCardColors[it]),
                        icon = statIcons[it],
                    )
                }
            }

            Spacer(Modifier.height(24.dp))

            Text(
                text = "Tom settings",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = ibm_plex_sans_arabic,
                    fontWeight = FontWeight(700),
                    color = Color(0xDE1F1F1E),
                )
            )

            Column(
                modifier = Modifier
                    .padding(top = 8.dp)
                    .height(144.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                CustomSettingsRow(
                    title = "Change sleeping place",
                    iconName = R.drawable.bed
                )

                CustomSettingsRow(
                    title = "Meow settings",
                    iconName = R.drawable.cat
                )

                CustomSettingsRow(
                    title = "Password to open the fridge",
                    iconName = R.drawable.password
                )
            }

            Spacer(Modifier.height(12.dp))

            HorizontalDivider(
                thickness = 1.dp,
                color = Color(0x140B001F),
                modifier = Modifier.requiredWidth(LocalConfiguration.current.screenWidthDp.dp)
            )

            Spacer(Modifier.height(12.dp))

            Text(
                text = "His favorite foods",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = ibm_plex_sans_arabic,
                    fontWeight = FontWeight(700),
                    color = Color(0xDE1F1F1E),
                ),
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Column(
                modifier = Modifier
                    .padding(top = 8.dp)
                    .height(144.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                CustomFavoriteFoodRow(
                    title = "Mouses",
                    iconName = R.drawable.warning
                )

                CustomFavoriteFoodRow(
                    title = "Last stolen meal",
                    iconName = R.drawable.sandwitch
                )

                CustomFavoriteFoodRow(
                    title = "Change sleeping place",
                    iconName = R.drawable.sleeping_emoji
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp)
            ) {
                Text(
                    text = "v.TomBeta",
                    modifier = Modifier
                        .align(Alignment.Center),
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = ibm_plex_sans_arabic,
                        fontWeight = FontWeight(400),
                        color = Color(0x99121212),
                        textAlign = TextAlign.Center,
                    )
                )
            }
        }
    }
}