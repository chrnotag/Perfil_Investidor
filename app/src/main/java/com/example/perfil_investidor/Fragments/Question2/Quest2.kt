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
import androidx.navigation.fragment.navArgs
import com.example.perfil_investidor.Activities.Questions
import com.example.perfil_investidor.Fragments.Question1.Question1ViewModel
import com.example.perfil_investidor.R
import com.example.perfil_investidor.databinding.FragmentQuest2Binding
import com.example.perfil_investidor.databinding.FragmentQuestion1Binding

class Quest2 : Fragment() {
    companion object {
        fun newInstance() = Quest2()
    }

    private var _binding: FragmentQuest2Binding? = null

    private lateinit var viewModel: Question1ViewModel

    private val binding get() = _binding!!

    private val args: Quest2Args by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuest2Binding.inflate(inflater, container, false)

        Responder()

        return binding.root
    }

    fun Responder() {

        val pt = args.result

        binding.checkBoxA1.setOnClickListener {
            if (binding.checkBoxA1.isChecked) {
                val action = Quest2Directions.actionQuest2ToQuestion3(0 + pt)
                println("teste $pt")
                Navigation.findNavController(binding.root).navigate(action)
            }
        }

        binding.checkBoxB1.setOnClickListener {
            if (binding.checkBoxB1.isChecked) {
                val action = Quest2Directions.actionQuest2ToQuestion3(2 + pt)
                println("teste $pt")
                Navigation.findNavController(binding.root).navigate(action)
            }
        }

        binding.checkBoxC1.setOnClickListener {
            if (binding.checkBoxC1.isChecked) {
                val action = Quest2Directions.actionQuest2ToQuestion3(4 + pt)
                Navigation.findNavController(binding.root).navigate(action)
            }
        }

        binding.checkBoxD1.setOnClickListener {
            if (binding.checkBoxD1.isChecked) {
                val action = Quest2Directions.actionQuest2ToQuestion3(5 + pt)
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
        // TODO: Use the ViewModel
    }

}