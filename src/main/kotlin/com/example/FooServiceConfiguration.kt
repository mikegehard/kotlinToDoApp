package com.example

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class FooServiceConfiguration(@Autowired private val repository: FooRepository) {

    @Bean
    open fun fooService(): FooService = FooService(repository)
}
