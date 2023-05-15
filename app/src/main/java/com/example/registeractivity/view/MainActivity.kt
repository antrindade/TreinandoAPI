package com.example.registeractivity.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.registeractivity.view.viewmodel.MainViewModel
import com.example.registeractivity.R
import com.example.registeractivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[(MainViewModel::class.java)]

        binding.gerar.setOnClickListener {
            geradorUser()
        }

        observe()


    }

    fun observe() {
        viewModel.teste1.observe(this) {
            binding.name.text = "${it.name.title} ${it.name.first} ${it.name.last}"
            binding.email.text = it.email
            val url = it.picture.medium
            val imageview: ImageView=findViewById(R.id.photo)
            Glide.with(this).load(url).into(imageview)
        }
    }

    override fun onResume() {
        super.onResume()
    }

    private fun geradorUser() {
        viewModel.gerarUser()
    }


}