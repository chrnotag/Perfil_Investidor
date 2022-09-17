package com.example.perfil_investidor.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import com.example.perfil_investidor.R
import com.example.perfil_investidor.databinding.ActivitySplashLoadinBinding

class Resultado : AppCompatActivity() {

    private val binding by lazy {
        ActivitySplashLoadinBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar!!.title = "Resultado"

        val extras = intent.extras

        var resultado = 0

        println("resultado final: ${extras?.getInt("intent")}")

        if(extras !=null){
            resultado = extras.getInt("intent")
        }

        if(resultado <= 14){
            binding.perfil.text = "Conservador"
        }else if(resultado >= 15 && resultado <= 30){
            binding.perfil.text = "Moderado"
        }else if( resultado >= 31){
            binding.perfil.text = "Arrojado"
        }

        binding.newTest.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            this.finishAffinity()
        }

        setContentView(binding.root)
    }
}