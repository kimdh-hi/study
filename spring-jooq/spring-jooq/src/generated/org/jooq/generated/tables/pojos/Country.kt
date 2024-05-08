/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.pojos


import java.io.Serializable
import java.time.LocalDateTime

import org.jooq.types.UInteger


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class Country(
    var countryId: UInteger? = null,
    var country: String? = null,
    var lastUpdate: LocalDateTime? = null
): Serializable {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other == null)
            return false
        if (this::class != other::class)
            return false
        val o: Country = other as Country
        if (this.countryId == null) {
            if (o.countryId != null)
                return false
        }
        else if (this.countryId != o.countryId)
            return false
        if (this.country == null) {
            if (o.country != null)
                return false
        }
        else if (this.country != o.country)
            return false
        if (this.lastUpdate == null) {
            if (o.lastUpdate != null)
                return false
        }
        else if (this.lastUpdate != o.lastUpdate)
            return false
        return true
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + (if (this.countryId == null) 0 else this.countryId.hashCode())
        result = prime * result + (if (this.country == null) 0 else this.country.hashCode())
        result = prime * result + (if (this.lastUpdate == null) 0 else this.lastUpdate.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("Country (")

        sb.append(countryId)
        sb.append(", ").append(country)
        sb.append(", ").append(lastUpdate)

        sb.append(")")
        return sb.toString()
    }
}
