/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.pojos


import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

import java.io.Serializable
import java.time.LocalDateTime

import org.jooq.types.UInteger


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class Actor(
    var actorId: UInteger? = null,
    @get:NotNull
    @get:Size(max = 45)
    var firstName: String? = null,
    @get:NotNull
    @get:Size(max = 45)
    var lastName: String? = null,
    var lastUpdate: LocalDateTime? = null
): Serializable {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other == null)
            return false
        if (this::class != other::class)
            return false
        val o: Actor = other as Actor
        if (this.actorId == null) {
            if (o.actorId != null)
                return false
        }
        else if (this.actorId != o.actorId)
            return false
        if (this.firstName == null) {
            if (o.firstName != null)
                return false
        }
        else if (this.firstName != o.firstName)
            return false
        if (this.lastName == null) {
            if (o.lastName != null)
                return false
        }
        else if (this.lastName != o.lastName)
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
        result = prime * result + (if (this.actorId == null) 0 else this.actorId.hashCode())
        result = prime * result + (if (this.firstName == null) 0 else this.firstName.hashCode())
        result = prime * result + (if (this.lastName == null) 0 else this.lastName.hashCode())
        result = prime * result + (if (this.lastUpdate == null) 0 else this.lastUpdate.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("Actor (")

        sb.append(actorId)
        sb.append(", ").append(firstName)
        sb.append(", ").append(lastName)
        sb.append(", ").append(lastUpdate)

        sb.append(")")
        return sb.toString()
    }
}
