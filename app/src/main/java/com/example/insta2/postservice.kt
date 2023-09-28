package com.example.insta2

import retrofit2.Call
import retrofit2.http.GET

interface postservice {

    @GET("?key=25683553-328592f09b45deff6105e8e2d&q=yellow+flowers&image_type=photo")
    fun getvideolist(): Call<post>
}