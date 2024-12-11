package br.com.ecommerce.domain.model

data class User(
    val name: String? = null,
    val username: String,
    val password: String,
    val cpf: String,
    val situation: String,
    val registration: Long
)