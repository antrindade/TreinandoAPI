package com.example.registeractivity.view.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.registeractivity.model.UserModel
import com.example.registeractivity.model.objectos.Objectos
import com.example.registeractivity.repository.RepositoryUser
import com.example.registeractivity.service.listener.APIListener


class MainViewModel(application: Application) : AndroidViewModel(application) {

    private var repository = RepositoryUser()

    private var teste = MutableLiveData<Objectos>()
    val teste1: LiveData<Objectos> = teste

    private var _email = MutableLiveData<String>()
    val email: String = teste.toString()

    fun gerarUser() {
        repository.gerarUser(object : APIListener<UserModel> {
            override fun onSucess(result: UserModel) {
                teste.value = result.results[0]
            }

            override fun onFailure(msg: String) {
                TODO("Not yet implemented")
            }

        })
    }
}