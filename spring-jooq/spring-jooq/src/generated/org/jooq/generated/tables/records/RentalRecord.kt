/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records


import java.time.LocalDateTime

import org.jooq.Record1
import org.jooq.generated.tables.Rental
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.types.UInteger


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class RentalRecord() : UpdatableRecordImpl<RentalRecord>(Rental.RENTAL) {

    open var rentalId: Int?
        set(value): Unit = set(0, value)
        get(): Int? = get(0) as Int?

    open var rentalDate: LocalDateTime?
        set(value): Unit = set(1, value)
        get(): LocalDateTime? = get(1) as LocalDateTime?

    open var inventoryId: UInteger?
        set(value): Unit = set(2, value)
        get(): UInteger? = get(2) as UInteger?

    open var customerId: UInteger?
        set(value): Unit = set(3, value)
        get(): UInteger? = get(3) as UInteger?

    open var returnDate: LocalDateTime?
        set(value): Unit = set(4, value)
        get(): LocalDateTime? = get(4) as LocalDateTime?

    open var staffId: UInteger?
        set(value): Unit = set(5, value)
        get(): UInteger? = get(5) as UInteger?

    open var lastUpdate: LocalDateTime?
        set(value): Unit = set(6, value)
        get(): LocalDateTime? = get(6) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Int?> = super.key() as Record1<Int?>

    /**
     * Create a detached, initialised RentalRecord
     */
    constructor(rentalId: Int? = null, rentalDate: LocalDateTime? = null, inventoryId: UInteger? = null, customerId: UInteger? = null, returnDate: LocalDateTime? = null, staffId: UInteger? = null, lastUpdate: LocalDateTime? = null): this() {
        this.rentalId = rentalId
        this.rentalDate = rentalDate
        this.inventoryId = inventoryId
        this.customerId = customerId
        this.returnDate = returnDate
        this.staffId = staffId
        this.lastUpdate = lastUpdate
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised RentalRecord
     */
    constructor(value: org.jooq.generated.tables.pojos.Rental?): this() {
        if (value != null) {
            this.rentalId = value.rentalId
            this.rentalDate = value.rentalDate
            this.inventoryId = value.inventoryId
            this.customerId = value.customerId
            this.returnDate = value.returnDate
            this.staffId = value.staffId
            this.lastUpdate = value.lastUpdate
            resetChangedOnNotNull()
        }
    }
}
