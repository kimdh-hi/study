/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.pojos


import java.io.Serializable
import java.math.BigDecimal

import org.jooq.generated.enums.FilmListRating


/**
 * VIEW
 */
@Suppress("UNCHECKED_CAST")
data class FilmList(
    var fid: Long? = null,
    var title: String? = null,
    var description: String? = null,
    var category: String? = null,
    var price: BigDecimal? = null,
    var length: Int? = null,
    var rating: FilmListRating? = null,
    var actors: String? = null
): Serializable {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other == null)
            return false
        if (this::class != other::class)
            return false
        val o: FilmList = other as FilmList
        if (this.fid == null) {
            if (o.fid != null)
                return false
        }
        else if (this.fid != o.fid)
            return false
        if (this.title == null) {
            if (o.title != null)
                return false
        }
        else if (this.title != o.title)
            return false
        if (this.description == null) {
            if (o.description != null)
                return false
        }
        else if (this.description != o.description)
            return false
        if (this.category == null) {
            if (o.category != null)
                return false
        }
        else if (this.category != o.category)
            return false
        if (this.price == null) {
            if (o.price != null)
                return false
        }
        else if (this.price != o.price)
            return false
        if (this.length == null) {
            if (o.length != null)
                return false
        }
        else if (this.length != o.length)
            return false
        if (this.rating == null) {
            if (o.rating != null)
                return false
        }
        else if (this.rating != o.rating)
            return false
        if (this.actors == null) {
            if (o.actors != null)
                return false
        }
        else if (this.actors != o.actors)
            return false
        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + (if (this.fid == null) 0 else this.fid.hashCode())
        result = prime * result + (if (this.title == null) 0 else this.title.hashCode())
        result = prime * result + (if (this.description == null) 0 else this.description.hashCode())
        result = prime * result + (if (this.category == null) 0 else this.category.hashCode())
        result = prime * result + (if (this.price == null) 0 else this.price.hashCode())
        result = prime * result + (if (this.length == null) 0 else this.length.hashCode())
        result = prime * result + (if (this.rating == null) 0 else this.rating.hashCode())
        result = prime * result + (if (this.actors == null) 0 else this.actors.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("FilmList (")

        sb.append(fid)
        sb.append(", ").append(title)
        sb.append(", ").append(description)
        sb.append(", ").append(category)
        sb.append(", ").append(price)
        sb.append(", ").append(length)
        sb.append(", ").append(rating)
        sb.append(", ").append(actors)

        sb.append(")")
        return sb.toString()
    }
}
