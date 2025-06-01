package com.example.jerrystore.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jerrystore.R
import com.example.jerrystore.composable.CustomMostViewEpisodeItem
import com.example.jerrystore.composable.CustomPopularCharacterCard
import com.example.jerrystore.ui.theme.ibm_plex_sans_arabic
import com.example.jerrystore.ui.theme.roboto

@Composable
fun SecretEpisodeScreen() {
    val episodeTitles = listOf(
        "Number 404 - The Cursed Cheese 🧀",
        "Chase on the moon 🌕"
    )

    val episodeBackgrounds = listOf(
        R.drawable.episode_card_1,
        R.drawable.episode_card_2,
    )

    val characterImages = listOf(
        R.drawable.tom_head,
        R.drawable.jerry_head,
        R.drawable.grey_jerry,
    )

    val characterNames = listOf(
        "Tom",
        "Jerry",
        "Jerry",
    )

    val characterDescriptions = listOf(
        "Failed Stalker",
        "A scammer mouse",
        "Hungry mouse",
    )

    val characterCardColors = listOf(
        Color(0xFFFCF2C5),
        Color(0xFFFCC5E4),
        Color(0xFFC5E7FC),
    )

    Box(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .height(432.dp)
                .fillMaxWidth()
                .background(Color(0xffA3DCFF))
                .padding(horizontal = 16.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxSize()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Image(
                        painter = painterResource(R.drawable.tom_jerry_logo),
                        contentDescription = "Tom & jerry logo",
                        modifier = Modifier.size(40.dp)
                    )

                    Image(
                        imageVector = ImageVector.vectorResource(R.drawable.loading_icon),
                        contentDescription = "Loading icon",
                        modifier = Modifier
                            .size(40.dp)
                            .background(
                                brush = Brush.linearGradient(
                                    colors = listOf(
                                        Color(0xff0085E3),
                                        Color(0xff00497D)
                                    )
                                ),
                                shape = RoundedCornerShape(12.dp)
                            )
                            .clip(RoundedCornerShape(12.dp))
                            .padding(10.dp)
                    )

                }

                Spacer(Modifier.height(8.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        modifier = Modifier.weight(2f),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Text(
                            text = "Deleted episodes of Tom and Jerry!",
                            style = TextStyle(
                                fontSize = 18.sp,
                                lineHeight = 20.sp,
                                fontFamily = roboto,
                                fontWeight = FontWeight.SemiBold,
                                color = Color(0xDE1F1F1E),
                            )
                        )

                        Text(
                            text = "Scenes that were canceled for... mysterious (and sometimes embarrassing) reasons.",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                fontFamily = roboto,
                                fontWeight = FontWeight.Normal,
                                color = Color(0x991F1F1E),
                                letterSpacing = 0.25.sp,
                            )
                        )
                    }

                    Image(
                        painter = painterResource(R.drawable.tom_carry_jerry),
                        contentDescription = "Tom Carry Jerry picture",
                        modifier = Modifier
                            .weight(1f)
                            .height(178.dp)
                    )
                }

                Box(
                    modifier = Modifier
                        .requiredWidth(LocalConfiguration.current.screenWidthDp.dp)
                        .fillMaxHeight()
                        .background(
                            brush = Brush.linearGradient(
                                listOf(
                                    Color.Transparent,
                                    Color(0xffEEF4F6)
                                ),
                                start = Offset(0f, 0f),
                                end = Offset(0f, Float.POSITIVE_INFINITY)
                            )
                        )
                )
            }
        }

        Column(
            modifier = Modifier
                .offset(y = 254.dp)
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Most watched",
                    style = TextStyle(
                        fontSize = 20.sp,
                        lineHeight = 20.sp,
                        fontFamily = roboto,
                        fontWeight = FontWeight(600),
                        color = Color(0xDE1F1F1E),
                    )
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(
                        text = "View all",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily = ibm_plex_sans_arabic,
                            fontWeight = FontWeight.Medium,
                            color = Color(0xFF035486),
                        )
                    )

                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.arrow_right),
                        contentDescription = "Arrow right",
                        tint = Color(0xff03578A)
                    )
                }
            }

            Spacer(Modifier.height(12.dp))

            LazyRow(
                modifier = Modifier
                    .requiredWidth(LocalConfiguration.current.screenWidthDp.dp)
                    .padding(start = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(2) {
                    CustomMostViewEpisodeItem(
                        backgroundResource = episodeBackgrounds[it],
                        iconResource = R.drawable.cheese,
                        episodeTitle = episodeTitles[it],
                        modifier = Modifier
                            .height(311.dp)
                            .width(212.dp)
                            .clip(RoundedCornerShape(16.dp)),
                    )
                }
            }

            Spacer(Modifier.height(24.dp))

            Text(
                text = "Popular character",
                style = TextStyle(
                    fontSize = 20.sp,
                    lineHeight = 20.sp,
                    fontFamily = roboto,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xDE1F1F1E),
                )
            )

            Spacer(Modifier.height(36.dp))

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(3) {
                    CustomPopularCharacterCard(
                        backgroundColor = characterCardColors[it],
                        characterImage = characterImages[it],
                        characterName = characterNames[it],
                        characterDescription = characterDescriptions[it],
                        modifier = Modifier
                            .wrapContentHeight()
                            .width(140.dp)
                    )
                }
            }
        }
    }


}