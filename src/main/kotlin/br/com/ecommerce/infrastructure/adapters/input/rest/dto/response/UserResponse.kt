package br.com.ecommerce.infrastructure.adapters.input.rest.dto.response

data class UserResponse(
    val id: Long,
    val name: String? = null,
    val username: String,
    val password: String,
    val cpf: String,
    val situation: String,
    val registration: Long
)
