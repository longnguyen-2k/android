package com.example.randorm.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.randorm.data.database.model.FoodDbModel


@Composable
fun Navigation(){
    val navController= rememberNavController()
    NavHost(navController = navController,startDestination =  "home_screen" ){
        composable("popup_screen"){
            PopUpScreen(navController = navController)
        }
        composable("home_screen"){
           HomeScreen(navController = navController)
        }
    }

}