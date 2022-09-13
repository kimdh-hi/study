package com.study.springcoreadvanced.app.v2

import com.study.springcoreadvanced.trace.TraceId
import com.study.springcoreadvanced.trace.TraceStatus
import com.study.springcoreadvanced.trace.hellotrace.HelloTraceV1
import com.study.springcoreadvanced.trace.hellotrace.HelloTraceV2
import org.springframework.stereotype.Service

@Service
class OrderServiceV2(
  private val orderRepositoryV2: OrderRepositoryV2,
  private val helloTrace: HelloTraceV2
) {

  fun orderItem(id: String, traceId: TraceId) {
    var status: TraceStatus? = null
    try {
      status = helloTrace.beginSync(traceId, "OrderServiceV2.orderItem")
      orderRepositoryV2.save(id, status.traceId)
    } catch (e: Exception) {
      helloTrace.exception(status!!, e)
      throw e
    }
  }
}