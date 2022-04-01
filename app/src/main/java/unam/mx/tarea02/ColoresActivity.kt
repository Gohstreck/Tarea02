package unam.mx.tarea02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView


class ColoresActivity : AppCompatActivity() {
    var rojo : Byte = 0; var verde : Byte  = 0; var azul : Byte = 0
    val min = 0; val step = 1;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.colores)

        val btnAceptar = findViewById<Button>(R.id.btnAceptar)
        btnAceptar.setOnClickListener {
            val skRojo = findViewById<SeekBar>(R.id.skRed)
            val skVerde = findViewById<SeekBar>(R.id.skGreen)
            val skAzul = findViewById<SeekBar>(R.id.skBlue)
            rojo = skRojo.progress.toByte()
            verde = skVerde.progress.toByte()
            azul = skAzul.progress.toByte()

        }

        val skRojo = findViewById<SeekBar>(R.id.skRed)
        val txtRojo = findViewById<TextView>(R.id.txtRojoActual)

        skRojo.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, currentValue: Int, p2: Boolean) {
                txtRojo.text = currentValue.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                TODO("Not yet implemented")
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                TODO("Not yet implemented")
            }
        })

    }
}