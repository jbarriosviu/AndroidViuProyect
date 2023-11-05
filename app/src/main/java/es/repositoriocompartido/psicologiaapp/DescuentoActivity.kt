package es.repositoriocompartido.psicologiaapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity



class DescuentoActivity : AppCompatActivity() {

    //Componentes
    private lateinit var edtemail: TextView
    private lateinit var edtmovil: TextView
    private lateinit var btnEnv: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descuento)

        btnEnv = findViewById(R.id.btnEnv)

        btnEnv.setOnClickListener {
           val intent = Intent(this, MainActivity::class.java)

           if ((edtemail.getText().toString().isEmpty()) || (edtmovil.getText().toString().isEmpty())) {
               Toast.makeText(this, "Debe completar todos los datos", Toast.LENGTH_LONG).show()
           }  else {
                 startActivity(intent)
                 finish()
             }
       }
        //Funcion de inicializacion de componentes
        initComponentes()
    }








   private fun initComponentes(){

       edtemail = findViewById<EditText>(R.id.edtEmail)
       edtmovil = findViewById<EditText>(R.id.edtMvo)

    }

 //   private fun initListener() {

        //Vuelve al activity principal

      //  btnEnv.setOnClickListener {
        //   Log.i("INICIO --------- ","VOLVEMOS")
          //  navegarHaciaApp(MainActivity::class.java)
      //     Toast.makeText(this, "Debe completar los datos del correo", Toast.LENGTH_LONG).show()
        //}


 //       if ((edtemail.getText().isEmpty()) || (edtmovil.getText().isEmpty())) {

  //      }
  //  }

//fun navegarHaciaApp(clase:Class<*>){
  //  val intent = Intent(this, clase)
  ///startActivity(intent)
//}

}