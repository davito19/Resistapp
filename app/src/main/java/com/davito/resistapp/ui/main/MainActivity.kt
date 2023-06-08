package com.davito.resistapp.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.davito.resistapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var tira1 = 1
        var tira2 = 0
        var tira3 = 1.0
        var tolerancia = 1.0

        with(binding) {
            //Banda uno
            cero1button.setOnClickListener { tira1 = 0
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            uno1Button.setOnClickListener { tira1 = 1
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            dos1Button.setOnClickListener { tira1 = 2
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            tres1Button.setOnClickListener {tira1 = 3
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            cuatro1Button.setOnClickListener {tira1 = 4
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            cinco1Button.setOnClickListener {tira1 = 5
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            seis1Button.setOnClickListener {tira1 = 6
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            siete1Button.setOnClickListener {tira1 = 7
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            ocho1Button.setOnClickListener {tira1 = 8
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            nueve1Button.setOnClickListener {tira1 = 9
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }

            //Banda dos
            cero1button.setOnClickListener { tira2 = 0
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            uno2Button.setOnClickListener { tira2 = 1
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            dos2Button.setOnClickListener { tira2 = 2
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            tres2Button.setOnClickListener {tira2 = 3
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            cuatro2Button.setOnClickListener {tira2 = 4
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            cinco2Button.setOnClickListener {tira2 = 5
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            seis2Button.setOnClickListener {tira2 = 6
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            siete2Button.setOnClickListener {tira2 = 7
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            ocho2Button.setOnClickListener {tira2 = 8
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            nueve2Button.setOnClickListener {tira2 = 9
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }

            //Multiplicadores
            ceroPotenciaButton.setOnClickListener { tira3 = 1.0
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            unoPotenciaButton.setOnClickListener { tira3 = 10.0
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            dosPotenciaButton.setOnClickListener {tira3 = 100.0
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            tresPotenciaButton.setOnClickListener {tira3 =1000.0
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            cuatroPotenciaButton.setOnClickListener {tira3 =10000.0
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            cincoPotenciaButton.setOnClickListener {tira3 =100000.0
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            seisPotenciaButton.setOnClickListener {tira3 =1000000.0
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            sietePotenciaButton.setOnClickListener {tira3 =10000000.0
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            ochoPotenciaButton.setOnClickListener {tira3 =100000000.0
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            nuevePotenciaButton.setOnClickListener {tira3 =1000000000.0
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }

            //Tolerancia
            unoTolButton.setOnClickListener { tolerancia = 1.0
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            dosTolButton.setOnClickListener { tolerancia = 2.0
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            cincoTolButton.setOnClickListener {tolerancia = 5.0
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            puntocincoTolButton.setOnClickListener {tolerancia = 0.5
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            veinticincoTolButton.setOnClickListener {tolerancia = 0.25
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            puntounoTolButton.setOnClickListener {tolerancia = 0.1
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
            cerocincoTolButton.setOnClickListener {tolerancia = 0.05
                calculate(int = tira1, int1 = tira2, double = tira3, double1 = tolerancia) }
        }
    }

    private fun calculate (int: Int, int1: Int, double: Double, double1: Double){
        val resultado: Double = ((int.toDouble() * 10 + int1.toDouble()) * double)
        binding.resistorTextView.text = buildString {
            append(resultado)
            append(" Ω ±")
            append(double1)
            append("%")
        }
    }
}
