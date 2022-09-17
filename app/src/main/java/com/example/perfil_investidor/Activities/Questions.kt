package com.example.perfil_investidor.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.perfil_investidor.Fragments.Question1.Question1
import com.example.perfil_investidor.Fragments.Question1.Question1Args
import com.example.perfil_investidor.Fragments.Question1.Question1Directions
import com.example.perfil_investidor.Fragments.Question1.Question1ViewModel
import com.example.perfil_investidor.R
import com.example.perfil_investidor.databinding.ActivityQuestionsBinding
import com.google.android.material.navigation.NavigationView

class Questions : AppCompatActivity() {

    private val binding by lazy {
        ActivityQuestionsBinding.inflate(layoutInflater)
    }

    private val viewModel: Question1ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar!!.hide()

        viewModel.resultado.observe(this, Observer {})

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragView) as NavHostFragment

        val navController: NavController = navHostFragment.navController

        NavigationUI.setupActionBarWithNavController(this, navController)
    }
}