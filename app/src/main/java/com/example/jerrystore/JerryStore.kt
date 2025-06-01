package com.example.jerrystore

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jerrystore.composable.JerryTopAppBar
import com.example.jerrystore.screens.HomeScreen
import com.example.jerrystore.screens.SecretEpisodeScreen
import com.example.jerrystore.screens.TomAccountScreen
import com.example.jerrystore.screens.TomKitchenHomeScreen


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun JerryStore(){
    Scaffold(
        topBar = {
            JerryTopAppBar(Modifier.padding(horizontal = 16.dp))
        }
    ) {
        HomeScreen(Modifier.padding(it).padding(horizontal = 16.dp))
//        TomKitchenHomeScreen()
//        TomAccountScreen()
//        SecretEpisodeScreen()
    }
}