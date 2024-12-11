package br.com.ecommerce.infrastructure.adapters.output.persistance.repository

import br.com.ecommerce.infrastructure.adapters.output.persistance.entity.UserEntity
import org.springframework.jdbc.core.RowMapper
import org.springframework.jdbc.core.simple.JdbcClient
import org.springframework.stereotype.Repository
import java.sql.ResultSet


@Repository
class UserRepository(
    private val jdbcClient: JdbcClient
) {
    fun findByRegistration(registration: Long): UserEntity {
        return jdbcClient
            .sql("SELECT * FROM USERS WHERE REGISTRATION = :REGISTRATION")
            .param("REGISTRATION", registration)
            .query(UserEntityRowMapper())
            .single()
    }

    fun save(userEntity: UserEntity): UserEntity {
        jdbcClient
            .sql("INSERT INTO USERS (REGISTRATION, NAME, USERNAME, PASSWORD, CPF, ID_SIT) VALUES (:REGISTRATION, :NAME, :USERNAME, :PASSWORD, :CPF, :SITUATION)")
            .param("REGISTRATION", userEntity.registration)
            .param("NAME", userEntity.name)
            .param("USERNAME", userEntity.username)
            .param("PASSWORD", userEntity.password)
            .param("CPF", userEntity.cpf)
            .param("SITUATION", userEntity.situation)
            .update()
        return userEntity.copy(id = 1L)
    }
}

class UserEntityRowMapper : RowMapper<UserEntity> {
    override fun mapRow(rs: ResultSet, rowNum: Int): UserEntity {
        return UserEntity(
            id = rs.getLong("ID"),
            name = rs.getString("NAME"),
            username = rs.getString("USERNAME"),
            password = rs.getString("PASSWORD"),
            cpf = rs.getString("CPF"),
            situation = rs.getString("ID_SIT"),
            registration = rs.getLong("REGISTRATION")
        )
    }
}