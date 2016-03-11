package com.example

import org.jetbrains.spek.api.Spek
import org.assertj.core.api.Assertions.assertThat

//import org.junit.runner.RunWith
//import org.springframework.boot.test.SpringApplicationConfiguration
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
//import org.springframework.test.context.web.WebAppConfiguration

//@RunWith(SpringJUnit4ClassRunner::class)
//@SpringApplicationConfiguration(classes = arrayOf(TodoAppApplication::class))
//@WebAppConfiguration
class SpekTodoApplicationTests : Spek({
    describe("a test") {
        it("works") {
            assertThat(6).isEqualTo(6)
        }
    }
})