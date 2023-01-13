package com.example.educacionitnavigationview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.widget.addTextChangedListener
import com.google.android.material.textfield.TextInputEditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        setup()


    }

    private fun setup() {

        val btn = findViewById<Button>(R.id.btn_continuar)

        val text = findViewById<TextInputEditText>(R.id.telefono_ingresado)

        text.addTextChangedListener {
            if (it.toString() != ""){
                btn.isEnabled = (it?.length == 10)
            }
        }

        btn.setOnClickListener {

            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}