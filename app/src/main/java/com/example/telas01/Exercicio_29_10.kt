package com.example.telas01

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.example.telas01.databinding.ActivityExercicio2910Binding

class Exercicio_29_10 : AppCompatActivity() {
    private lateinit var binding: ActivityExercicio2910Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Configurar tela cheia
        WindowCompat.setDecorFitsSystemWindows(window, false)

        binding = ActivityExercicio2910Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ButtonPeso.setOnClickListener {
            convertCurrency(10.2, "Peso")
        }

        binding.ButtonReal.setOnClickListener {
            convertCurrency(5.0, "Real")
        }

        binding.ButtonDolar.setOnClickListener {
            convertCurrency(0.8, "Dólar")
        }
    }

    private fun convertCurrency(rate: Double, currencyName: String) {
        val euros = binding.editEuros.text.toString().trim()

        if (euros.isNotBlank()) {
            val convertedValue = euros.toDouble() * rate
            val formattedValue = String.format("%.2f", convertedValue)
            Toast.makeText(applicationContext, "$formattedValue $currencyName", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(applicationContext, "Por favor, insira um valor em euros.", Toast.LENGTH_SHORT).show()
        }
    }

    fun voltarParaTelaAnterior(view: android.view.View) {
        val intent = Intent(this, SegundaTela::class.java)
        startActivity(intent)
    }

    fun navegarParaQuartaPagina(view: android.view.View) {
        val intent = Intent(this, SegundaTela::class.java)
        startActivity(intent)
    }

    fun voltarParaPrimeiraTela(view: android.view.View) {
        finish()
    }
}
