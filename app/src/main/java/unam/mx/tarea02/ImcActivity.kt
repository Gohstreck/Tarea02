package unam.mx.tarea02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton


class ImcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        val rbtnHombre = findViewById<RadioButton>(R.id.rbtnHombre)
        val rbtnMujer = findViewById<RadioButton>(R.id.rbtnMujer)

        rbtnHombre.setOnClickListener(listener)
        rbtnMujer.setOnClickListener(listener)

    }

    private val listener = View.OnClickListener { view->
        when(view?.id ){
            R.id.rbtnHombre->{
                val rbtnMujer = findViewById<RadioButton>(R.id.rbtnMujer)
                rbtnMujer.isActivated = false

            }
            R.id.rbtnMujer->{
                val rbtnHombre = findViewById<RadioButton>(R.id.rbtnHombre)
                rbtnHombre.isActivated = false
            }
            R.id.fabtnSalir-> {
                finish()
            }
        }
    }
}