package com.example.frontend.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.frontend.screens.CameraScreen
import com.example.frontend.screens.TutorialScreen
import com.example.frontend.screens.WelcomeScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "welcome") {
        composable("welcome") {
            WelcomeScreen(navController)
        }
        composable("camera") {
            CameraScreen(navController)
        }
        composable("tutorial") {
            TutorialScreen(navController)
        }
    }
}
