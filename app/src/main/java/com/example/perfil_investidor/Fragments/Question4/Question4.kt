package com.example.perfil_investidor.Fragments.Question4

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
import com.example.perfil_investidor.databinding.FragmentQuestion4Binding

class Question4 : Fragment() {

    companion object {
        fun newInstance() = Question4()
    }

    private var pontuacao = 0

    private var result = 0

    private var _binding: FragmentQuestion4Binding? = null

    private lateinit var viewModel: Question1ViewModel

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestion4Binding.inflate(inflater, container, false)


        setFragmentResultListener("key") { key, bundle ->
            result = bundle.getInt("bundleKe")
        }

        Responder()

        return binding.root
    }

    fun Responder() {
        binding.checkBoxA3.setOnClickListener {
            if (binding.checkBoxA3.isChecked) {
                Navigation.findNavController(binding.root)
                    .navigate(R.id.action_question4_to_question5)
                pontuacao = 0
                setFragmentResult("key", bundleOf("bundleKey" to (pontuacao + result)))
            }
        }

        binding.checkBoxB3.setOnClickListener {
            if (binding.checkBoxB3.isChecked) {
                Navigation.findNavController(binding.root)
                    .navigate(R.id.action_question4_to_question5)
                pontuacao = 2
                setFragmentResult("key", bundleOf("bundleKey" to (pontuacao + result)))
            }
        }

        binding.checkBoxC3.setOnClickListener {
            if (binding.checkBoxC3.isChecked) {
                Navigation.findNavController(binding.root)
                    .navigate(R.id.action_question4_to_question5)
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