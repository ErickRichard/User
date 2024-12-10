package br.com.ecommerce.application.ports.input

import br.com.ecommerce.domain.model.User

interface CreateUserUseCase {
    fun createUser(user: User): User
}