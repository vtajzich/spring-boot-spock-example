package net.tajzich.example.spring.boot.spock

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

/**
 * Created by vtajzich
 */
@ContextConfiguration(loader = SpringApplicationContextLoader, classes = Application, locations = ['classpath:test-context.xml'])
class ApplicationSpec extends Specification {

    @Autowired
    ExampleService service

    def "application context should start properly"() {

        when:

        boolean result = service.isGreatDay()

        then:

        result
    }
}
