package com.example.insta2

import retrofit2.Call
import retrofit2.http.GET

interface postservice {

    @GET("https://www.aparat.com//etc/api/mostviewedvideos\n")
    fun getvideolist(): Call<post>
}