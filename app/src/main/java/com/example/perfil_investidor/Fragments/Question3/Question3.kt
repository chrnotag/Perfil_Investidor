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
import androidx.navigation.fragment.navArgs
import com.example.perfil_investidor.Activities.Questions
import com.example.perfil_investidor.Fragments.Question1.Question1ViewModel
import com.example.perfil_investidor.Fragments.Question2.Quest2Directions
import com.example.perfil_investidor.R
import com.example.perfil_investidor.databinding.FragmentQuestion3Binding

class Question3 : Fragment() {

    companion object {
        fun newInstance() = Question3()
    }

    private var _binding: FragmentQuestion3Binding? = null

    private lateinit var viewModel: Question1ViewModel

    private val binding get() = _binding!!

    private val args: Question3Args by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestion3Binding.inflate(inflater, container, false)

        Responder()

        return binding.root
    }

    fun Responder(){
        val pts = args.result

        binding.checkBoxA2.setOnClickListener {
            if (binding.checkBoxA2.isChecked) {
                val action = Question3Directions.actionQuestion3ToQuestion4(0 + pts)
                Navigation.findNavController(binding.root).navigate(action)
            }
        }

        binding.checkBoxB2.setOnClickListener {
            if (binding.checkBoxB2.isChecked) {
                val action = Question3Directions.actionQuestion3ToQuestion4(1 + pts)
                println("teste $pts")
                Navigation.findNavController(binding.root).navigate(action)
            }
        }

        binding.checkBoxC2.setOnClickListener {
            if (binding.checkBoxC2.isChecked) {
                val action = Question3Directions.actionQuestion3ToQuestion4(2 + pts)
                Navigation.findNavController(binding.root).navigate(action)
            }
        }

        binding.checkBoxD2.setOnClickListener {
            if (binding.checkBoxD2.isChecked) {
                val action = Question3Directions.actionQuestion3ToQuestion4(4 + pts)
                Navigation.findNavController(binding.root).navigate(action)
            }
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(Question1ViewModel::class.java)
        // TODO: Use the ViewModel
    }

}