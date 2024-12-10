package br.com.ecommerce.application.ports.input

import br.com.ecommerce.domain.model.User

interface GetUserUseCase {
    fun getUser(id: Long): User
}