package com.example.ut3a1.viewModel

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.ut3a1.api.ApiClient
import com.example.ut3a1.model.Post
import kotlinx.coroutines.launch


class PostViewModel: ViewModel() {
    private val _posts = mutableStateListOf<Post>()
    val posts: List<Post> get() = _posts
    init{
        getPosts()
    }
    private fun getPosts(){
        viewModelScope.launch {
            try{
                _posts.clear()
                _posts.addAll(ApiClient.apiService.getPosts())
            } catch (e: Exception){
                Log.e("PostViewModel","Error recuperando Post",e)

            }
        }
    }
}