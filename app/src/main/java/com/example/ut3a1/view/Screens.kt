package com.example.ut3a1.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ut3a1.model.Post
import com.example.ut3a1.viewModel.PostViewModel


@Composable
fun PostListScreen(viewmodel:PostViewModel){
    val posts = viewmodel.posts
    Column(
        modifier = Modifier
            .padding(7.dp, 32.dp)
    ) {
        Text(
            text="Post",
            fontSize= 30.sp,
            fontWeight = FontWeight.Bold
        )
        LazyColumn {
            items(posts){ post ->
                PostItem(post)
            }
        }
    }
}
@Composable
fun PostItem(post:Post){
    Card(
        modifier = Modifier
            .padding(8.dp)
    ) {
        Text(text=post.id.toString())
        Spacer(modifier = Modifier.height(8.dp))
        Text(text=post.tittle)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text=post.body)
    }
}