package applistamusicas.rodrigosamuel.com.musshow.Modal

class Musica{
    var idMusica: Int = 0
    lateinit var sTitMusica: String
    lateinit var sLetraMusica: String
    var iOrdem: Int = 0

    fun getOrdem(): Int {
        return iOrdem
    }

    fun setOrdem(iOrdem: Int){
       this.iOrdem = iOrdem
    }

}