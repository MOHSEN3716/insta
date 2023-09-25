package com.example.insta2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.POST

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      requesrgetpost()
    }

    private fun requesrgetpost() {
        var postservice=GETRETROFILD()!!.create(postservice::class.java)
        var callsevise=postservice.getvideolist()
        callsevise.enqueue(object:Callback<post>{
            override fun onResponse(call: Call<post>, response: Response<post>) {
                var post=response.body()
                post?.userpostarray?.forEach {
                    Log.d("TAGXX","onResponse:${it?.user}")



                }

            }

            override fun onFailure(call: Call<post>, t: Throwable) {

                Log.d("TAGXX","onFailure:${t.message}")

            }

        })
    }

    fun GETRETROFILD(): Retrofit? {
        var retrofit: Retrofit? = null
        if (retrofit == null) {

            retrofit = Retrofit.Builder()
                .baseUrl("https://pixabay.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit;

    }


}