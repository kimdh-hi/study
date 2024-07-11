/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records


import jakarta.validation.constraints.NotNull

import java.math.BigDecimal
import java.time.LocalDateTime

import org.jooq.Record1
import org.jooq.generated.tables.JPayment
import org.jooq.generated.tables.pojos.Payment
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.types.UInteger


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class PaymentRecord() : UpdatableRecordImpl<PaymentRecord>(JPayment.PAYMENT) {

    open var paymentId: UInteger?
        set(value): Unit = set(0, value)
        get(): UInteger? = get(0) as UInteger?

    @get:NotNull
    open var customerId: UInteger?
        set(value): Unit = set(1, value)
        get(): UInteger? = get(1) as UInteger?

    @get:NotNull
    open var staffId: UInteger?
        set(value): Unit = set(2, value)
        get(): UInteger? = get(2) as UInteger?

    open var rentalId: Int?
        set(value): Unit = set(3, value)
        get(): Int? = get(3) as Int?

    @get:NotNull
    open var amount: BigDecimal?
        set(value): Unit = set(4, value)
        get(): BigDecimal? = get(4) as BigDecimal?

    @get:NotNull
    open var paymentDate: LocalDateTime?
        set(value): Unit = set(5, value)
        get(): LocalDateTime? = get(5) as LocalDateTime?

    open var lastUpdate: LocalDateTime?
        set(value): Unit = set(6, value)
        get(): LocalDateTime? = get(6) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<UInteger?> = super.key() as Record1<UInteger?>

    /**
     * Create a detached, initialised PaymentRecord
     */
    constructor(paymentId: UInteger? = null, customerId: UInteger? = null, staffId: UInteger? = null, rentalId: Int? = null, amount: BigDecimal? = null, paymentDate: LocalDateTime? = null, lastUpdate: LocalDateTime? = null): this() {
        this.paymentId = paymentId
        this.customerId = customerId
        this.staffId = staffId
        this.rentalId = rentalId
        this.amount = amount
        this.paymentDate = paymentDate
        this.lastUpdate = lastUpdate
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised PaymentRecord
     */
    constructor(value: Payment?): this() {
        if (value != null) {
            this.paymentId = value.paymentId
            this.customerId = value.customerId
            this.staffId = value.staffId
            this.rentalId = value.rentalId
            this.amount = value.amount
            this.paymentDate = value.paymentDate
            this.lastUpdate = value.lastUpdate
            resetChangedOnNotNull()
        }
    }
}
