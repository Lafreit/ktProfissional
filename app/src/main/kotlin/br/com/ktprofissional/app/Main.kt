package br.com.ktprofissional.app

import br.com.ktprofissional.domain.Pessoa
import br.com.ktprofissional.domain.RegraMaioridade

/**
 * Ponto de entrada da aplicação ktProfissional.
 */
fun main() {
    val pessoa = Pessoa(nome = "João", idade = 17)
    val regra = RegraMaioridade()

    println("Pessoa apta? ${regra.isApta(pessoa)}")
}