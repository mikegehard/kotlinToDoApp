package com.example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class TodoAppApplication

fun main(args: Array<String>) {
    SpringApplication.run(TodoAppApplication::class.java, *args)
}
