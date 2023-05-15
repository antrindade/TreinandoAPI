package com.example.registeractivity.repository

import com.example.registeractivity.model.UserModel
import com.example.registeractivity.service.ServiceUser
import com.example.registeractivity.service.listener.APIListener
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class RepositoryUser {

    private val remote = RetrofitUser.getService(ServiceUser::class.java)

    fun gerarUser(listener: APIListener<UserModel>) {
        val call = remote.gerarUserN()
        call.enqueue(object : Callback<UserModel> {
            override fun onResponse(call: Call<UserModel>, response: Response<UserModel>) {
                response.body()?.let { listener.onSucess(it) }
            }

            override fun onFailure(call: Call<UserModel>, t: Throwable) {
                val s = ""
            }

        })
    }
}