package es.repositoriocompartido.psicologiaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider

class MainActivity : AppCompatActivity() {

    //Variables de calculo  o funcionamiento
    private var hombreSeleccionado:Boolean = true
    private var edad:Int = 18
    private var hijos:Int = 0

    //Componentes
    private lateinit var cvHombre: CardView
    private lateinit var cvMujer: CardView
    private lateinit var txtEdad: TextView
    private lateinit var rngEdad: RangeSlider
    private lateinit var txtHijos: TextView
    private lateinit var btnMasHijos: FloatingActionButton
    private lateinit var btnMenosHijos: FloatingActionButton
    private lateinit var edtSueldo: EditText
    private lateinit var btnDescuento: Button
    private lateinit var btnOfertaPsicologica: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Funcion de inicializacion de componentes
        initComponentes()
        //Funcion de escucha de componentes
        initListener()
    }

    private fun initComponentes(){
        cvHombre = findViewById(R.id.cvHombre)
        cvMujer = findViewById(R.id.cvMujer)

        txtEdad = findViewById(R.id.txtEdad)
        txtEdad.text = "${edad.toString()} años"
        rngEdad = findViewById(R.id.rngEdad)

        txtHijos = findViewById(R.id.txtHijos)
        txtHijos.text = hijos.toString()
        btnMasHijos = findViewById(R.id.btnMasHijos)
        btnMenosHijos = findViewById(R.id.btnMenosHijos)

        btnDescuento = findViewById(R.id.btnDescuento)
        btnOfertaPsicologica = findViewById(R.id.btnOfertaPsicologica)

        edtSueldo = findViewById<EditText>(R.id.edtSueldo)
    }

    private fun initListener(){
        //CardView
        cvHombre.setOnClickListener{cambiarColorSexo(true)}
        cvMujer.setOnClickListener{cambiarColorSexo(false)}

        //Listener de edad
        rngEdad.addOnChangeListener { slider, value, fromUser ->
            edad = value.toInt()
            txtEdad.text = "${edad.toString()} años"
        }

        //Listener de Peso
        btnMasHijos.setOnClickListener {
            if(hijos<12) hijos += 1
            setHijo()
        }
        btnMenosHijos.setOnClickListener {
            if(hijos>0) hijos -= 1
            setHijo()
        }

        //Llama a Activity de Menu
        btnOfertaPsicologica.setOnClickListener {
            Log.i("MENU --------- ","LANZAMOS MENU")
            navegarHaciaApp(MenuActivity::class.java)
        }


        //Descuentos
        btnDescuento.setOnClickListener{
            val intent = Intent(this,DescuentoActivity::class.java)
            intent.putExtra("sexo",hombreSeleccionado)
            intent.putExtra("edad",edad)
            intent.putExtra("hijos",hijos)
            intent.putExtra("sueldo",edtSueldo.text.toString())

            startActivity(intent)
        }
    }

    fun cambiarColorSexo(esHombre:Boolean){
        if(esHombre){
            cvMujer.setCardBackgroundColor(ContextCompat.getColor(this,R.color.card_color_no_selected))
            cvHombre.setCardBackgroundColor(ContextCompat.getColor(this,R.color.card_color))
            hombreSeleccionado = false
        }else{
            cvMujer.setCardBackgroundColor(ContextCompat.getColor(this,R.color.card_color))
            cvHombre.setCardBackgroundColor(ContextCompat.getColor(this,R.color.card_color_no_selected))
            hombreSeleccionado = true
        }
    }

    private fun setHijo() {
        txtHijos.text = hijos.toString()
    }

    fun navegarHaciaApp(clase:Class<*>){
        val intent = Intent(this, clase)
        startActivity(intent)
    }
}