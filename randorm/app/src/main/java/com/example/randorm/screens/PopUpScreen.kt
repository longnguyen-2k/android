package com.example.randorm.screens


import android.view.animation.GridLayoutAnimationController
import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.randorm.R
import com.example.randorm.data.database.model.FoodDbModel
import kotlinx.coroutines.delay
import kotlin.random.Random

@Composable
fun PopUpScreen(navController: NavController) {
    val scale = remember { Animatable(0f) }
    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 1f,
            animationSpec = tween(
                durationMillis = 3000,
                easing = { OvershootInterpolator(2f).getInterpolation(it) })
        )
        delay(2000L)
        navController.navigate("home_screen")
    }
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
        Random.nextInt(0, FoodDbModel.DEFAULT_FOODS.size).toString()
        val food :FoodDbModel= FoodDbModel.DEFAULT_FOODS[Random.nextInt(0, FoodDbModel.DEFAULT_FOODS.size)]
        ImageCard(painter = painterResource(id = food.image) , contentDescription = food.description, title =food.title,color= Color.White )
    }
}
