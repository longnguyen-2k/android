package com.example.music.views

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.music.data.repositories.HandleRepository
import com.example.music.data.repositories.MusicRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val musicRepo: MusicRepo) : ViewModel() {

    val allSongs by lazy { musicRepo.getSong() }
    val selectedSong by lazy { musicRepo.getSong() }
    private val _state: MutableState<MusicListState> = mutableStateOf(MusicListState())
    val state: State<MusicListState> = _state

    init {
        getSongList()

    }

     fun getSongList() {
        musicRepo.getAllSong().onEach { result ->
            when (result) {
                is HandleRepository.Error -> {
                    _state.value = MusicListState(error = result.message ?: " Error ")
                }
                is HandleRepository.Loading -> {
                    _state.value = MusicListState(isLoading = true)

                }
                is HandleRepository.Success -> {
                    _state.value = MusicListState(books = result.data ?: emptyList())
                }

            }
        }.launchIn(viewModelScope)
    }

}