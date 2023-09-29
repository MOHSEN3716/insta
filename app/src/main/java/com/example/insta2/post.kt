package com.example.insta2

import com.google.gson.annotations.SerializedName
import retrofit2.http.GET

class post {

    @SerializedName("mostviewedvideos")
    var userpostarray:ArrayList<Userpost>? = null
}