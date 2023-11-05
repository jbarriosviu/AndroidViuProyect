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
                divider.setBackgroundColor(ContextCompat.getColor(divider.context,R.color.categoria_pareja))
            }
            TalleresMenu.AUTOESTIMA -> {
                txtNombreTaller.text="AUTOESTIMA"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context,R.color.categoria_autoestima))
            }
            TalleresMenu.CRIANZA -> {
                txtNombreTaller.text="CRIANZA"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context,R.color.categoria_crianza))
            }
            TalleresMenu.OTROS -> {
                txtNombreTaller.text="OTROS"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context,R.color.categoria_pareja))
            }
            else -> {
                txtNombreTaller.text="OTROS"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context,R.color.categoria_autoestima))
            }
        }
    }
}