package com.fragmento.ejemplo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), OnFragmentActionsListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportActionBar?.hide()
        setContentView(R.layout.activity_main)


    }

    override fun onClickFragmentButtonBlue() {
        //se trata de un mensaje que saldrá de la parte inferior de la pantalla al llamar al método.
       val botonAzul=findViewById<Button>(R.id.btnPlus)
        botonAzul.setOnClickListener {
            setContentView(R.layout.fragment_contenido_blue)
            val recyclerView= findViewById<RecyclerView>(R.id.recyclerView)
            var adapter=CustomAdapter()

            recyclerView.layoutManager=LinearLayoutManager(this)
            recyclerView.adapter=adapter
        }

    }
    override fun OnClickFragmentButtonRed() {
        val botonRed = findViewById<Button>(R.id.btnRed)
        botonRed.setOnClickListener {
            setContentView(R.layout.fragment_contenido_red)
        }
    }
}