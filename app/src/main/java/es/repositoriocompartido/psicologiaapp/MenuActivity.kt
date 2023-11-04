package es.repositoriocompartido.psicologiaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MenuActivity : AppCompatActivity() {

    //Listado Talleres test
    private val talleres = listOf(
        TalleresMenu.PAREJA,
        TalleresMenu.AUTOESTIMA,
        TalleresMenu.CRIANZA,
        TalleresMenu.OTROS
    )

    private val citas = listOf(
        Cita("Escuela matrimonios", TalleresMenu.PAREJA),
        Cita("Superandote a ti mismo", TalleresMenu.AUTOESTIMA),
        Cita("Montesori", TalleresMenu.CRIANZA),
        Cita("Alcholicos anónimos", TalleresMenu.CRIANZA),
        Cita("Citas de pareja", TalleresMenu.CRIANZA),
        Cita("Autoestima baja?", TalleresMenu.CRIANZA),
        Cita("Como cuidar la mente del recién nacido", TalleresMenu.CRIANZA),
        Cita("Convivencia en apuros", TalleresMenu.CRIANZA),
        Cita("Timidez al hablar", TalleresMenu.CRIANZA),
        Cita("Cuidado psicológico en infantes", TalleresMenu.CRIANZA)
    )

    private val citasInit= mutableListOf<Cita>()
    private val citasSafe= mutableListOf<Cita>()

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

        //Realizamos la petición a nuestro API
//        getCitas()
    }

    //Inicialización de Componentes Visuales
    private fun initComponent(){
        rvTalleres = findViewById(R.id.rvTalleres)
        rvCitas = findViewById(R.id.rvCitas)
    }

    //Inicialización de RecyclerViews
    private fun initUI(){
        talleresAdapter = TalleresAdapter(talleres)
        rvTalleres.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rvTalleres.adapter = talleresAdapter

//        citasAdapter = CitasAdapter(citasInit)
        citasAdapter = CitasAdapter(citas)
        rvCitas.layoutManager = LinearLayoutManager(this)
        rvCitas.adapter = citasAdapter
    }

    //Funcion de peticion contra APIRestFull
//    private fun getCitasRetrofit(): Retrofit{
//        return Retrofit.Builder()
//            .baseUrl("https://apimocha.com/citaspsicologicas/citas/")
////            .baseUrl("http://192.168.3.18:3000/data/")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//    }

//    private fun getCitas(){
//        CoroutineScope(Dispatchers.IO).launch{
//            val peticion = getCitasRetrofit().create(ApiService::class.java).getCitasApi("data")
//            val citasResponse: CitaResponse? = peticion.body()
//            runOnUiThread{
//                if(peticion.isSuccessful){
//                    Log.i("CANALESYOUTUBE","--------- EXITO")
//                    //Relleno los datos desde la respuesta
//                    val citasData=citasResponse?.citas?:emptyList()
//                    //Borro datos del RecyclerView
//                    citasInit.clear()
//                    citasInit.addAll(citasData)
//                    //Repinta RecyclerView
//                    citasAdapter.notifyDataSetChanged()
//                }else{
//                    Log.i("CANALESYOUTUBE","--------- ERROR")
//                }
//            }
//        }
//    }

}