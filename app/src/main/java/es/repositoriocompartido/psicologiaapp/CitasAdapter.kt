package es.repositoriocompartido.psicologiaapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CitasAdapter (private val citas: List<Cita>):RecyclerView.Adapter<CitasViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CitasViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cita,parent,false)
        return CitasViewHolder(view)
    }

    override fun getItemCount(): Int {
        return citas.size
    }

    override fun onBindViewHolder(holder: CitasViewHolder, position: Int) {
        holder.render(citas[position])
    }
}