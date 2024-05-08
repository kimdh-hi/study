/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records


import java.math.BigDecimal

import org.jooq.generated.enums.FilmListRating
import org.jooq.generated.tables.FilmList
import org.jooq.impl.TableRecordImpl
import org.jooq.types.UInteger
import org.jooq.types.UShort


/**
 * VIEW
 */
@Suppress("UNCHECKED_CAST")
open class FilmListRecord() : TableRecordImpl<FilmListRecord>(FilmList.FILM_LIST) {

    open var fid: UInteger?
        set(value): Unit = set(0, value)
        get(): UInteger? = get(0) as UInteger?

    open var title: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var description: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var category: String?
        set(value): Unit = set(3, value)
        get(): String? = get(3) as String?

    open var price: BigDecimal?
        set(value): Unit = set(4, value)
        get(): BigDecimal? = get(4) as BigDecimal?

    open var length: UShort?
        set(value): Unit = set(5, value)
        get(): UShort? = get(5) as UShort?

    open var rating: FilmListRating?
        set(value): Unit = set(6, value)
        get(): FilmListRating? = get(6) as FilmListRating?

    open var actors: String?
        set(value): Unit = set(7, value)
        get(): String? = get(7) as String?

    /**
     * Create a detached, initialised FilmListRecord
     */
    constructor(fid: UInteger? = null, title: String? = null, description: String? = null, category: String? = null, price: BigDecimal? = null, length: UShort? = null, rating: FilmListRating? = null, actors: String? = null): this() {
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
     * Create a detached, initialised FilmListRecord
     */
    constructor(value: org.jooq.generated.tables.pojos.FilmList?): this() {
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
