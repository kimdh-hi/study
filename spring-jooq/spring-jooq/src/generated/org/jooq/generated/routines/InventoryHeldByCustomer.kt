/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.routines


import org.jooq.Field
import org.jooq.Parameter
import org.jooq.generated.Sakila
import org.jooq.impl.AbstractRoutine
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class InventoryHeldByCustomer : AbstractRoutine<Int>("inventory_held_by_customer", Sakila.SAKILA, SQLDataType.INTEGER) {
    companion object {

        /**
         * The parameter
         * <code>sakila.inventory_held_by_customer.RETURN_VALUE</code>.
         */
        val RETURN_VALUE: Parameter<Int?> = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false)

        /**
         * The parameter
         * <code>sakila.inventory_held_by_customer.p_inventory_id</code>.
         */
        val P_INVENTORY_ID: Parameter<Int?> = Internal.createParameter("p_inventory_id", SQLDataType.INTEGER, false, false)
    }

    init {
        returnParameter = RETURN_VALUE
        addInParameter(P_INVENTORY_ID)
    }

    /**
     * Set the <code>p_inventory_id</code> parameter IN value to the routine
     */
    fun setPInventoryId(value: Int?): Unit = setValue(P_INVENTORY_ID, value)

    /**
     * Set the <code>p_inventory_id</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    fun setPInventoryId(field: Field<Int?>): InventoryHeldByCustomer {
        setField(P_INVENTORY_ID, field)
        return this
    }
}
