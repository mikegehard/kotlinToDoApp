package com.example

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan

@EnableAutoConfiguration
@ComponentScan
class TodoAppApplication(@Autowired val fooService: FooService) : CommandLineRunner {
    companion object {
        private val logger = LoggerFactory.getLogger(TodoAppApplication::class.java)
    }

    override fun run(vararg args: String?) {
        logger.info("*************** Setting up application. *************")
        fooService.doSomethingWithAllFoos()
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(TodoAppApplication::class.java, *args)
}
