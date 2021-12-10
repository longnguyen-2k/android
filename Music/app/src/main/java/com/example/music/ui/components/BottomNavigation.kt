package com.example.music.ui.components

import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun BottomNavigationApp(
    modifier: Modifier = Modifier,
                       ) {

    var selectedItem by remember { mutableStateOf(0) }
//    val items = listOf(
//        NavigationItem(0, R.drawable.ic_home_icon, R.string.home_icon, Screen.Home),
//        NavigationItem(0, R.drawable.ic_play, R.string.home_icon, Screen.Play),
//    )
//    BottomNavigation() {
//        items.forEach {
//            BottomNavigationItem(
//                icon = {
//                    Icon(
//                        imageVector = ImageVector.vectorResource(id = it.vectorResourceId),
//                        contentDescription = stringResource(id = it.contentDescriptionResourceId)
//                    )
//                },
//                selected = selectedItem == it.index,
//                onClick = {
//                    selectedItem = it.index
//                    screenState.value = it.screen
//                }
//            )
//        }
//
//    }


}

//
//private data class NavigationItem(
//    val index: Int,
//    val vectorResourceId: Int,
//    val contentDescriptionResourceId: Int,
//    val screen: Screen
//)