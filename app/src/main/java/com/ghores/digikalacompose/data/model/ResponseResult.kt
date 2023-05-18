package com.ghores.digikalacompose.data.model

data class ResponseResult<T>(
    val message: String,
    val data: T,
    val success: Boolean
)