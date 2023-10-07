package com.example.insta2

import com.google.gson.annotations.SerializedName
import java.net.URL

class Userpost {
    @SerializedName("mostviewedvideos")
    var big_poster:String?=null
    var userid:String?=null
    var duration:String?=null
    var sdate:String?=null
    var likes:Int?=null
    var username :String?=null
    var userImageURL:String?=null
    var title :String?=null

}