package com.lecture.pharmacy.api.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class RestTemplateConfig {

  @Bean
  fun restTemplate() = RestTemplate()
}