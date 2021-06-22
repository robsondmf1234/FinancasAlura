package com.example.financasalura

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.financasalura.adapter.ListaTransacoesAdapter
import com.example.financasalura.model.Transacao
import kotlinx.android.synthetic.main.activity_lista_transacao.*
import java.math.BigDecimal
import java.util.*

class ListaTransacoesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacao)

        val transacoes = listOf(
            Transacao(BigDecimal(20.50), "Comida", Calendar.getInstance()),
            Transacao(BigDecimal(100), "Economia", Calendar.getInstance())
        )
        //val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, transacoes)
        //lista_transacoes_listview.setAdapter(arrayAdapter)

        lista_transacoes_listview.setAdapter(ListaTransacoesAdapter(transacoes, this))
    }
}