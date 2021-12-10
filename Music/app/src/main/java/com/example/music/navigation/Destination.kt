package com.example.music.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.navArgument

sealed class Destination(
    val route: String,
    val arguments: List<NamedNavArgument>
){
    object Home : Destination("home_screen", emptyList())
    object Play: Destination(
        route = "play_screen",
        arguments = listOf(
            navArgument("songId"){
                nullable = true
            }
        )
    )
}
