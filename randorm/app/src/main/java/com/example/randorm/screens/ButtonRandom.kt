package com.example.randorm.screens

import android.service.autofill.OnClickAction
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import kotlin.random.Random


@Composable
fun ButtonRandom(onClickAction: ()->Unit){
    Button(onClick = {
        onClickAction.invoke()
                     },
        content = {
            Text(
                text = "Random",

                color = Color.White
            )
        },




    )

}