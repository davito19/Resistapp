package com.davito.resistapp.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var _value : MutableLiveData<String> = MutableLiveData()
    var value : LiveData<String> = _value

    fun calculate (int: Int, int1: Int, double: Double, double1: Double){
        val resultado: Double = ((int.toDouble() * 10 + int1.toDouble()) * double)
        _value.value = buildString {
            append(resultado)
            append(" Ω ±")
            append(double1)
            append("%")
        }
    }
}