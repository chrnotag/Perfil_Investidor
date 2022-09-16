package com.example.perfil_investidor.Fragments.Question2

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
import com.example.perfil_investidor.databinding.FragmentQuest2Binding
import com.example.perfil_investidor.databinding.FragmentQuestion1Binding

class Quest2 : Fragment() {

    var pontuacao = 0
    private var result = 0

    companion object {
        fun newInstance() = Quest2()
    }

    private var _binding: FragmentQuest2Binding? = null

    private lateinit var viewModel: Question1ViewModel

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuest2Binding.inflate(inflater, container, false)


        setFragmentResultListener("key") { key, bundle ->
            result = bundle.getInt("bundleKey")
            Responder()

        }

        return binding.root
    }

    fun Responder() {
        binding.checkBoxA1.setOnClickListener {
            if (binding.checkBoxA1.isChecked) {
                Navigation.findNavController(binding.root).navigate(R.id.action_quest2_to_question3)
                pontuacao = 0
                setFragmentResult("key", bundleOf("bundleKey" to (pontuacao + result)))
            }
        }

        binding.checkBoxB1.setOnClickListener {
            if (binding.checkBoxB1.isChecked) {
                Navigation.findNavController(binding.root).navigate(R.id.action_quest2_to_question3)
                pontuacao = 2
                setFragmentResult("key", bundleOf("bundleKey" to (pontuacao + result)))
            }
        }

        binding.checkBoxC1.setOnClickListener {
            if (binding.checkBoxC1.isChecked) {
                Navigation.findNavController(binding.root).navigate(R.id.action_quest2_to_question3)
                pontuacao = 4
                setFragmentResult("key", bundleOf("bundleKey" to (pontuacao + result)))
            }
        }

        binding.checkBoxD1.setOnClickListener {
            if (binding.checkBoxD1.isChecked) {
                Navigation.findNavController(binding.root).navigate(R.id.action_quest2_to_question3)
                pontuacao = 5
                setFragmentResult("key", bundleOf("bundleKey" to (pontuacao + result)))
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
        // TODO: Use the ViewModel
    }

}