package com.example.jerrystore.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jerrystore.R

@Composable
fun JerryTopAppBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 2.dp)
            .height(56.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier.padding(vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                modifier = Modifier
                    .size(48.dp),
                painter = painterResource(R.drawable.profile),
                contentDescription = "jerry image"
            )

            AppBarHeader(
                title = "Hi, Jerry 👋",
                subtitle = "Which Tom do you want to buy?"
            )
        }

        BadgedBox(
            badge = {
                Badge(
                    containerColor = Color(0xff045282),
                    modifier = Modifier
                        .offset(x = (-7).dp, y = (-5).dp)
                ) {
                    Text(
                        text = "3",
                        color = Color.White,
                    )
                }
            }
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0x261F1F1E),
                        shape = RoundedCornerShape(12.dp)
                    )
            )

            Image(
                modifier = Modifier.size(24.dp),
                painter = painterResource(R.drawable.notification_01),
                contentDescription = "Notification icon"
            )
        }
    }
}