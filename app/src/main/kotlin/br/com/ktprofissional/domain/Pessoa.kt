package  br.com.ktprofissional.domain

/**
 * Representa uma pessoa dentro do domínio do sistema.
 *
 * @property nome Nome da pessoa
 * @property idade Idade da pessoa em anos
 */
data class Pessoa(
    val nome: String,
    val idade: Int
)