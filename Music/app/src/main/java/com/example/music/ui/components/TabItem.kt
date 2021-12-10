package com.example.music.ui.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.music.R
import com.google.accompanist.pager.ExperimentalPagerApi


//@Composable
//fun IconTab() {
//    var tabIndex by remember { mutableStateOf(0) }
//    val tabData = listOf(
//        "MUSIC" to Icons.Filled.Home,
//        "MARKET" to Icons.Filled.ShoppingCart,
//        "FILMS" to Icons.Filled.AccountBox,
//        "BOOKS" to Icons.Filled.Settings,
//    )
//    TabRow(selectedTabIndex = tabIndex) {
//        tabData.forEachIndexed { index, pair ->
//            Tab(selected = tabIndex == index, onClick = {
//                tabIndex = index
//            }, text = {
//                Text(text = pair.first)
//            }, icon = {
//                Icon(imageVector = pair.second, contentDescription = null)
//            })
//        }
//    }
//}


@ExperimentalPagerApi
@RequiresApi(Build.VERSION_CODES.O)
@ExperimentalMaterialApi
@Composable
fun TabItem() {
    var state by remember { mutableStateOf(0) }
    val titles = listOf("Popular Artist", "Albums", "Songs")
    TabRow(
        contentColor = MaterialTheme.colors.primaryVariant, // This is underline's color
        selectedTabIndex = state,
        backgroundColor = Color.White
    ) {
        titles.forEachIndexed { index, title ->
            Tab(
                selectedContentColor = MaterialTheme.colors.primaryVariant,
                unselectedContentColor = Color.Black,
                text = { Text(title) },
                selected = state == index,
                onClick = { state = index }
            )
        }
    }
    if (state == 0) {
        Row {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                items(items = listOf("a", "a"), itemContent = {
                    PlayListItem()
                })
            }
        }
    }


    if (state == 1) {
        Row {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                items(items = listOf("a", "a"), itemContent = {
                    PlayListItem()
                })
            }
        }
    }
    if (state == 2) {
        Row {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                items(items = listOf("a", "a"), itemContent = {
                    PlayListItem()
                })
            }
        }
    }


}

@Composable
fun PlayListItem() {
    ConstraintLayout(
    ) {
        val (backgroundImage, icon) = createRefs()

        Box(
            modifier = Modifier
                .constrainAs(backgroundImage) {
                    centerHorizontallyTo(parent)
                    top.linkTo(parent.top)

                }
        ) {
            Card(
                shape = RoundedCornerShape(15.dp),
                elevation = 5.dp,
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(16.dp)

            ) {
                Image(
                    modifier = Modifier
                        .height(120.dp)
                        .width(175.dp),
                    painter = painterResource(id = R.drawable.beautifulbackground),
                    contentDescription = "contentDescription",
                    contentScale = ContentScale.Crop,
                )
            }


        }

        Box(
            modifier = Modifier
                .constrainAs(icon) {

                    centerHorizontallyTo(backgroundImage)
                    centerVerticallyTo(backgroundImage)
                }
        )
        {
            Text(
                modifier = Modifier,
                text = "title",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }


    }


}

