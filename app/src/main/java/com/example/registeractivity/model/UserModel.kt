package com.example.registeractivity.model

import com.example.registeractivity.model.objectos.Objectos
import com.google.gson.annotations.SerializedName

class UserModel {

    @SerializedName("results")
    lateinit var results: List<Objectos>
}