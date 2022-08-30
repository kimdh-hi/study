package com.toy.rabbitmqservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class RabbitmqServiceApplication

fun main(args: Array<String>) {
  runApplication<RabbitmqServiceApplication>(*args)
}
