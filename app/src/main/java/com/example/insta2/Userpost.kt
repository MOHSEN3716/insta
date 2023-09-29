package com.example.insta2

import com.google.gson.annotations.SerializedName

class Userpost {
    @SerializedName("mostviewedvideos")
    var postvideo:String?=null
    var tag:String?=null
    var views:Int?=null
    var comments:Int?=null
    var likes:Int?=null
    var username :String?=null
    var userImageURL:String?=null

}