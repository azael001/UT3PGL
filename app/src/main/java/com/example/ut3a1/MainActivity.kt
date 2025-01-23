package com.example.ut3a1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ut3a1.ui.theme.UT3A1Theme
import com.example.ut3a1.view.PostListScreen
import com.example.ut3a1.viewModel.PostViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UT3A1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                  val viewModel = PostViewModel()
                    PostListScreen(viewModel)
                }
            }
        }
    }
}

