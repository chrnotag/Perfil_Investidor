package com.example.perfil_investidor.Fragments.Question1

import android.graphics.Path
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.example.perfil_investidor.Activities.Questions
import com.example.perfil_investidor.R
import com.example.perfil_investidor.databinding.FragmentQuestion1Binding

class Question1 : Fragment() {

    companion object {
        fun newInstance() = Question1()
    }

    private var pontuacao = 0

    private var _binding: FragmentQuestion1Binding? = null

    private lateinit var viewModel: Question1ViewModel

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestion1Binding.inflate(inflater, container, false)

        Responder()

        return binding.root

    }

    fun Responder(){

        binding.checkBoxA.setOnClickListener {
            if (binding.checkBoxA.isChecked) {
                Navigation.findNavController(binding.root).navigate(R.id.action_question1_to_quest2)
                pontuacao = 0
                viewModel.resultado.value = pontuacao
                setFragmentResult("key", bundleOf("bundleKey" to pontuacao))
            }
        }

        binding.checkBoxB.setOnClickListener {
            if (binding.checkBoxB.isChecked) {
                Navigation.findNavController(binding.root).navigate(R.id.action_question1_to_quest2)
                pontuacao = 2
                viewModel.resultado.value = pontuacao
                setFragmentResult("key", bundleOf("bundleKey" to pontuacao))
            }
        }

        binding.checkBoxC.setOnClickListener {
            if (binding.checkBoxC.isChecked) {
                Navigation.findNavController(binding.root).navigate(R.id.action_question1_to_quest2)
                pontuacao = 3
                setFragmentResult("key", bundleOf("bundleKey" to pontuacao))
            }
        }

        binding.checkBoxD.setOnClickListener {
            if (binding.checkBoxD.isChecked) {
                Navigation.findNavController(binding.root).navigate(R.id.action_question1_to_quest2)
                pontuacao = 4
                setFragmentResult("key", bundleOf("bundleKey" to pontuacao))
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Question1ViewModel::class.java)
    }

}