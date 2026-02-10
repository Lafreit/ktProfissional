package br.com.ktprofissional.domain

/**
 * Exceção lançada quando uma pessoa não atende
 * às regras de negócio do domínio.
 */
class PessoaNaoAptaException (message: String) : RuntimeException(message)