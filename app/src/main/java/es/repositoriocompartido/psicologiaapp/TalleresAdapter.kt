package es.repositoriocompartido.psicologiaapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TalleresAdapter(private val talleres:List<TalleresMenu>) : RecyclerView.Adapter<TalleresViewHolder>(){

    //Se pinta un elemento o vista dentro del Recyclerview
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TalleresViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_taller,parent,false)
        return TalleresViewHolder(view)
    }

    override fun getItemCount(): Int {
        return talleres.size
    }

    override fun onBindViewHolder(holder: TalleresViewHolder, position: Int) {
        holder.render(talleres[position])
    }
}