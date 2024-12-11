package br.com.ecommerce.domain.service

import br.com.ecommerce.application.ports.input.CreateUserUseCase
import br.com.ecommerce.application.ports.input.GetUserUseCase
import br.com.ecommerce.application.ports.output.UserOutPutPort
import br.com.ecommerce.domain.model.User

class UserService(
    private val userOutPutPort: UserOutPutPort
) : CreateUserUseCase, GetUserUseCase {
    override fun createUser(user: User): User {
        return runCatching { userOutPutPort.save(user) }
            .onFailure { exception -> println("Erro ao salvar usuário: ${exception.message}") }
            .getOrThrow()
    }

    override fun getUser(registration: Long): User {
        return userOutPutPort.getUserByRegistration(registration)
    }

    override fun getAll(): List<User> {
        return userOutPutPort.getAll()
    }
}