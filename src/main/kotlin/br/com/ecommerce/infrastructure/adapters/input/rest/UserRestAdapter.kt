package br.com.ecommerce.infrastructure.adapters.input.rest

import br.com.ecommerce.application.ports.input.CreateUserUseCase
import br.com.ecommerce.application.ports.input.GetUserUseCase
import br.com.ecommerce.infrastructure.adapters.input.rest.dto.request.UserRequest
import br.com.ecommerce.infrastructure.adapters.input.rest.dto.response.UserResponse
import br.com.ecommerce.infrastructure.adapters.input.rest.mapper.UserRestMapper
import br.com.ecommerce.infrastructure.adapters.input.rest.spec.UserControllerSpec
import org.springframework.web.bind.annotation.RestController

@RestController
class UserRestAdapter(
    private val createUserUseCase: CreateUserUseCase,
    private val getUserUseCase: GetUserUseCase,
    private val userRestMapper: UserRestMapper
) : UserControllerSpec {
    override fun get(id: Long): UserResponse {
        return userRestMapper.toUserResponse(getUserUseCase.getUser(id))
    }

    override fun post(userRequest: UserRequest): UserResponse {
        val user = userRestMapper.toUser(userRequest)
        return userRestMapper.toUserResponse(createUserUseCase.createUser(user));
    }
}