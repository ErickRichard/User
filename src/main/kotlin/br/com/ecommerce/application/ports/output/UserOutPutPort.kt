package br.com.ecommerce.application.ports.output

import br.com.ecommerce.domain.model.User

interface UserOutPutPort {
    fun save(user: User): User
    fun getUserById(registration: Long): User
}