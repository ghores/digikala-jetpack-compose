package com.ghores.digikalacompose.ui.screens

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.ghores.digikalacompose.ui.theme.SelectedBottomBarDark
import com.ghores.digikalacompose.ui.theme.SelectedBottomBarLight
import com.ghores.digikalacompose.ui.theme.UnSelectedBottomBarDark
import com.ghores.digikalacompose.ui.theme.UnSelectedBottomBarLight

@Composable
fun BasketScreen(navController: NavHostController) {

    if (isSystemInDarkTheme()) {
        BasketDark()
    } else {
        BasketLight()
    }

}

@Composable
fun BasketLight() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "BasketScreen",
            color = if (isSystemInDarkTheme()) SelectedBottomBarLight
        else SelectedBottomBarDark
        )
    }
}

@Composable
fun BasketDark() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "BasketScreen",
            color = if (isSystemInDarkTheme()) UnSelectedBottomBarLight
        else UnSelectedBottomBarDark
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BasketLightPreview() {
    BasketLight()
}

@Preview(showBackground = true,
uiMode = UI_MODE_NIGHT_YES)
@Composable
fun BasketDarkPreview() {
    BasketDark()
}







