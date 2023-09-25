package com.example.insta2

import retrofit2.Call
import retrofit2.http.GET

interface postservice {

    @GET("?key=39448331-f50b4a2021903f5a9ad2c1232&q=yellow+flowers&image_type=photo&pretty=true")
    fun getvideolist(): Call<post>
}