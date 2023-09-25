package com.example.insta2

import com.google.gson.annotations.SerializedName
import retrofit2.http.GET

class post {

    @SerializedName("hist")
    var userpostarray:ArrayList<Userpost>? = null
}