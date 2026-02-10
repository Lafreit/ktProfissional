package br.com.ktprofissional.domain

/**
 * Regra de negócio responsável por validar se uma pessoa
 * atende à idade mínima exigida.
 */
class RegraMaioridade(
    private val idadeMinima: Int = 18
) {

    /**
     * Verifica se a pessoa é considerada apta segundo a regra de idade mínima.
     *
     * @param pessoa Pessoa a ser avaliada
     * @return true se a idade for maior ou igual à idade mínima
     */
    fun isApta(pessoa: Pessoa): Boolean {
        return  pessoa.idade >= idadeMinima
    }
}