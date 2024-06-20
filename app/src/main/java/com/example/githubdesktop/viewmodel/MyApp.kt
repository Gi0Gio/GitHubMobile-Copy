package com.example.githubdesktop.viewmodel

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.githubdesktop.view.Home
import com.example.githubdesktop.view.Profile

@Composable
fun MyApp(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home"){
        composable("home"){ Home(navController) }
        composable("profile"){ Profile() }
    }
}