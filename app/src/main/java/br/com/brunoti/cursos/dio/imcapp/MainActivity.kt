package br.com.brunoti.cursos.dio.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.w("lifecycle","CREATE - estou criando a tela")
        //finish()
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecycle","START - deixei a tela visível para você")
        //finish()
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecycle","RESUME - agora você pode interagir com a tela")
        //finish()
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifecycle","PAUSE - a tela perdeu o foco, você não pode mais interagir")
        //finish()
    }

    override fun onStop() {
        Log.w("lifecycle","STOP - a tela não está mais visível mas ainda existe")
        super.onStop()
        //finish()
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("lifecycle","\n" + "RESTART - a tela está retomando o foco")
        //finish()
    }

    override fun onDestroy() {
        Log.w("lifecycle","\n" + "DESTROY - oh não! a tela foi destruída")
        super.onDestroy()
        //finish()
    }


}