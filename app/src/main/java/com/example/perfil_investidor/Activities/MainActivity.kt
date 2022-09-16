package com.example.perfil_investidor.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.perfil_investidor.R
import com.example.perfil_investidor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar!!.title = "Banco Paulista - Perfil Investidor"

        binding.Start.setOnClickListener {
            startActivity(Intent(this, Questions::class.java))
        }
    }
}