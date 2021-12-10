package com.example.music.presentation.book_detail

import com.example.music.model.Book


data class BookDetailState(
    val isLoading: Boolean = false,
    val book: Book? = null,
    val error: String = ""
)
