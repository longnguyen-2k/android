package com.example.music.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun TopAppBar(title: String, icon: ImageVector, onIconClick: () -> Unit) {
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .heightIn()
//            .background(color = MaterialTheme.colors.primarySurface)
//    )
//    {
//        Image(
//            imageVector = icon,
//            contentDescription = "Header Icon",
//            colorFilter = ColorFilter.tint(MaterialTheme.colors.onPrimary),
//            modifier = Modifier
//                .clickable(onClick = onIconClick)
//                .padding(16.dp)
//                .align(Alignment.CenterVertically)
//        )
//        Text(
//            text = title,
//            color = MaterialTheme.colors.onPrimary,
//            modifier = Modifier
//                .fillMaxWidth()
//                .align(Alignment.CenterVertically)
//                .padding(start = 16.dp, end = 16.dp), style = TextStyle(
//                fontSize = 20.sp, fontWeight = FontWeight.Medium, letterSpacing = 0.15.sp
//            )
//        )
//    }
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        IconButton(onClick =  onIconClick ) {
            Icon(
                imageVector = icon,
                contentDescription = "Back Arrow",
                tint = Color.Black,

            )
        }
        Text(
            text = title,
            color = Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterVertically)
                .padding(start = 16.dp, end = 16.dp),
            style = TextStyle(
                fontSize = 20.sp, fontWeight = FontWeight.Medium, letterSpacing = 0.15.sp
            )
        )


        Spacer(modifier = Modifier.weight(1f))


        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = "More",
                tint = Color.Black
            )
        }
    }
}

