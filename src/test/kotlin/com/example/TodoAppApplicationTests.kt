package com.example

import io.damo.kspec.Spec
import org.assertj.core.api.Assertions.assertThat

//@RunWith(SpringJUnit4ClassRunner::class)
//@SpringApplicationConfiguration(classes = arrayOf(TodoAppApplication::class))
//@WebAppConfiguration
class TodoAppApplicationTests : Spec({
	describe("it works") {
		test {
			assertThat(2).isEqualTo(2)
		}
	}
})
