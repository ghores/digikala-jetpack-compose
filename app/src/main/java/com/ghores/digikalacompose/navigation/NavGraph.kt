package com.ghores.digikalacompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ghores.digikalacompose.ui.screens.BasketScreen
import com.ghores.digikalacompose.ui.screens.CategoryScreen
import com.ghores.digikalacompose.ui.screens.home.HomeScreen
import com.ghores.digikalacompose.ui.screens.ProfileScreen
import com.ghores.digikalacompose.ui.screens.SplashScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(route = Screen.Category.route) {
            CategoryScreen(navController = navController)
        }
        composable(route = Screen.Basket.route) {
            BasketScreen(navController = navController)
        }
        composable(route = Screen.Profile.route) {
            ProfileScreen(navController = navController)
        }
    }
}