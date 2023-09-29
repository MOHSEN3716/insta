package com.example.insta2

import com.google.gson.annotations.SerializedName
import java.net.URL

class Userpost {
    @SerializedName("mostviewedvideos")
    var small_poster:String?=null
    var tag:String?=null
    var views:Int?=null
    var comments:Int?=null
    var likes:Int?=null
    var username :String?=null
    var userImageURL:String?=null

}