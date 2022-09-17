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
import androidx.navigation.fragment.navArgs
import com.example.perfil_investidor.Activities.Questions
import com.example.perfil_investidor.Fragments.Question1.Question1ViewModel
import com.example.perfil_investidor.Fragments.Question2.Quest2Directions
import com.example.perfil_investidor.R
import com.example.perfil_investidor.databinding.FragmentQuestion4Binding

class Question4 : Fragment() {

    companion object {
        fun newInstance() = Question4()
    }

    private var _binding: FragmentQuestion4Binding? = null

    private lateinit var viewModel: Question1ViewModel

    private val binding get() = _binding!!

    private val args: Question4Args by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuestion4Binding.inflate(inflater, container, false)

        Responder()

        return binding.root
    }

    fun Responder() {

        val pts = args.result

        binding.checkBoxA3.setOnClickListener {
            if (binding.checkBoxA3.isChecked) {
                val action = Question4Directions.actionQuestion4ToQuestion5(0)
                Navigation.findNavController(binding.root).navigate(action)
            }
        }

        binding.checkBoxB3.setOnClickListener {
            if (binding.checkBoxB3.isChecked) {
                val action = Question4Directions.actionQuestion4ToQuestion5(2 + pts)
                println("teste $pts")
                Navigation.findNavController(binding.root).navigate(action)
            }
        }

        binding.checkBoxC3.setOnClickListener {
            if (binding.checkBoxC3.isChecked) {
                val action = Question4Directions.actionQuestion4ToQuestion5(4 + pts)
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