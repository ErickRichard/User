package br.com.ecommerce.infrastructure.adapters.input.rest.mapper

import br.com.ecommerce.infrastructure.adapters.input.rest.dto.response.UserResponse
import java.io.Serializable

data class UserDTO(
    val id: Long,
    val name: String? = null,
    val username: String,
    val password: String,
    val cpf: String,
    val situation: String,
    val registration: Long
) : Serializable

fun UserResponse.toDTO(): UserDTO = UserDTO(
    id = this.id,
    name = this.name,
    username = this.username,
    password = this.password,
    cpf = this.cpf,
    situation = this.situation,
    registration = this.registration
)