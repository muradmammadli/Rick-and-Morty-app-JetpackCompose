package com.az.rickandmortyapp.presentation.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(
    navHostController: NavHostController
){
    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.route
    ){

        composable(
            route = Screen.Home.route
        ){
            HomeScreen(navHostController)
        }

        composable(
            route = Screen.Detail.route
        ){
            DetailsScreen()
        }


    }

}