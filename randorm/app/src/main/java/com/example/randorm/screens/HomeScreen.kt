package com.example.randorm.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.randorm.R
import com.example.randorm.data.database.model.FoodDbModel
import java.util.*
import kotlin.random.Random


@Composable
fun HomeScreen(navController: NavController) {

    val scaffoldState: ScaffoldState = rememberScaffoldState()

    Scaffold(
        scaffoldState = scaffoldState,
        content = {
            LazyColumn {
                itemsIndexed(
                    FoodDbModel.DEFAULT_FOODS
                ) { index, item ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        ImageCard(
                            painter = painterResource(id = item.image),
                            title = item.title,
                            contentDescription = item.description
                        )
                    }
                }
            }
        },
        bottomBar = {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
               ButtonRandom {
                   navController.navigate("popup_screen")
               }

            }

        },
    )


}