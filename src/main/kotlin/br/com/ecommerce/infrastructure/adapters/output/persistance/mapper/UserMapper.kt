package br.com.ecommerce.infrastructure.adapters.output.persistance.mapper

import br.com.ecommerce.domain.model.User
import br.com.ecommerce.infrastructure.adapters.output.persistance.entity.UserEntity
import org.mapstruct.Mapper
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
interface UserMapper {
    fun toUserEntity(user: User): UserEntity
    fun toDomain(userEntity: UserEntity): User
}