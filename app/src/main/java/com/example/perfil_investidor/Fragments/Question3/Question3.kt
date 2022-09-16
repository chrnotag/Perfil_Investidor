package com.example.perfil_investidor.Fragments.Question3

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.Navigation
import com.example.perfil_investidor.Activities.Questions
import com.example.perfil_investidor.Fragments.Question1.Question1ViewModel
import com.example.perfil_investidor.R
import com.example.perfil_investidor.databinding.FragmentQuestion3Binding

class Question3 : Fragment() {

    companion object {
        fun newInstance() = Question3()
    }

    private var pontuacao = 0
    private var result = 0

    private var _binding: FragmentQuestion3Binding? = null

    private lateinit var viewModel: Question1ViewModel

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestion3Binding.inflate(inflater, container, false)


        setFragmentResultListener("key"){key, bundle ->
            result = bundle.getInt("bundleKey")
        }
        Responder()

        return binding.root
    }

    fun Responder(){
        binding.checkBoxA2.setOnClickListener {
            if (binding.checkBoxA2.isChecked) {
                pontuacao = 0
                setFragmentResult("key", bundleOf("bundleKey" to (pontuacao + result)))
                Navigation.findNavController(binding.root).navigate(R.id.action_question3_to_question4)
            }
        }

        binding.checkBoxB2.setOnClickListener {
            if (binding.checkBoxB2.isChecked) {
                pontuacao = 1
                setFragmentResult("key", bundleOf("bundleKey" to (pontuacao + result)))
                Navigation.findNavController(binding.root).navigate(R.id.action_question3_to_question4)
            }
        }

        binding.checkBoxC2.setOnClickListener {
            if (binding.checkBoxC2.isChecked) {
                pontuacao = 2
                setFragmentResult("key", bundleOf("bundleKey" to (pontuacao + result)))
                Navigation.findNavController(binding.root).navigate(R.id.action_question3_to_question4)
            }
        }

        binding.checkBoxD2.setOnClickListener {
            if (binding.checkBoxD2.isChecked) {
                pontuacao = 4
                setFragmentResult("key", bundleOf("bundleKey" to (pontuacao + result)))
                println("teste: ${result}")
                Navigation.findNavController(binding.root).navigate(R.id.action_question3_to_question4)
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Question1ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}