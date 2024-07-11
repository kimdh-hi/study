/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records


import jakarta.validation.constraints.NotNull

import java.time.LocalDateTime

import org.jooq.Record2
import org.jooq.generated.tables.JFilmCategory
import org.jooq.generated.tables.pojos.FilmCategory
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.types.UInteger


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class FilmCategoryRecord() : UpdatableRecordImpl<FilmCategoryRecord>(JFilmCategory.FILM_CATEGORY) {

    @get:NotNull
    open var filmId: UInteger?
        set(value): Unit = set(0, value)
        get(): UInteger? = get(0) as UInteger?

    @get:NotNull
    open var categoryId: UInteger?
        set(value): Unit = set(1, value)
        get(): UInteger? = get(1) as UInteger?

    open var lastUpdate: LocalDateTime?
        set(value): Unit = set(2, value)
        get(): LocalDateTime? = get(2) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record2<UInteger?, UInteger?> = super.key() as Record2<UInteger?, UInteger?>

    /**
     * Create a detached, initialised FilmCategoryRecord
     */
    constructor(filmId: UInteger? = null, categoryId: UInteger? = null, lastUpdate: LocalDateTime? = null): this() {
        this.filmId = filmId
        this.categoryId = categoryId
        this.lastUpdate = lastUpdate
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised FilmCategoryRecord
     */
    constructor(value: FilmCategory?): this() {
        if (value != null) {
            this.filmId = value.filmId
            this.categoryId = value.categoryId
            this.lastUpdate = value.lastUpdate
            resetChangedOnNotNull()
        }
    }
}
