package com.example.registeractivity.service

import com.example.registeractivity.model.UserModel
import retrofit2.Call
import retrofit2.http.GET

interface ServiceUser {
        @GET("api")
        fun gerarUserN(): Call<UserModel>
}