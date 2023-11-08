package com.helenjireh.miprimeraapp_90

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val nombre = findViewById<EditText>(R.id.editTextnombre)
        val botonsaludar =findViewById<Button>(R.id.buttonsaludar)
        botonsaludar.setOnClickListener {
            var tomarnombre=nombre.text.toString()
            Toast.makeText(this,"!bienvenido $tomarnombre a mi app¡",Toast.LENGTH_LONG).show()
        }
    }
}