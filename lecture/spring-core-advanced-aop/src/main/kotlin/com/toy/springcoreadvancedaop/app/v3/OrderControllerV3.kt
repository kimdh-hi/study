package com.toy.springcoreadvancedaop.app.v3

import com.toy.springcoreadvancedaop.trace.TraceStatus
import com.toy.springcoreadvancedaop.trace.logtrace.LogTrace
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class OrderControllerV3(
  private val orderServiceV2: OrderServiceV3,
  private val logTrace: LogTrace
) {

  @GetMapping("/v3/request/{id}")
  fun request(@PathVariable id: String): String {
    var status: TraceStatus? = null
    try {
      status = logTrace.begin("OrderController.request")
      orderServiceV2.orderItem(id, status.traceId)
      logTrace.end(status)
      return "ok"
    } catch (e: Exception) {
      logTrace.exception(status!!, e)
      throw e
    }
  }
}