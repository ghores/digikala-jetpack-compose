package com.ghores.digikalacompose.repository

import com.ghores.digikalacompose.data.remote.BaseApiResponse
import com.ghores.digikalacompose.data.remote.HomeApiInterface
import javax.inject.Inject

class HomeRepository @Inject constructor(
    private val api: HomeApiInterface
) : BaseApiResponse() {
}