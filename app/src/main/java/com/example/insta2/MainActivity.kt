package com.example.insta2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.POST

class MainActivity : AppCompatActivity() {
    lateinit var postadabter: postadabter
    lateinit var storyadapter: storyadapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView2=findViewById<RecyclerView>(R.id.Recyclerviewstory)
        storyadapter = storyadapter()
        recyclerView2.adapter=storyadapter
        recyclerView2.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        val recyclerview = findViewById<RecyclerView>(R.id.RecyclerView)
        postadabter = postadabter()
        recyclerview.adapter=postadabter
        recyclerview.layoutManager = LinearLayoutManager(this)
      requesrgetpost()
    }
    private fun requesrgetpost() {
        val postservice=getRetrofit()?.create(postservice::class.java)
        val callsevise=postservice?.getvideolist()

        callsevise?.enqueue(object:Callback<post>{
            override fun onResponse(call: Call<post>, response: Response<post>) {
                var posts=response.body()
                postadabter.loadedState(posts?.userpostarray)
                storyadapter.loadedState(posts?.userpostarray)
            }
            override fun onFailure(call: Call<post>, t: Throwable) {
                Log.d("TAGXX","onFailure:${t.message}")

            }
        })
    }
    private fun getRetrofit(): Retrofit? {
        var retrofit: Retrofit? = null
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl("https://www.aparat.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit
    }
}