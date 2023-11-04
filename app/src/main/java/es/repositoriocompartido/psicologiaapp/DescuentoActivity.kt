package es.repositoriocompartido.psicologiaapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DescuentoActivity : AppCompatActivity() {

    //Componentes
    private lateinit var txtResultadoSexo: TextView
    private lateinit var txtResultadoEdad: TextView
    private lateinit var txtResultadoHijos: TextView
    private lateinit var txtResultadoSueldo: TextView
    private lateinit var txtResultadoDescuento: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descuento)

        //Funcion de inicializacion de componentes
        initComponentes()
    }

    private fun initComponentes(){
//        txtResultadoSexo = findViewById(R.id.txtResultadoSexo)
//        txtResultadoEdad = findViewById(R.id.txtResultadoEdad)
//        txtResultadoHijos = findViewById(R.id.txtResultadoHijos)
//        txtResultadoSueldo = findViewById(R.id.txtResultadoSueldo)
//        txtResultadoDescuento = findViewById(R.id.txtResultadoDescuento)
//
//        val extras = intent.extras
    }
}