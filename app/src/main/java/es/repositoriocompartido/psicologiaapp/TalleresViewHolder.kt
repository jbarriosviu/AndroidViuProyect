package es.repositoriocompartido.psicologiaapp

import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class TalleresViewHolder(view: View): RecyclerView.ViewHolder(view){

    private val txtNombreTaller:TextView = view.findViewById(R.id.txtNombreTaller)
    private val divider: View = view.findViewById(R.id.divider)
    fun render(taller:TalleresMenu){
        when(taller){
            TalleresMenu.PAREJA -> {
                txtNombreTaller.text="PAREJA"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context,R.color.canal_technology_category))
            }
            TalleresMenu.AUTOESTIMA -> {
                txtNombreTaller.text="AUTOESTIMA"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context,R.color.canal_cooking_category))
            }
            TalleresMenu.CRIANZA -> {
                txtNombreTaller.text="CRIANZA"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context,R.color.canal_other_category))
            }
            TalleresMenu.OTROS -> {
                txtNombreTaller.text="OTROS"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context,R.color.canal_technology_category))
            }
            else -> {
                txtNombreTaller.text="OTROS"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context,R.color.canal_technology_category))
            }
        }
    }
}