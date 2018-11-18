package com.docterryome.todo.toDoListapp

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit.jupiter.SpringExtension

@ExtendWith(SpringExtension::class)
class IntegrationTest(@Autowired val restTemplate: TestRestTemplate)