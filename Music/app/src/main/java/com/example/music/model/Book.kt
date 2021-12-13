package com.example.music.model

data class Book(
    val id: String,
    val image: String,
    val title: String,
    val author: String,
){

    constructor() : this("", "", "", "")

}
