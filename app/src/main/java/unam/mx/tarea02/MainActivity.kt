package unam.mx.tarea02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var rojo : Byte = 0; var verde : Byte  = 0; var azul : Byte = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnColores = findViewById<Button>(R.id.btnColores)
        btnColores.setOnClickListener{
            val intent = Intent(this, ColoresActivity::class.java)
            startActivity(intent)
        }

        val btnAceptar = findViewById<Button>(R.id.btnAceptar)
        btnAceptar.setOnClickListener{
            val intent = Intent(this,ImcActivity::class.java)
            startActivity(intent)
        }
    }

}