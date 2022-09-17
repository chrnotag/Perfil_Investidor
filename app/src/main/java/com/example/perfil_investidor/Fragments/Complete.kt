package com.example.perfil_investidor.Fragments

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.navArgs
import com.example.perfil_investidor.Activities.Resultado
import com.example.perfil_investidor.R
import com.example.perfil_investidor.databinding.FragmentCompleteBinding

class Complete : Fragment() {

    companion object {
        fun newInstance() = Complete()
    }

    private lateinit var viewModel: CompleteViewModel

    private var _binding: FragmentCompleteBinding? = null

    private val binding get() = _binding!!

    private val args: CompleteArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCompleteBinding.inflate(layoutInflater,container, false)

        activity?.actionBar?.title = "Fim do teste"

        binding.button.setOnClickListener {
            val intent = Intent(context, Resultado::class.java)
            intent.putExtra("intent", args.result)
            startActivity(intent)
            activity?.finishAffinity()
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CompleteViewModel::class.java)
        // TODO: Use the ViewModel
    }

}