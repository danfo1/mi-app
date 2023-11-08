package com.helenjireh.miprimeraapp_90

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio2)
        val usuario=findViewById<EditText>(R.id.editTextTextusario)
        val clave=findViewById<EditText>(R.id.contraseña)
        val respuesta=findViewById<TextView>(R.id.resultado)
        val boton=findViewById<Button>(R.id.button)

        boton.setOnClickListener{
            if (usuario.text.toString().equals("admin")&& clave.text.toString().equals("1234")){
                respuesta.setText("!bienvenidos¡ ${usuario.text.toString()}")
                val intento=Intent(this,MainActivity::class.java)
                startActivity(intento)
            }else{
                respuesta.setText("ingreso denegado")
            }

        }




    }
}