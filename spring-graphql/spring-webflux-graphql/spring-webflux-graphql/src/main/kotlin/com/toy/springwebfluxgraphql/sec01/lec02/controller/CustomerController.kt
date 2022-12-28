package com.toy.springwebfluxgraphql.sec01.lec02.controller

import com.toy.springwebfluxgraphql.sec01.lec02.domain.Customer
import com.toy.springwebfluxgraphql.sec01.lec02.service.CustomerService
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
class CustomerController(
  private val customerService: CustomerService
) {

  @QueryMapping
  fun customers(): Flux<Customer> = customerService.findAll()

  @QueryMapping
  fun customerById(@Argument id: Long): Mono<Customer?> = customerService.findById(id)

  @QueryMapping
  fun customersNameContains(@Argument name: String): Flux<Customer> =
    customerService.findByNameContains(name)
}