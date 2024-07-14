/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records


import java.time.LocalDateTime

import org.jooq.Record2
import org.jooq.generated.tables.JFilmActor
import org.jooq.generated.tables.pojos.FilmActor
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class FilmActorRecord() : UpdatableRecordImpl<FilmActorRecord>(JFilmActor.FILM_ACTOR) {

    open var actorId: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var filmId: Long?
        set(value): Unit = set(1, value)
        get(): Long? = get(1) as Long?

    open var lastUpdate: LocalDateTime?
        set(value): Unit = set(2, value)
        get(): LocalDateTime? = get(2) as LocalDateTime?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record2<Long?, Long?> = super.key() as Record2<Long?, Long?>

    /**
     * Create a detached, initialised FilmActorRecord
     */
    constructor(actorId: Long? = null, filmId: Long? = null, lastUpdate: LocalDateTime? = null): this() {
        this.actorId = actorId
        this.filmId = filmId
        this.lastUpdate = lastUpdate
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised FilmActorRecord
     */
    constructor(value: FilmActor?): this() {
        if (value != null) {
            this.actorId = value.actorId
            this.filmId = value.filmId
            this.lastUpdate = value.lastUpdate
            resetChangedOnNotNull()
        }
    }
}
