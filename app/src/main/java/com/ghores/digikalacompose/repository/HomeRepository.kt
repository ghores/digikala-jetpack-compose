package com.ghores.digikalacompose.repository

import com.ghores.digikalacompose.data.model.home.Slider
import com.ghores.digikalacompose.data.remote.BaseApiResponse
import com.ghores.digikalacompose.data.remote.HomeApiInterface
import com.ghores.digikalacompose.data.remote.NetworkResult
import javax.inject.Inject

class HomeRepository @Inject constructor(
    private val api: HomeApiInterface
) : BaseApiResponse() {
    suspend fun getSlider(): NetworkResult<List<Slider>> =
        safeApiCall {
            api.getSlider()
        }
}