package com.fragmento.ejemplo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.main_dado.*

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
            btn_lanzar.setOnClickListener {
                lanzardado()
            }

        }
    }
    private fun lanzardado() {
        //Crear dado de 6 numeros
        val dado1=dado(6)
        //Lanzar dado
        val ladado1=dado1.lanzar()
        print(ladado1)
        //capturamos el identificador de la imagen para poder cambiar al lanzar el dado.
        val img_dado: ImageView =findViewById(R.id.Dado_img)
        //imagenes contendrá todas las imagenes , ladado1 contiene el numero al hacer del 1 al 6.
        val imagenes=when(ladado1){
            1->R.drawable.dado_1
            2->R.drawable.dado_2
            3->R.drawable.dado_3
            4->R.drawable.dado_4
            5->R.drawable.dado_5
            else->R.drawable.dado_6
        }
        //Al lanzar el dado se seleccionara una opcion y se agregara por medio de imagenes
        //pasamos con setImageResource la imagen que queremos mostrar en este caso es por el random del 1 al 6.
        img_dado.setImageResource(imagenes)
        //colocamos una descripcion para guardar el numero .
        img_dado.contentDescription=ladado1.toString()
    }
    /*override
    fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_options, menu)
        return true
    }*/
}
class dado(private val numLado:Int){
    fun lanzar():Int{
        return (1..numLado).random()
    }

}