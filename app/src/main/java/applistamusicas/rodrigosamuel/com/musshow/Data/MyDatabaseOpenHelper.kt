package applistamusicas.rodrigosamuel.com.musshow.Data

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import applistamusicas.rodrigosamuel.com.musshow.UI.App
import org.jetbrains.anko.db.*
import java.lang.Exception

class MyDatabaseOpenHelper(ctx: Context) : ManagedSQLiteOpenHelper(ctx, DB_NAME, null, DB_VERSION) {
    var db: SQLiteDatabase = getWritableDatabase()
    val dbPath =  ctx.getFilesDir().getPath()
    val dbctx = ctx.applicationContext

    companion object {
        const val DB_NAME = "forecast.db"
        const val DB_VERSION = 1

        @SuppressLint("StaticFieldLeak")
        private var instance: MyDatabaseOpenHelper? = null

        @Synchronized
        fun getInstance(ctx: Context): MyDatabaseOpenHelper {

            if (instance == null) {
                instance = MyDatabaseOpenHelper(ctx.getApplicationContext())
            }
            return instance!!
        }
    }

    fun insert(values: ContentValues, tableName:String): Boolean {
        openDB();
        try{
            db.insert(tableName,null, values)
            return true
        }catch (e:Exception){
            e.printStackTrace()
            return false
        }finally {
            db.close()
        }
    }

    override fun onCreate(db: SQLiteDatabase) {
    // Here you create tables
    db.createTable(TableMusic.NAME, true,
         TableMusic.ID to INTEGER + PRIMARY_KEY + AUTOINCREMENT,
                   TableMusic.TITMUSICA to TEXT,
                   TableMusic.LETMUSICA to TEXT,
                   TableMusic.ORDEM to INTEGER)
}

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // Here you can upgrade tables, as usual
        db.dropTable("MUSICAS", true)
        onCreate(db)
    }

    private fun openDB() {
        if (!db.isOpen) {
            db = dbctx.openOrCreateDatabase(dbPath, SQLiteDatabase.OPEN_READWRITE, null)
        }
    }
}

// Access property for Context
val Context.database: MyDatabaseOpenHelper
    get() = MyDatabaseOpenHelper.getInstance(getApplicationContext())