package com.example.music.data.repositories

sealed class HandleRepository<T>(
    val data : T? = null,
    val message :String? = null
){
    class Success  <T>(data:T?) : HandleRepository<T> (data)
    class Error<T> (message: String?,data: T?=null) : HandleRepository<T>(data,message)
    class Loading<T> (data: T? = null ) : HandleRepository <T> (data)


}
