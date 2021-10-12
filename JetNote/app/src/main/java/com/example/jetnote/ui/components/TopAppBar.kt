package com.example.jetnote.ui.components

import android.icu.text.CaseMap
import android.service.autofill.OnClickAction
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch


@Composable
fun TopAppBar(title: String, icon: ImageVector, onIconClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(56.dp)
            .background(color = MaterialTheme.colors.primarySurface)
    ) {
        Image(
            imageVector = icon,
            contentDescription = "Drawer Header Icon",
            colorFilter = ColorFilter.tint(MaterialTheme.colors.onPrimary),
            modifier = Modifier
                .clickable(onClick = onIconClick)
                .padding(16.dp)
                .align(Alignment.CenterVertically)
        )
        Text(
            text = title,
            color=MaterialTheme.colors.onPrimary,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterVertically)
                .padding(start = 16.dp, end = 16.dp),
            style = TextStyle(fontSize = 20.sp,fontWeight = FontWeight.Medium,letterSpacing = 0.15.sp),
            
        )
    }
}


@Preview(showBackground = true)
@Composable
fun AppTopBarPreview() {
    val scaffoldState: ScaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    TopAppBar(
        "hello",
        icon = Icons.Filled.List,
        onIconClick = { coroutineScope.launch { scaffoldState.drawerState.open() } }
    )
}