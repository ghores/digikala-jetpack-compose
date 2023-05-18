package com.ghores.digikalacompose.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.ghores.digikalacompose.navigation.Screen
import com.ghores.digikalacompose.ui.theme.SplashBg
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun ChangeStatusBarColor(navController: NavHostController) {

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val systemUiController = rememberSystemUiController()
    when (navBackStackEntry?.destination?.route) {
        Screen.Splash.route -> {
            SideEffect {
                systemUiController.setStatusBarColor(
                    color = SplashBg
                )
            }
        }
        else -> {
            SideEffect {
                systemUiController.setStatusBarColor(
                    color = Color.White
                )
            }
        }
    }
}