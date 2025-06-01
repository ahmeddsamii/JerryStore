package com.example.jerrystore.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jerrystore.R
import com.example.jerrystore.composable.CustomGridCard
import com.example.jerrystore.composable.CustomLinearCard
import com.example.jerrystore.composable.CustomSearchBar
import com.example.jerrystore.ui.theme.ibm_plex_sans_arabic

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    val tomImages = listOf(
        R.drawable.sport_tom,
        R.drawable.tom_the_lover,
        R.drawable.tom_the_bomb,
        R.drawable.spy_tom,
        R.drawable.frozen_tom,
        R.drawable.sleeping_tom,
    )

    val tomTitles = listOf(
        "Sport Tom",
        "Tom the lover",
        "Tom the bomb",
        "Spy Tom",
        "Frozen Tom",
        "Sleeping Tom",
    )

    val tomDescriptions = listOf(
        "He runs 1 meter... trips over his boot.",
        "He loves one-sidedly... and is beaten by the other side.",
        "He blows himself up before Jerry can catch him.",
        "Disguises itself as a table.",
        "He was chasing Jerry, he froze after the first look",
        "He doesn't chase anymore, he just snores in stereo."
    )

    val discount = listOf(
        true,
        false,
        false,
        false,
        false,
        false,
    )

    val cheeseCountList = listOf(
        3, 5, 10, 12, 10, 10
    )

    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .padding(top = 12.dp)
                .height(48.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            CustomSearchBar(
                value = "",
                modifier = Modifier
                    .weight(2f)
                    .padding(end = 8.dp),
                onValueChanged = { },
                label = { Text("Search about tom...") },
            )

            Box(
                modifier = Modifier
                    .size(48.dp)
                    .background(
                        color = Color(0xff03578A),
                        shape = RoundedCornerShape(12.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(R.drawable.filter),
                    contentDescription = "Filter Icon",
                    modifier = Modifier.size(24.dp),
                    tint = Color.White
                )
            }
        }

        CustomLinearCard()

        Spacer(Modifier.height(24.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Cheap tom section",
                fontFamily = ibm_plex_sans_arabic,
                fontSize = 20.sp,
                color = Color(0xff1F1F1E),
                fontWeight = FontWeight.SemiBold
            )

            Row(
                modifier = Modifier.padding(vertical = 3.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = "View all",
                    fontFamily = ibm_plex_sans_arabic,
                    fontSize = 12.sp,
                    color = Color(0xff035486),
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(end = 4.dp)
                )

                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.arrow_right),
                    contentDescription = "right arrow",
                    modifier = Modifier.size(12.dp),
                    tint = Color(0xff035486)
                )
            }
        }

        Spacer(Modifier.height(16.dp))


        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(28.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(top = 16.dp, bottom = 12.dp),
            modifier = Modifier
                .weight(1f)
        ) {
            items(6) { index ->
                CustomGridCard(
                    modifier = Modifier
                        .height(220.dp)
                        .fillMaxWidth(),
                    image = painterResource(tomImages[index]),
                    isDiscountApplied = discount[index],
                    title = tomTitles[index],
                    description = tomDescriptions[index],
                    cheeseCount = cheeseCountList[index],
                    purchaseIcon = ImageVector.vectorResource(R.drawable.add_to_cart_icon),
                    onPurchaseClick = {}
                )
            }
        }
    }
}

@Preview(name = "Phone - Medium", widthDp = 360, showBackground = true, showSystemUi = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}