package com.example.music.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MoreHoriz
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.music.R



@ExperimentalMaterialApi
@Composable
fun AuthorAvatar(painterResource:Int) {
    ListItem(
        text = { Text("Two line list item with 40x40 icon") },
        secondaryText = { Text("Secondary text") },
        icon = {
            Row(verticalAlignment = Alignment.CenterVertically,) {
                Text(text = "1", fontWeight = FontWeight.Bold,modifier = Modifier.padding(end=5.dp))
                Card(
                    elevation = 4.dp,
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Image(
                        bitmap = ImageBitmap.imageResource(painterResource),
                        contentDescription = "Des for image",
                        modifier = Modifier.size(60.dp)

                    )
                }

            }


        },
        trailing = {
            Icon(
                imageVector = Icons.Outlined.MoreHoriz,
                contentDescription = "More",
                tint = Color.Black,
            )
        }
    )


}
