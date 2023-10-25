package com.az.rickandmortyapp.presentation.screens

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.az.rickandmortyapp.R
import com.az.rickandmortyapp.data.model.Character
import com.az.rickandmortyapp.presentation.viewmodel.CharacterViewModel
import com.az.rickandmortyapp.ui.theme.RickAndMortyAppTheme


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(
    navHostController: NavHostController,
    characterViewModel: CharacterViewModel,
    id: Int
) {

    Log.d("afadfadfadf", id.toString())
    val character by characterViewModel.getCharacterDetails(id)
        .collectAsState(
            initial = Character()
        )

    Log.d("Character", character.toString())


    val topBarBackgroundColor = colorResource(id = R.color.blue_100)
    val screenBackgroundColor = colorResource(id = R.color.gray100)

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "My App Title") },
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = topBarBackgroundColor
                )
            )
        },
        content = {
            Column(modifier = Modifier.fillMaxSize()) {


            }
        }
    )
}


//@Composable
//@Preview(showBackground = true)
//fun DetatilsScreenPreview() {
//    RickAndMortyAppTheme {
//        DetailsScreen(rememberNavController(), characterViewModel,1)
//    }
//}