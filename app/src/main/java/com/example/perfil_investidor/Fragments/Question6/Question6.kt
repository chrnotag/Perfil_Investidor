package com.example.perfil_investidor.Fragments.Question6

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
import com.example.perfil_investidor.databinding.FragmentQuestion6Binding

class Question6 : Fragment() {

    companion object {
        fun newInstance() = Question6()
    }

    private var _binding: FragmentQuestion6Binding? = null

    private lateinit var viewModel: Question1ViewModel

    private val binding get() = _binding!!

    private val args: Question6Args by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestion6Binding.inflate(inflater, container, false)

        Responder()

        return binding.root
    }

    fun Responder(){

        val pts = args.result

        binding.checkBoxA.setOnClickListener {
            if (binding.checkBoxA.isChecked) {
                val action = Question6Directions.actionQuestion6ToQuestion7(pts)
                Navigation.findNavController(binding.root).navigate(action)
            }
        }

        binding.checkBoxB.setOnClickListener {
            if (binding.checkBoxB.isChecked) {
                val action = Question6Directions.actionQuestion6ToQuestion7(2 + pts)
                println("teste $pts")
                Navigation.findNavController(binding.root).navigate(action)
            }
        }

        binding.checkBoxC.setOnClickListener {
            if (binding.checkBoxC.isChecked) {
                val action = Question6Directions.actionQuestion6ToQuestion7(3 + pts)
                Navigation.findNavController(binding.root).navigate(action)
            }
        }

        binding.checkBoxD.setOnClickListener {
            if (binding.checkBoxD.isChecked) {
                val action = Question6Directions.actionQuestion6ToQuestion7(4 + pts)
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