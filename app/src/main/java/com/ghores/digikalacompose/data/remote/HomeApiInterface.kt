package com.ghores.digikalacompose.data.remote

import com.ghores.digikalacompose.data.model.ResponseResult
import com.ghores.digikalacompose.data.model.home.Slider
import retrofit2.Response
import retrofit2.http.GET

interface HomeApiInterface {

    @GET("getSlider")
    suspend fun getSlider(): Response<ResponseResult<List<Slider>>>
}