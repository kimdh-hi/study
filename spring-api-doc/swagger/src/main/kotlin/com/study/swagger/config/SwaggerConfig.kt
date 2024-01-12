package com.study.swagger.config

import com.study.swagger.vo.InternalVO
import io.swagger.v3.core.jackson.ModelResolver.enumsAsRef
import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.Operation
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.media.Schema
import io.swagger.v3.oas.models.security.SecurityScheme
import org.springdoc.core.customizers.GlobalOperationCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpHeaders
import org.springframework.web.method.HandlerMethod

@Configuration
class SwaggerConfig {

  @Bean
  fun actuatorCustomizer(): GlobalOperationCustomizer {
    return CustomActuatorOperationCustomizer()
  }

  class CustomActuatorOperationCustomizer: GlobalOperationCustomizer {

    override fun customize(operation: Operation, handlerMethod: HandlerMethod): Operation {
      operation.operationId = "${handlerMethod.beanType.name.substringAfterLast(".")}.${handlerMethod.method.name}"
      return operation
    }
  }


  @Bean
  fun openAPI(): OpenAPI {
    return OpenAPI()
      .info(info())
      .components(
        Components().addSecuritySchemes("SEC",
          SecurityScheme().type(SecurityScheme.Type.APIKEY).`in`(SecurityScheme.In.HEADER)
            .name(HttpHeaders.AUTHORIZATION)
        ),
      )
      .components(
        Components().addSchemas("UnusedDTO", Schema<InternalVO>().type("object"))
      )
  }

  private fun info() = Info()
    .title("Title")
    .description("Description")
    .version("1.0")

  companion object {
    init {
      enumsAsRef = true
    }
  }
}
