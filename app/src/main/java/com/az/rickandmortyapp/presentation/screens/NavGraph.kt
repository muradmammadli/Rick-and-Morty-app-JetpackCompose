package com.az.rickandmortyapp.presentation.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.az.rickandmortyapp.presentation.viewmodel.CharacterViewModel

@Composable
fun SetupNavGraph(
    navHostController: NavHostController,
    characterViewModel: CharacterViewModel
){
    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.route
    ){

        composable(
            route = Screen.Home.route
        ){
            HomeScreen(navHostController,characterViewModel)
        }

        composable(
            route = "detail_screen/{id}",
            arguments = listOf(navArgument("id") { type = NavType.IntType })
        ) { backStackEntry ->
            val arguments = requireNotNull(backStackEntry.arguments)
            val itemId = arguments.getInt("id")
            DetailsScreen(navHostController, itemId)
        }
    }

}