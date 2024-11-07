package com.example.telas01

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.telas01.SegundaTela

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun irParaSegundaTela(view: android.view.View) {
        val intent = Intent(this, SegundaTela::class.java)
        startActivity(intent)
    }
}