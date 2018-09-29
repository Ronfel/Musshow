package applistamusicas.rodrigosamuel.com.musshow.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import applistamusicas.rodrigosamuel.com.musshow.Modal.Musica
import applistamusicas.rodrigosamuel.com.musshow.R
import kotlinx.android.synthetic.main.activity_play_list.*

class PlayListActivity : AppCompatActivity() {

    var lista: List<Musica>? = null
    var listItensMusicas: List<HashMap<String, Musica>>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play_list)

        lstPlayList.setOnItemClickListener { adapterView, view, position, id ->
            var intent = Intent(applicationContext,VisualizaMusicaActivity::class.java)
            intent.putExtra("Peppa Pig","\n" +
                    "\n" +
                    "Peppa é uma porquinha\n" +
                    "Que é toda rosinha\n" +
                    "Gosta muito de brincar\n" +
                    "Com o seu irmão george\n" +
                    "Joga bola e se diverti\n" +
                    "Brinca tanto tempo que do tempo\n" +
                    "Até se esquece\n" +
                    "\n" +
                    "Peppa pig gosta de brincar\n" +
                    "Na poça de lama ou em cima\n" +
                    "Da cama ela gosta de brincar\n" +
                    "\n" +
                    "Gosta da casinha da árvore\n" +
                    "Gosta de brincar de tomar chá\n" +
                    "Aprendeu com o papai e com a mamãe\n" +
                    "O lixo reciclar\n" +
                    "Adicionar à playlist\n" +
                    "Tamanho\n" +
                    "Cifra\n" +
                    "Imprimir\n" +
                    "Corrigir\n" +
                    "\n" +
                    "Composição: Elias Becky · Esse não é o compositor? Nos avise.\n" +
                    "Enviada por Banda\n" +
                    "Viu algum erro na letra? Envie sua correção.\n")

            startActivity(intent)
        }


    }


}
