package com.example.music.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.music.R

@Composable
fun PopularArtist(){
    val list = listOf(
        R.drawable.author2,R.drawable.author3,R.drawable.author4,R.drawable.author5,R.drawable.author6
    )
    Text(
            text = "Popular Artist",
    style = TextStyle(fontWeight = FontWeight.ExtraBold, fontSize = 16.sp)
    )

        LazyRow(
            modifier = Modifier
                .fillMaxWidth(),

        ) {
            items(items = list,
                itemContent = { item->
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(15.dp)
                    ) {
                        Spacer(modifier = Modifier.width(10.dp))
                        Card(
                            elevation = 4.dp,
                            shape = CircleShape
                        ) {
                            Image(
                                bitmap = ImageBitmap.imageResource(item),
                                contentDescription = "Des for image",
                                modifier = Modifier.size(60.dp)

                            )

                        }
                        Text(
                            text = "Title",
                            fontWeight = FontWeight.Light,
                            modifier = Modifier.padding(top = 10.dp)
                        )

                    }
                }
            )



    }
}