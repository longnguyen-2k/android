package com.example.music.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.music.R
import com.example.music.ui.components.*
import com.google.accompanist.pager.ExperimentalPagerApi

//import com.example.music.views.MainViewModel


@ExperimentalPagerApi
@RequiresApi(Build.VERSION_CODES.O)
@ExperimentalMaterialApi
@Composable
fun HomeScreen(navController: NavController){
//    val viewModel: MainViewModel = hiltViewModel()
//    val state = viewModel.state.value
    val scaffoldState: ScaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(title = "MY MUSIC", icon = Icons.Filled.Search) {
            }
        },
        drawerContent = {

        },
        content = {
            Box( ){
            Column(modifier = Modifier.padding(20.dp)) {

                PopularArtist()
                PlayList( )
                TopWeekly()
                AuthorAvatar(R.drawable.author2)
                AuthorAvatar(R.drawable.author3)
                AuthorAvatar(R.drawable.author5)

            }

            }

        },


        )




}