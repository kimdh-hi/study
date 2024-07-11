/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records


import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

import java.math.BigDecimal

import org.jooq.generated.enums.NicerButSlowerFilmListRating
import org.jooq.generated.tables.JNicerButSlowerFilmList
import org.jooq.generated.tables.pojos.NicerButSlowerFilmList
import org.jooq.impl.TableRecordImpl
import org.jooq.types.UInteger
import org.jooq.types.UShort


/**
 * VIEW
 */
@Suppress("UNCHECKED_CAST")
open class NicerButSlowerFilmListRecord() : TableRecordImpl<NicerButSlowerFilmListRecord>(JNicerButSlowerFilmList.NICER_BUT_SLOWER_FILM_LIST) {

    open var fid: UInteger?
        set(value): Unit = set(0, value)
        get(): UInteger? = get(0) as UInteger?

    @get:Size(max = 255)
    open var title: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    @get:Size(max = 65535)
    open var description: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    @get:NotNull
    @get:Size(max = 25)
    open var category: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var price: BigDecimal?
        set(value): Unit = set(4, value)
        get(): BigDecimal? = get(4) as BigDecimal?

    open var length: UShort?
        set(value): Unit = set(5, value)
        get(): UShort? = get(5) as UShort?

    open var rating: NicerButSlowerFilmListRating?
        set(value): Unit = set(6, value)
        get(): NicerButSlowerFilmListRating? = get(6) as NicerButSlowerFilmListRating?

    @get:Size(max = 65535)
    open var actors: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    /**
     * Create a detached, initialised NicerButSlowerFilmListRecord
     */
    constructor(fid: UInteger? = null, title: String? = null, description: String? = null, category: String? = null, price: BigDecimal? = null, length: UShort? = null, rating: NicerButSlowerFilmListRating? = null, actors: String? = null): this() {
        this.fid = fid
        this.title = title
        this.description = description
        this.category = category
        this.price = price
        this.length = length
        this.rating = rating
        this.actors = actors
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised NicerButSlowerFilmListRecord
     */
    constructor(value: NicerButSlowerFilmList?): this() {
        if (value != null) {
            this.fid = value.fid
            this.title = value.title
            this.description = value.description
            this.category = value.category
            this.price = value.price
            this.length = value.length
            this.rating = value.rating
            this.actors = value.actors
            resetChangedOnNotNull()
        }
    }
}
