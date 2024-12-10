package br.com.ecommerce.infrastructure.adapters.output.persistance.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "USERS", schema = "dbo")
data class UserEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    val id: Long,
    @Column(name = "NAME")
    val name: String? = null,
    @Column(name = "USERNAME")
    val username: String,
    @Column(name = "PASSWORD")
    val password: String,
    @Column(name = "CPF")
    val cpf: String,
    @Column(name = "ID_SIT")
    val situation: String,
    @Column(name = "REGISTRATION")
    val registration: Long
)