package br.com.ktprofissional.domain

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class RegraMaioridadeTest {
    @Test
    fun `deve considerar apta quando idade for maior ou igual a idade minima`() {
        val regra = RegraMaioridade(idadeMinima = 18)
        val pessoa = Pessoa(nome = "Ana", idade = 18)
        assertTrue(regra.isApta(pessoa))
    }

    @Test
    fun `nao deve considerar apta quando idade for menor que idade minima` () {
        val regra = RegraMaioridade(idadeMinima = 18)
        val pessoa = Pessoa(nome = "Joao", idade = 17)
        assertFalse(regra.isApta(pessoa))
    }
}