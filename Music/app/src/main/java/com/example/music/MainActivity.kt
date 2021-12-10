package com.example.music

import android.content.Context
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.music.ui.components.Navigation
import com.google.accompanist.pager.ExperimentalPagerApi
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @ExperimentalMaterialApi
    @ExperimentalPagerApi
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                   Navigation(this)


        }
    }
}

//
//@ExperimentalMaterialApi
//fun NavGraphBuilder.home(
//    navController: NavController
//) {
//    composable(
//        route = Destination.Home.route
//    ) {
//
//        val viewModel: BookListViewModel = hiltViewModel()
//        val state = viewModel.state.value
//        val isRefreshing = viewModel.isRefreshing.collectAsState()
//
//        BookListScreen(
//            state = state,
//            navigateToBookDetail = {
//                navController.navigate(Destination.Play.route)
//            },
//            isRefreshing = isRefreshing.value,
//            refreshData = viewModel::getBookList,
//            onItemClick = { bookId ->
//                navController.navigate(
//                    Destination.Play.route + "?bookId=$bookId"
//                )
//            },
//            deleteBook = viewModel::deleteBook
//        )
//    }
//
//
//    fun NavGraphBuilder.addBookDetail() {
//        composable(
//            route = Destination.Play.route + "?bookId={bookId}"
//        ) {
//
//            val viewModel: BookDetailViewModel = hiltViewModel()
//            val state = viewModel.state.value
//
//            BookDetailScreen(
//                state = state,
//                addNewBook = viewModel::addNewBook,
//                updateBook = viewModel::updateBook
//            )
//        }
//    }


@Composable
fun  Aa(context: Context){
    val mp: MediaPlayer = MediaPlayer.create(context, R.raw.audio)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.author2),
            contentDescription = "lll",
            modifier = Modifier
                .height(160.dp)
                .width(160.dp)
                .padding(32.dp)
                .background(Color.Black)
        )

        Row() {

            IconButton(onClick = { mp.start() }, modifier = Modifier.size(35.dp)) {
                Icon(
                    painter = painterResource(id = R.drawable.author2),
                    contentDescription = ""
                )
            }

            IconButton(onClick = { mp.pause() }, modifier = Modifier.size(35.dp)) {
                Icon(
                    painter = painterResource(id = R.drawable.author2),
                    contentDescription = ""
                )
            }
        }

    }
}