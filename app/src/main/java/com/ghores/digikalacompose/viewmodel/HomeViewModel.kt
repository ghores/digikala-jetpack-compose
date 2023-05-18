package com.ghores.digikalacompose.viewmodel

import androidx.lifecycle.ViewModel
import com.ghores.digikalacompose.repository.HomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: HomeRepository
) : ViewModel() {
}