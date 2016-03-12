package com.example

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.web.WebAppConfiguration

@RunWith(SpringJUnit4ClassRunner::class)
@SpringApplicationConfiguration(classes = arrayOf(TodoAppApplication::class))
@WebAppConfiguration
class JUnitTodoApplicationTests {
    @Test
    fun itWorks() {
        assertThat(2).isEqualTo(2)
    }
}