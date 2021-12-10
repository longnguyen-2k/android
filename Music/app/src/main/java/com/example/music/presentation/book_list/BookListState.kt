package com.example.music.presentation.book_list

import com.example.music.model.Book


data class BookListState(
    val isLoading: Boolean = false,
    val books: List<Book> = emptyList(),
    val error: String = ""
)
