package com.fragmento.ejemplo1

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_red.*

class RedFragment : Fragment() {
    //colocando null así nos obligamos a comprobar su contenido antes de intentar ejecutar cualquier acción.
    private var listener:OnFragmentActionsListener?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_red, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btnRed.setOnClickListener { listener?.OnClickFragmentButtonRed() }
    }
    /*
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btnPlus.setOnClickListener {
            listener?.onClickFragmentButton()
        }
    }*/

      //Cuando se crear el fragmento
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is OnFragmentActionsListener){
            listener=context
        }
    }
    //Para cerrar la conexion del fragmento , lo contrario a onAttach
    override fun onDetach() {
        super.onDetach()
        listener=null
    }




}