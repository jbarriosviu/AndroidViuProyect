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

    private val citas = listOf(
        Cita("Repositorio Compartido", TalleresMenu.OTROS),
        Cita("Repositorio Compartido", TalleresMenu.AUTOESTIMA),
        Cita("Repositorio Compartido", TalleresMenu.CRIANZA)
    )

    //Recycler Talleres
    private lateinit var rvTalleres:RecyclerView
    private lateinit var talleresAdapter: TalleresAdapter

    //Recycler Citas
    private lateinit var rvCitas:RecyclerView
    private lateinit var citasAdapter: CitasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        initComponent()
        initUI()
    }

    private fun initComponent(){
        rvTalleres = findViewById(R.id.rvTalleres)
        rvCitas = findViewById(R.id.rvCitas)
    }

    private fun initUI(){
        talleresAdapter = TalleresAdapter(talleres)
        rvTalleres.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvTalleres.adapter = talleresAdapter

        citasAdapter = CitasAdapter(citas)
        rvCitas.layoutManager = LinearLayoutManager(this)
        rvCitas.adapter = citasAdapter
    }
}