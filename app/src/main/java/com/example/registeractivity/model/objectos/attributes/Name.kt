package com.example.registeractivity.model.objectos.attributes

import com.google.gson.annotations.SerializedName

class Name {

    @SerializedName("title")
    lateinit var title: String

    @SerializedName("first")
    lateinit var first: String

    @SerializedName("last")
    lateinit var last: String
}