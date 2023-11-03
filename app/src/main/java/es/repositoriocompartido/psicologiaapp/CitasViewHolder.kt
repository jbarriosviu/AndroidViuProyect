package es.repositoriocompartido.psicologiaapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CitasViewHolder(view: View) : RecyclerView.ViewHolder(view){

    private val txtCita: TextView = view.findViewById(R.id.txtCita)

    fun render(cita: Cita){
        txtCita.text = cita.nombre
    }
}