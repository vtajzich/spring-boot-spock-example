package net.tajzich.example.spring.boot.spock

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

import static junit.framework.Assert.assertTrue

@RunWith(SpringJUnit4ClassRunner)
@SpringApplicationConfiguration(classes = Application, locations = ['classpath:test-context.xml'])
class ApplicationTests {

	@Autowired
	ExampleService service

	@Test
	void contextLoads() {
		assertTrue(service.isGreatDay())
	}
}
