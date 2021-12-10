package com.example.music.data.repositories;

import com.example.music.data.database.model.Music
import kotlinx.coroutines.flow.Flow
interface Repository {

    fun getAllSong(): Flow<HandleRepository<kotlin.collections.List<Music>>>

    fun getSong(): Flow<HandleRepository<Music>>



}
