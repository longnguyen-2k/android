package com.example.music.screens;


import android.content.Context
import android.media.MediaPlayer
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.music.R
import com.example.music.navigation.Destination
import com.example.music.ui.components.PlayerSlider
import com.example.music.ui.components.SongDescription
import com.example.music.ui.components.TopAppBar
import java.time.Duration


/**
     * PlayerScreen
     * */
    @RequiresApi(Build.VERSION_CODES.O)
    @Composable
    fun PlayScreen(navController: NavController,context:Context) {

    val mp: MediaPlayer = MediaPlayer.create(context, R.raw.audio)
    var state = remember { mutableStateOf(false) }

    Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFF421F80),
                            Color(0xFFFF256F),
                            Color(0xFFCC3403)
                        )
                    )
                )
                .padding(horizontal = 10.dp)
        ) {
            TopAppBar(
                title = "My Music",
                icon= Icons.Default.ArrowBack,
                onIconClick= {navController.navigate(Destination.Home.route)}
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(horizontal = 10.dp)
            ) {
                Spacer(modifier = Modifier.weight(1f))
                Spacer(modifier = Modifier.height(30.dp))
                Image(
                    painter = painterResource(id = R.drawable.author2),
                    contentDescription = "Song banner",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .sizeIn(maxWidth = 500.dp, maxHeight = 500.dp)
                        .aspectRatio(1f)
                        .clip(RoundedCornerShape(10.dp))
                        .weight(10f)
                )
                Spacer(modifier = Modifier.height(30.dp))


                SongDescription("Fade", "Alan walker")
                Spacer(modifier = Modifier.height(35.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.weight(10f)
                ) {
                    PlayerSlider(Duration.ofMillis(mp.duration.toLong()))
                    Spacer(modifier = Modifier.height(40.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        val buttonModifier = Modifier
                            .size(42.dp)
                            .semantics { role = Role.Button }

                        Image(
                            imageVector = Icons.Filled.SkipPrevious,
                            contentDescription = "Skip Previous",
                            contentScale = ContentScale.Fit,
                            colorFilter = ColorFilter.tint(Color.White),
                            modifier = buttonModifier
                        )

                        Image(
                            imageVector = Icons.Filled.Replay10,
                            contentDescription = "Reply 10 Second",
                            contentScale = ContentScale.Fit,
                            colorFilter = ColorFilter.tint(Color.White),
                            modifier = buttonModifier
                        )
                        if (state.value) {
                            IconButton(onClick = {
                                 if(mp.isPlaying) {
                                    mp.stop()
                                }
                                state.value =false
                            }
                            ) {
                                Icon(imageVector = Icons.Filled.Pause,
                                    contentDescription = "Pause",
                                    tint = Color.White,
                                    modifier = Modifier
                                        .size(72.dp)
                                        .semantics { role = Role.Button }
                                )
                            }
                        } else {
                            IconButton(onClick = {
                                val length=mp.currentPosition
                                if (!mp.isPlaying) {
                                    mp.seekTo(length);
                                    mp.start();
                                }
                                state.value =true
                            }) {
                                Icon(imageVector = Icons.Filled.PlayCircle,
                                    contentDescription = "Play",
                                    tint = Color.White,
                                    modifier = Modifier
                                        .size(72.dp)
                                        .semantics { role = Role.Button }.fillMaxWidth(),

                                    )
                            }
                        }

                        Image(
                            imageVector = Icons.Filled.Forward10,
                            contentDescription = "Forward 10 Seconds",
                            contentScale = ContentScale.Fit,
                            colorFilter = ColorFilter.tint(Color.White),
                            modifier = buttonModifier
                        )

                        Image(
                            imageVector = Icons.Filled.SkipNext,
                            contentDescription = "Skip Next",
                            contentScale = ContentScale.Fit,
                            colorFilter = ColorFilter.tint(Color.White),
                            modifier = buttonModifier
                        )
                    }                }
                Spacer(modifier = Modifier.weight(1f))
            }


        }
    }