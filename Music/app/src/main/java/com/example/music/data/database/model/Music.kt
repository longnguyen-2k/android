package com.example.music.data.database.model

data class Music(
    val id:String,
    val AuthorAvatar:String,
    val title: String,
    val des: String,
    val name: String,
    val rank: Int
)
{
    constructor():this("","","","","",1)
}