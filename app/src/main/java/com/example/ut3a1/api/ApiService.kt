package com.example.ut3a1.api
import com.example.ut3a1.model.Post
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getPosts(): List<Post>
}