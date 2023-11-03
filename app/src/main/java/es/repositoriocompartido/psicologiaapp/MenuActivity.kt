package es.repositoriocompartido.psicologiaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MenuActivity : AppCompatActivity() {

    //Listado Talleres test
    private val talleres = listOf(
        TalleresMenu.PAREJA,
        TalleresMenu.AUTOESTIMA,
        TalleresMenu.CRIANZA,
        TalleresMenu.OTROS
    )

    //Recycler Talleres
    private lateinit var rvTalleres:RecyclerView
    private lateinit var talleresAdapter: TalleresAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        initComponent()
        initUI()
    }

    private fun initComponent(){
        rvTalleres = findViewById(R.id.rvTalleres)
    }

    private fun initUI(){
        talleresAdapter = TalleresAdapter(talleres)
        rvTalleres.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvTalleres.adapter = talleresAdapter
    }
}