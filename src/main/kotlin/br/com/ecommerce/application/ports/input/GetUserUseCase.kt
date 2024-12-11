package br.com.ecommerce.application.ports.input

import br.com.ecommerce.domain.model.User

interface GetUserUseCase {
    fun getUser(registration: Long): User
    fun getAll(): List<User>
}