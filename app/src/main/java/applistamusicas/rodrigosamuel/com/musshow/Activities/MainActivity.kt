package applistamusicas.rodrigosamuel.com.musshow.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import applistamusicas.rodrigosamuel.com.musshow.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun AbrirCadMusicas(view: View){
        val intent = Intent(this, CadMusicasActivity::class.java)
        startActivity(intent)
    }
    fun AbrirPlayList(view: View){
        val intent = Intent(this, PlayListActivity::class.java)
        startActivity(intent)
    }
}
