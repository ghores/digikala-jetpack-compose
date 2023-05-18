package com.ghores.digikalacompose.data.model.home


import com.google.gson.annotations.SerializedName

data class Slider(
    @SerializedName("category")
    val category: String, // home_page_top
    @SerializedName("_id")
    val id: String, // 63b5e4c3dc09573258a76f1c
    @SerializedName("image")
    val image: String, // https://dkstatics-public.digikala.com/digikala-adservice-banners/ff89f6c6b6daff80dbfacca4e97690ab8918a754_1674676169.jpg?x-oss-process=image/quality,q_95/format,webp
    @SerializedName("priority")
    val priority: Int, // 1
    @SerializedName("url")
    val url: String // link
)