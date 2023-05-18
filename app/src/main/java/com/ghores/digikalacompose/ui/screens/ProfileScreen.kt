package com.ghores.digikalacompose.ui.screens

import android.app.Activity
import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.ghores.digikalacompose.MainActivity
import com.ghores.digikalacompose.util.Constants.ENGLISH_LANG
import com.ghores.digikalacompose.util.Constants.PERSIAN_LANG
import com.ghores.digikalacompose.viewmodel.DataStoreViewModel

@Composable
fun ProfileScreen(
    navController: NavHostController,
    dataStore: DataStoreViewModel = hiltViewModel()
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        val activity = LocalContext.current as Activity

        Button(onClick = {
            dataStore.saveUserLanguage(PERSIAN_LANG)
            activity.apply {
                finish()
                startActivity(Intent(activity, MainActivity::class.java))
            }
        }) {
            Text(text = "fa")
        }
        Button(onClick = {
            dataStore.saveUserLanguage(ENGLISH_LANG)
            activity.apply {
                finish()
                startActivity(Intent(activity, MainActivity::class.java))
            }
        }) {
            Text(text = "en")
        }
    }
}