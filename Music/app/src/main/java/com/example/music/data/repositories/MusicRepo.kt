package com.example.music.data.repositories

import com.example.music.data.database.model.Music
import com.google.firebase.firestore.CollectionReference
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class  MusicRepo
@Inject
constructor(
    private val songList: CollectionReference
):Repository {


   override fun getAllSong() : Flow<HandleRepository<List<Music>>> = flow {
        try {
            emit(HandleRepository.Loading<List<Music>>())
            val songList = songList.get().await().map{
                document->document.toObject(Music::class.java)
            }
            emit(HandleRepository.Success<List<Music>>(data = songList))

        }catch (e:Exception)
        {
            emit(HandleRepository.Error<List<Music>>(message = e.localizedMessage?:"Error Music"))
        }
    }

    override fun getSong(): Flow<HandleRepository<Music>> = flow {
        try {

        }catch (e:Exception){
            emit(HandleRepository.Error<Music>(message = e.localizedMessage?:"Error Music"))
        }
    }
}