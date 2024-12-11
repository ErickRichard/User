package br.com.ecommerce.infrastructure.adapters.input.rest.spec

import br.com.ecommerce.infrastructure.adapters.input.rest.dto.request.UserRequest
import br.com.ecommerce.infrastructure.adapters.input.rest.dto.response.UserResponse
import org.springframework.http.HttpStatus
import org.springframework.util.MimeTypeUtils
import org.springframework.web.bind.annotation.*

@RequestMapping("/user", produces = [MimeTypeUtils.APPLICATION_JSON_VALUE])
interface UserControllerSpec {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getAll(): List<UserResponse>

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getByRegistration(@PathVariable registration: Long): UserResponse

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun post(@RequestBody userRequest: UserRequest): UserResponse
}