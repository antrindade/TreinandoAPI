package com.example.registeractivity.repository

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitUser private constructor() {

    companion object {

        private lateinit var INSTANCE: Retrofit
        private const val HTTP: String = "https://randomuser.me/"

        private fun getRetrofitInstance(): Retrofit {
            val httpClient = OkHttpClient.Builder()

            //Retorna com o que ia fazer


            if (!Companion::INSTANCE.isInitialized) {
                synchronized(RetrofitUser::class.java) {
                    INSTANCE = Retrofit.Builder()
                        .baseUrl(HTTP)
                        .client(httpClient.build())
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
                }
            }
            return INSTANCE
        }

        fun <T> getService(serviceClass: Class<T>): T {
            return getRetrofitInstance().create(serviceClass)
        }
    }


}