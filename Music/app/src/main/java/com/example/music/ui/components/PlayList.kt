package com.example.music.ui.components

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@ExperimentalMaterialApi
@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun PlayList( ){

    TabItem()
//    Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
//        Text(
//            text = "Popular Artist",
//            style = TextStyle(fontWeight = FontWeight.ExtraBold, fontSize = 20.sp)
//        )
//        Text(
//            text = "Albums",
//            style = TextStyle(color = Color.Gray,fontWeight = FontWeight.ExtraBold, fontSize = 20.sp)
//        )
//        Text(
//                text = "Songs",
//        style = TextStyle(color = Color.Gray,fontWeight = FontWeight.ExtraBold, fontSize = 20.sp)
//        )
//    }
}