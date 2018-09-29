package applistamusicas.rodrigosamuel.com.musshow.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import applistamusicas.rodrigosamuel.com.musshow.R
import kotlinx.android.synthetic.main.activity_visualiza_musica.*
import android.content.Intent
import applistamusicas.rodrigosamuel.com.musshow.Classes.Musica


class VisualizaMusicaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visualiza_musica)

        val intent = intent
        val musica: Musica = intent.getSerializableExtra("Musica") as Musica

        txtTituloMusica.text = musica.sTitMusica
        txtLetraMus.text = musica.sLetraMusica
    }
}
