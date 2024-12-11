package br.com.ecommerce.infrastructure.adapters.output.persistance.entity


data class UserEntity(
    val id: Long,
    val name: String? = null,
    val username: String,
    val password: String,
    val cpf: String,
    val situation: String,
    val registration: Long
)