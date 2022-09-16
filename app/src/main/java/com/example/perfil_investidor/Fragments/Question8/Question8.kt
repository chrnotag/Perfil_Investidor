package com.example.perfil_investidor.Fragments.Question8

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
import com.example.perfil_investidor.databinding.FragmentQuestion8Binding

class Question8 : Fragment() {

    companion object {
        fun newInstance() = Question8()
    }

    private var pontuacao = 0

    private var result = 0

    private var _binding: FragmentQuestion8Binding? = null

    private lateinit var viewModel: Question1ViewModel

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestion8Binding.inflate(inflater, container, false)

        setFragmentResultListener("key"){key, bundle ->
            result = bundle.getInt("bundleKey")}
        Responder()

        return binding.root
    }

    fun Responder(){
        binding.checkBoxA.setOnClickListener {
            if (binding.checkBoxA.isChecked) {
                Navigation.findNavController(binding.root).navigate(R.id.action_question8_to_question9)
                pontuacao = 0
                setFragmentResult("key", bundleOf("bundleKey" to (pontuacao + result)))
            }
        }

        binding.checkBoxB.setOnClickListener {
            if (binding.checkBoxB.isChecked) {
                Navigation.findNavController(binding.root).navigate(R.id.action_question8_to_question9)
                pontuacao = 1
                setFragmentResult("key", bundleOf("bundleKey" to (pontuacao + result)))
            }
        }

        binding.checkBoxC.setOnClickListener {
            if (binding.checkBoxC.isChecked) {
                Navigation.findNavController(binding.root).navigate(R.id.action_question8_to_question9)
                pontuacao = 2
                setFragmentResult("key", bundleOf("bundleKey" to (pontuacao + result)))
            }
        }

        binding.checkBoxD.setOnClickListener {
            if (binding.checkBoxD.isChecked) {
                Navigation.findNavController(binding.root).navigate(R.id.action_question8_to_question9)
                pontuacao = 4
                setFragmentResult("key", bundleOf("bundleKey" to (pontuacao + result)))
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Question1ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}