package com.example.registeractivity.model.objectos

import com.example.registeractivity.model.objectos.attributes.Name
import com.example.registeractivity.model.objectos.attributes.Pictures
import com.google.gson.annotations.SerializedName

class Objectos {

    @SerializedName("name")
    lateinit var name: Name

    @SerializedName("email")
    lateinit var email: String

    @SerializedName("picture")
    lateinit var picture: Pictures




}