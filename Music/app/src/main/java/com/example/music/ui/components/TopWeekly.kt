package com.example.music.ui.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun  TopWeekly(){
    Text(
        text = "Top Weekly",
        style = TextStyle(fontWeight = FontWeight.ExtraBold, fontSize = 20.sp)
    )
}