package com.ghores.digikalacompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ghores.digikalacompose.navigation.BottomNavigationBar
import com.ghores.digikalacompose.navigation.SetupNavGraph
import com.ghores.digikalacompose.ui.theme.DigikalaComposeTheme
import com.ghores.digikalacompose.util.Constants.PERSIAN_LANG
import com.ghores.digikalacompose.util.LocaleUtils

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DigikalaComposeTheme {
                navController = rememberNavController()

                LocaleUtils.setLocale(LocalContext.current, PERSIAN_LANG)

                CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
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
}

