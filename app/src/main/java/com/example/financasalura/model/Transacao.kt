package com.example.financasalura.model

import java.math.BigDecimal
import java.util.Calendar

class Transacao(val valor: BigDecimal,
                val categoria: String,
                val data: Calendar)