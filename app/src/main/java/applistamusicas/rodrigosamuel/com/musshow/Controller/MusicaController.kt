package applistamusicas.rodrigosamuel.com.musshow.Controller

import android.content.ContentValues
import android.content.Context
import applistamusicas.rodrigosamuel.com.musshow.Data.MyDatabaseOpenHelper
import applistamusicas.rodrigosamuel.com.musshow.Data.TableMusic
import applistamusicas.rodrigosamuel.com.musshow.Data.database
import applistamusicas.rodrigosamuel.com.musshow.Modal.Musica
import applistamusicas.rodrigosamuel.com.musshow.Extensions.*

class MusicaController(var ctx:Context){



    fun salvarMusica(musica: Musica){
        val cv = ContentValues()
        cv.put(TableMusic.TITMUSICA, musica.sTitMusica);
        cv.put(TableMusic.LETMUSICA, musica.sTitMusica);
        cv.put(TableMusic.ORDEM, musica.iOrdem);

        ctx.database.insert(cv, TableMusic.NAME)
    }


   fun excluirMusica(id: Int){

   }

   fun editarMusica(musica: Musica){

   }

   //fun consultarMusica() : ArrayList<Musica> {

   //}
}