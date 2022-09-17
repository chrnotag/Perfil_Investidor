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
import androidx.navigation.fragment.navArgs
import com.example.perfil_investidor.Activities.Questions
import com.example.perfil_investidor.R
import com.example.perfil_investidor.databinding.FragmentQuestion1Binding

class Question1 : Fragment() {

    companion object {
        fun newInstance() = Question1()
    }

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

    fun Responder() {

        binding.checkBoxA.setOnClickListener {
            if (binding.checkBoxA.isChecked) {
                val action = Question1Directions.actionQuestion1ToQuest2(0)
                Navigation.findNavController(binding.root).navigate(action)
            }
        }

        binding.checkBoxB.setOnClickListener {
            if (binding.checkBoxB.isChecked) {
                val action = Question1Directions.actionQuestion1ToQuest2(2)
                Navigation.findNavController(binding.root).navigate(action)
            }
        }

        binding.checkBoxC.setOnClickListener {
            if (binding.checkBoxC.isChecked) {
                val action = Question1Directions.actionQuestion1ToQuest2(3)
                Navigation.findNavController(binding.root).navigate(action)
            }
        }

        binding.checkBoxD.setOnClickListener {
            if (binding.checkBoxD.isChecked) {
                val action = Question1Directions.actionQuestion1ToQuest2(4)
                Navigation.findNavController(binding.root).navigate(action)
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