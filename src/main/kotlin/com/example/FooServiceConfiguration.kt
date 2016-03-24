package com.example

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class FooServiceConfiguration(private val repository: FooRepository) {

    @Bean
    open fun fooService(): FooService = FooService(repository)
}
