package com.example

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class FooRepository {
    companion object {
        private val logger = LoggerFactory.getLogger(FooRepository::class.java)
    }

    fun allFoos(): List<Foo> {
        logger.info("************ Getting all Foos! ************")
        return listOf(Foo())
    }
}
