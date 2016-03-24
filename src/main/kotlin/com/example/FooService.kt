package com.example

import org.slf4j.LoggerFactory

class FooService(val repository: FooRepository) {
    companion object {
        private val logger = LoggerFactory.getLogger(FooService::class.java)
    }

    fun doSomethingWithAllFoos() {
        logger.info("*********** Doing something with all the Foos!! ********")
        repository.allFoos()
    }
}
