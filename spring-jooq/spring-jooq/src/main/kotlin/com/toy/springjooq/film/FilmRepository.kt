package com.toy.springjooq.film

import org.jooq.DSLContext
import org.jooq.generated.tables.JFilm
import org.jooq.generated.tables.pojos.Film
import org.springframework.stereotype.Repository

@Repository
class FilmRepository(
  private val dslContext: DSLContext
) {

  private val film = JFilm.FILM

  fun findById(id: Long): Film? {
    return dslContext.select()
      .from(film)
      .where(film.FILM_ID.eq(id))
      .fetchOneInto(Film::class.java)
  }
}