package com.example.telas01

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.telas01.MainActivity

class SegundaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)
    }
    fun irParaTerceiraTela(view: android.view.View) {
        val intent = Intent(this, Exercicio_29_10::class.java)
        startActivity(intent)
    }

    fun voltarParaPrimeiraTela(view: android.view.View) {
        finish()
    }
}