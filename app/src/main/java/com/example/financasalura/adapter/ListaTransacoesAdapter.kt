package com.example.financasalura.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.financasalura.R
import com.example.financasalura.model.Transacao
import kotlinx.android.synthetic.main.transacao_item.view.*
import java.text.SimpleDateFormat

class ListaTransacoesAdapter(transacoes: List<Transacao>, context: Context) : BaseAdapter() {

    private val transacoes: List<Transacao> = transacoes
    private val context: Context = context

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        val viewCriada: View =
            LayoutInflater.from(context).inflate(R.layout.transacao_item, parent, false)

        val transacaoAtual = transacoes[position]

        viewCriada.transacao_valor.text = transacaoAtual.valor.toString()
        viewCriada.transacao_categoria.text = transacaoAtual.categoria
        //Formatando a data
        val formatoBrasileiro = "dd/MM/yyyy"
        val format = SimpleDateFormat(formatoBrasileiro)
        val dataFormatada = format.format(transacaoAtual.data.time)

        viewCriada.transacao_data.text = dataFormatada

        return viewCriada
    }

    override fun getItem(position: Int): Transacao {

        return transacoes[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return transacoes.size
    }
}