package br.com.ecommerce.infrastructure.adapters.output.persistance.repository

import br.com.ecommerce.infrastructure.adapters.output.persistance.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<UserEntity, Long> {
    fun findByRegistration(registration: Long): UserEntity
}