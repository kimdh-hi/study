/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.pojos


import java.io.Serializable
import java.time.LocalDateTime


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class Store(
    var storeId: Long? = null,
    var managerStaffId: Long? = null,
    var addressId: Long? = null,
    var lastUpdate: LocalDateTime? = null
): Serializable {


    override fun equals(other: Any?): Boolean {
        if (this === other)
            return true
        if (other == null)
            return false
        if (this::class != other::class)
            return false
        val o: Store = other as Store
        if (this.storeId == null) {
            if (o.storeId != null)
                return false
        }
        else if (this.storeId != o.storeId)
            return false
        if (this.managerStaffId == null) {
            if (o.managerStaffId != null)
                return false
        }
        else if (this.managerStaffId != o.managerStaffId)
            return false
        if (this.addressId == null) {
            if (o.addressId != null)
                return false
        }
        else if (this.addressId != o.addressId)
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
        result = prime * result + (if (this.storeId == null) 0 else this.storeId.hashCode())
        result = prime * result + (if (this.managerStaffId == null) 0 else this.managerStaffId.hashCode())
        result = prime * result + (if (this.addressId == null) 0 else this.addressId.hashCode())
        result = prime * result + (if (this.lastUpdate == null) 0 else this.lastUpdate.hashCode())
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder("Store (")

        sb.append(storeId)
        sb.append(", ").append(managerStaffId)
        sb.append(", ").append(addressId)
        sb.append(", ").append(lastUpdate)

        sb.append(")")
        return sb.toString()
    }
}
