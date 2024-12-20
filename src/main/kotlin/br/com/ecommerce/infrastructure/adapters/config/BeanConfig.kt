package br.com.ecommerce.infrastructure.adapters.config

import br.com.ecommerce.application.ports.output.UserOutPutPort
import br.com.ecommerce.application.ports.service.UserService
import br.com.ecommerce.infrastructure.adapters.output.persistance.adapter.UserPersistenceAdapter
import br.com.ecommerce.infrastructure.adapters.output.persistance.mapper.UserMapper
import br.com.ecommerce.infrastructure.adapters.output.persistance.repository.UserRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate


@Configuration
class BeanConfig {
    @Bean
    fun restTemplate(): RestTemplate {
        return RestTemplate()
    }

    @Bean
    fun userService(userOutPutPort: UserOutPutPort): UserService {
        return UserService(userOutPutPort)
    }

    @Bean
    fun orderPersistenceAdapter(repository: UserRepository, mapper: UserMapper
    ): UserPersistenceAdapter {
        return UserPersistenceAdapter(repository, mapper)
    }
}