package com.example

import io.micronaut.test.extensions.kotest5.annotation.MicronautTest
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldNotBe

@MicronautTest
class DemoTest(
    private val workingRepository: WorkingRepository,
    private val brokenRepository: BrokenRepository
): StringSpec({

    "test the working repository" {
        val entity = workingRepository.save(DataEntity(data = "test"))
        entity.id shouldNotBe null
    }

    "test the broken repository" {
        val entity = brokenRepository.save(DataEntity(data = "test"))
        entity.id shouldNotBe null
    }
})
