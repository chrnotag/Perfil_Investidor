package com.example.perfil_investidor.Fragments.Question1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Question1ViewModel : ViewModel() {
    val resultado: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
}