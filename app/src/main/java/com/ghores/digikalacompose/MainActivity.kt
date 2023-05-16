package com.ghores.digikalacompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ghores.digikalacompose.navigation.BottomNavigationBar
import com.ghores.digikalacompose.navigation.SetupNavGraph
import com.ghores.digikalacompose.ui.theme.DigikalaComposeTheme

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DigikalaComposeTheme {
                navController = rememberNavController()

                Scaffold(
                    bottomBar = {
                    BottomNavigationBar(navController = navController, onItemClick = {
                        navController.navigate(it.route)
                    })
                    }
                ) {
                    SetupNavGraph(navController = navController)
                }
            }
        }
    }
}

