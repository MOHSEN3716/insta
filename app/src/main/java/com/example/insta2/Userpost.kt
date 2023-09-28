package com.example.insta2

import com.google.gson.annotations.SerializedName

class Userpost {
    @SerializedName("webformatURL")
    var postvideo:String?=null
    var tag:String?=null
    var views:Int?=null
    var comments:Int?=null
    var likes:Int?=null

    @SerializedName("user")
    var username:String?=null


    @SerializedName("userImageURL")
    var userImageURL:String?=null

}