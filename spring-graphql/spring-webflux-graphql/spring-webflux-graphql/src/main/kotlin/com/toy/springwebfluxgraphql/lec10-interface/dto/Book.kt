package com.toy.springwebfluxgraphql.`lec10-interface`.dto

import java.util.*

data class Book(
  val id: UUID = UUID.randomUUID(),
  val description: String,
  val price: Int,
  val author: String
)