package com.fragmento.ejemplo1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>(){
    val titles= arrayOf(
    "Imagenes",
    "Videos",
    "Youtube",
    "Musica",
    "Juegos",
    "Peter")
    val details= arrayOf(
    "Muchas imagenes Top",
    "Muchos videos de calidad",
    "Muchos videos de youtube",
    "@string/DeseñoDeTarjetas",
    "Los mejores juegos de Perú",
    "El presidente que represnta al Perú")
    val images= intArrayOf(
        R.drawable.img_imagen,
        R.drawable.img_video,
        R.drawable.img_youtube,
        R.drawable.img_musica,
        R.drawable.img_juego,
        R.drawable.img_castillo,
    )
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
       val v=LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout,viewGroup,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text= titles[i]
        viewHolder.itemDetail.text= details[i]
        viewHolder.itemImage.setImageResource(images[i])
    }
    override fun getItemCount():Int{
        return titles.size
    }

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var itemImage:ImageView
        var itemTitle:TextView
        var itemDetail:TextView

        init {
            itemImage=itemView.findViewById(R.id.item_image)
            itemTitle=itemView.findViewById(R.id.item_title)
            itemDetail=itemView.findViewById(R.id.item_detal)
        }
    }
}