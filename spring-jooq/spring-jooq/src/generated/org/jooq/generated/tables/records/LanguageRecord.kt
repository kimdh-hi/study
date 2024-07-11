/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records


import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

import java.time.LocalDateTime

import org.jooq.Record1
import org.jooq.generated.tables.JLanguage
import org.jooq.generated.tables.pojos.Language
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.types.UInteger


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class LanguageRecord() : UpdatableRecordImpl<LanguageRecord>(JLanguage.LANGUAGE) {

    open var languageId: UInteger?
        set(value): Unit = set(0, value)
        get(): UInteger? = get(0) as UInteger?

    @get:NotNull
    @get:Size(max = 20)
    open var name: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var lastUpdate: LocalDateTime?
        set(value): Unit = set(2, value)
        get(): LocalDateTime? = get(2) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<UInteger?> = super.key() as Record1<UInteger?>

    /**
     * Create a detached, initialised LanguageRecord
     */
    constructor(languageId: UInteger? = null, name: String? = null, lastUpdate: LocalDateTime? = null): this() {
        this.languageId = languageId
        this.name = name
        this.lastUpdate = lastUpdate
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised LanguageRecord
     */
    constructor(value: Language?): this() {
        if (value != null) {
            this.languageId = value.languageId
            this.name = value.name
            this.lastUpdate = value.lastUpdate
            resetChangedOnNotNull()
        }
    }
}
