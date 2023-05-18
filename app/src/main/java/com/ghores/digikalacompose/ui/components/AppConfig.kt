package com.ghores.digikalacompose.ui.components

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.ghores.digikalacompose.util.Constants.USER_LANGUAGE
import com.ghores.digikalacompose.viewmodel.DataStoreViewModel

@Composable
fun AppConfig(
    dataStore: DataStoreViewModel = hiltViewModel()
) {
    getDataStoreVariables(dataStore)
}

private fun getDataStoreVariables(dataStore: DataStoreViewModel) {
    USER_LANGUAGE = dataStore.getUserLanguage()
}