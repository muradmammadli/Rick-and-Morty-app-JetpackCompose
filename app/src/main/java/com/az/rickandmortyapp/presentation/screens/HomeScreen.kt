package com.az.rickandmortyapp.presentation.screens

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.az.rickandmortyapp.R
import com.az.rickandmortyapp.presentation.viewmodel.CharacterViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,
    characterViewModel: CharacterViewModel
) {
    val characters by characterViewModel.getCharacters().collectAsState(initial = emptyList())
    val topBarBackgroundColor = colorResource(id = R.color.blue_100)
    val screenBackgroundColor = colorResource(id = R.color.gray100)

    Scaffold(
        containerColor = screenBackgroundColor,
        topBar = {
            TopAppBar(
                title = { Text(text = "My App Title") },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = topBarBackgroundColor,
                    titleContentColor = Color.White
                )
            )
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            LazyColumn {
                items(characters) {
                    CharacterListItem(character = it, navController)
                }
            }
        }
    }
}


//@Composable
//@Preview(showBackground = true)
//fun HomeScreenPreview() {
//    HomeScreen(
//        navController = rememberNavController(),
//        characterViewModel = viewModel()
//    )
//}