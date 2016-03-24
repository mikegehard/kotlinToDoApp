package com.example

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

// Is there a way that I do not have to mark the repository
// as a Spring @Component?
// Would minimize the framework leaking into the domain layer?
// Is a repository the domain layer?
// Is it better to be explicit about wiring of domain dependencies
// or just let the framework put them together?
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
