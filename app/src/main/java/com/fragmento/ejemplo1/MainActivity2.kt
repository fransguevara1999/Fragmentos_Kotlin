package com.fragmento.ejemplo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar

class MainActivity2 : AppCompatActivity(),OnFragmentActionsListener2 {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    override fun onClickFragmentButton2() {
        //se trata de un mensaje que saldrá de la parte inferior de la pantalla al llamar al método.
        //Toast.makeText(this,"El boton a sido pulsado",Toast.LENGTH_LONG)
        Snackbar.make(
            findViewById(R.id.btnPlus),
            R.string.app_name,
            Snackbar.LENGTH_LONG
        ).show()
    }
}