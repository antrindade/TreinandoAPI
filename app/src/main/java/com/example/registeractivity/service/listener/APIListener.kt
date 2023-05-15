package com.example.registeractivity.service.listener

import com.example.registeractivity.model.UserModel

interface APIListener<T> {
    fun onSucess(result: UserModel)
    fun onFailure(msg: String)
}