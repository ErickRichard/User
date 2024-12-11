package br.com.ecommerce.application.ports.output

import br.com.ecommerce.domain.model.User

interface UserOutPutPort {
    fun getAll(): List<User>
    fun getUserByRegistration(registration: Long): User
    fun save(user: User): User
}