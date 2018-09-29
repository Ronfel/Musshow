package applistamusicas.rodrigosamuel.com.musshow.UI

import android.app.Application
import applistamusicas.rodrigosamuel.com.musshow.Extensions.DelegatesExt

class App : Application() {

    companion object {
        var instance: App by DelegatesExt.notNullSingleValue()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}