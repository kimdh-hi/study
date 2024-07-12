/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records


import java.time.LocalDateTime

import org.jooq.Record1
import org.jooq.generated.tables.JStaff
import org.jooq.generated.tables.pojos.Staff
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.types.UInteger


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class StaffRecord() : UpdatableRecordImpl<StaffRecord>(JStaff.STAFF) {

    open var staffId: UInteger?
        set(value): Unit = set(0, value)
        get(): UInteger? = get(0) as UInteger?

    open var firstName: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var lastName: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var addressId: UInteger?
        set(value): Unit = set(3, value)
        get(): UInteger? = get(3) as UInteger?

    open var picture: ByteArray?
        set(value): Unit = set(4, value)
        get(): ByteArray? = get(4) as ByteArray?

    open var email: String?
        set(value): Unit = set(5, value)
        get(): String? = get(5) as String?

    open var storeId: UInteger?
        set(value): Unit = set(6, value)
        get(): UInteger? = get(6) as UInteger?

    open var active: Byte?
        set(value): Unit = set(7, value)
        get(): Byte? = get(7) as Byte?

    open var username: String?
        set(value): Unit = set(8, value)
        get(): String? = get(8) as String?

    open var password: String?
        set(value): Unit = set(9, value)
        get(): String? = get(9) as String?

    open var lastUpdate: LocalDateTime?
        set(value): Unit = set(10, value)
        get(): LocalDateTime? = get(10) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<UInteger?> = super.key() as Record1<UInteger?>

    /**
     * Create a detached, initialised StaffRecord
     */
    constructor(staffId: UInteger? = null, firstName: String? = null, lastName: String? = null, addressId: UInteger? = null, picture: ByteArray? = null, email: String? = null, storeId: UInteger? = null, active: Byte? = null, username: String? = null, password: String? = null, lastUpdate: LocalDateTime? = null): this() {
        this.staffId = staffId
        this.firstName = firstName
        this.lastName = lastName
        this.addressId = addressId
        this.picture = picture
        this.email = email
        this.storeId = storeId
        this.active = active
        this.username = username
        this.password = password
        this.lastUpdate = lastUpdate
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised StaffRecord
     */
    constructor(value: Staff?): this() {
        if (value != null) {
            this.staffId = value.staffId
            this.firstName = value.firstName
            this.lastName = value.lastName
            this.addressId = value.addressId
            this.picture = value.picture
            this.email = value.email
            this.storeId = value.storeId
            this.active = value.active
            this.username = value.username
            this.password = value.password
            this.lastUpdate = value.lastUpdate
            resetChangedOnNotNull()
        }
    }
}
