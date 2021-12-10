package com.example.music.ui.components

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.music.screens.HomeScreen
import com.example.music.screens.PlayScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@ExperimentalMaterialApi
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun Navigation(context:Context){
    val navController= rememberNavController()
    NavHost(navController = navController,startDestination =  "play_screen" ){
        composable("play_screen"){
            PlayScreen(navController = navController,context = context)
        }
        composable("home_screen"){
            HomeScreen(navController = navController)

        }
    }

}