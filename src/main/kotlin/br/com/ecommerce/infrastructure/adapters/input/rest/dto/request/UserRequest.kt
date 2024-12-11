package br.com.ecommerce.infrastructure.adapters.input.rest.dto.request

data class UserRequest(
    val name: String? = null,
    val username: String,
    val password: String,
    val cpf: String,
    val situation: String,
    val registration: Long
)
