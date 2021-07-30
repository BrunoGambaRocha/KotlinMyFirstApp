package br.com.brunoti.cursos.dio.imcapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import br.com.brunoti.cursos.dio.imcapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setListeners()
    }

    private fun setListeners() {
        binding.alturaEDT?.doAfterTextChanged { text ->
            //Toast.makeText(this, text.toString(), Toast.LENGTH_SHORT).show()
        }
        binding.pesoEDT?.doOnTextChanged { text, _, _, _ ->
            //binding.tituloTXT.text = text
        }
        binding.calcularBTN.setOnClickListener {
            calcularIMC(binding.pesoEDT.text.toString(), binding.alturaEDT.text.toString())
        }
    }

    private fun calcularIMC(peso: String, altura: String){
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()

        if (peso != null && altura != null){
            val imc = peso / (altura * altura)
            binding.tituloTXT.text = "SEU IMC É %.2f".format(imc)
        }
    }

}