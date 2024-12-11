package br.com.ecommerce.infrastructure.adapters.input.rest.mapper

import br.com.ecommerce.domain.model.User
import br.com.ecommerce.infrastructure.adapters.input.rest.dto.request.UserRequest
import br.com.ecommerce.infrastructure.adapters.input.rest.dto.response.UserResponse
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
interface UserRestMapper {
    fun toUser(userRequest: UserRequest): User
    fun toUserResponse(user: User): UserResponse
}