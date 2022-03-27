package br.com.fiap.primeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cliqueBtn(view: View){
        if(editNome.text.trim().isEmpty()){
            var errorMsg = "Informe um nome"
            Toast.makeText(this, errorMsg, Toast.LENGTH_LONG).show()
        }else {
            var msg = "Bem vindo, ${editNome.text}"
            exibirMensagem("Saudação", msg)
        }
    }

    fun exibirMensagem(titulo: String, mensagem: String){
        val builder = AlertDialog.Builder(this)

        builder.setTitle(titulo)
               .setMessage(mensagem)
               .setPositiveButton("fechar".uppercase(Locale.getDefault()), null)

        builder.create().show()
    }
}