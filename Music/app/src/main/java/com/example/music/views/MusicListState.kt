package com.example.music.views

import com.example.music.data.database.model.Music

data class MusicListState(
    val isLoading: Boolean = false,
    val books: List<Music> = emptyList(),
    val error: String = ""
)