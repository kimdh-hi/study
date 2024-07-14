/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables


import java.time.LocalDateTime

import kotlin.collections.Collection
import kotlin.collections.List

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Index
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.Path
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.generated.JSakila
import org.jooq.generated.indexes.RENTAL_IDX_FK_CUSTOMER_ID
import org.jooq.generated.indexes.RENTAL_IDX_FK_INVENTORY_ID
import org.jooq.generated.indexes.RENTAL_IDX_FK_STAFF_ID
import org.jooq.generated.keys.FK_PAYMENT_RENTAL
import org.jooq.generated.keys.FK_RENTAL_CUSTOMER
import org.jooq.generated.keys.FK_RENTAL_INVENTORY
import org.jooq.generated.keys.FK_RENTAL_STAFF
import org.jooq.generated.keys.KEY_RENTAL_PRIMARY
import org.jooq.generated.keys.KEY_RENTAL_RENTAL_DATE
import org.jooq.generated.tables.JCustomer.CustomerPath
import org.jooq.generated.tables.JInventory.InventoryPath
import org.jooq.generated.tables.JPayment.PaymentPath
import org.jooq.generated.tables.JStaff.StaffPath
import org.jooq.generated.tables.records.RentalRecord
import org.jooq.impl.AutoConverter
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl
import org.jooq.types.UInteger


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JRental(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, RentalRecord>?,
    parentPath: InverseForeignKey<out Record, RentalRecord>?,
    aliased: Table<RentalRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<RentalRecord>(
    alias,
    JSakila.SAKILA,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>sakila.rental</code>
         */
        val RENTAL: JRental = JRental()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<RentalRecord> = RentalRecord::class.java

    /**
     * The column <code>sakila.rental.rental_id</code>.
     */
    val RENTAL_ID: TableField<RentalRecord, Int?> = createField(DSL.name("rental_id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "")

    /**
     * The column <code>sakila.rental.rental_date</code>.
     */
    val RENTAL_DATE: TableField<RentalRecord, LocalDateTime?> = createField(DSL.name("rental_date"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "")

    /**
     * The column <code>sakila.rental.inventory_id</code>.
     */
    val INVENTORY_ID: TableField<RentalRecord, Long?> = createField(DSL.name("inventory_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "", AutoConverter<UInteger, Long>(UInteger::class.java, Long::class.java))

    /**
     * The column <code>sakila.rental.customer_id</code>.
     */
    val CUSTOMER_ID: TableField<RentalRecord, Long?> = createField(DSL.name("customer_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "", AutoConverter<UInteger, Long>(UInteger::class.java, Long::class.java))

    /**
     * The column <code>sakila.rental.return_date</code>.
     */
    val RETURN_DATE: TableField<RentalRecord, LocalDateTime?> = createField(DSL.name("return_date"), SQLDataType.LOCALDATETIME(0), this, "")

    /**
     * The column <code>sakila.rental.staff_id</code>.
     */
    val STAFF_ID: TableField<RentalRecord, Long?> = createField(DSL.name("staff_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "", AutoConverter<UInteger, Long>(UInteger::class.java, Long::class.java))

    /**
     * The column <code>sakila.rental.last_update</code>.
     */
    val LAST_UPDATE: TableField<RentalRecord, LocalDateTime?> = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "")

    private constructor(alias: Name, aliased: Table<RentalRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<RentalRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<RentalRecord>?, where: Condition): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>sakila.rental</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sakila.rental</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sakila.rental</code> table reference
     */
    constructor(): this(DSL.name("rental"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, RentalRecord>?, parentPath: InverseForeignKey<out Record, RentalRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, RENTAL, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class RentalPath : JRental, Path<RentalRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, RentalRecord>?, parentPath: InverseForeignKey<out Record, RentalRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<RentalRecord>): super(alias, aliased)
        override fun `as`(alias: String): RentalPath = RentalPath(DSL.name(alias), this)
        override fun `as`(alias: Name): RentalPath = RentalPath(alias, this)
        override fun `as`(alias: Table<*>): RentalPath = RentalPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else JSakila.SAKILA
    override fun getIndexes(): List<Index> = listOf(RENTAL_IDX_FK_CUSTOMER_ID, RENTAL_IDX_FK_INVENTORY_ID, RENTAL_IDX_FK_STAFF_ID)
    override fun getIdentity(): Identity<RentalRecord, Int?> = super.getIdentity() as Identity<RentalRecord, Int?>
    override fun getPrimaryKey(): UniqueKey<RentalRecord> = KEY_RENTAL_PRIMARY
    override fun getUniqueKeys(): List<UniqueKey<RentalRecord>> = listOf(KEY_RENTAL_RENTAL_DATE)
    override fun getReferences(): List<ForeignKey<RentalRecord, *>> = listOf(FK_RENTAL_INVENTORY, FK_RENTAL_CUSTOMER, FK_RENTAL_STAFF)

    private lateinit var _inventory: InventoryPath

    /**
     * Get the implicit join path to the <code>sakila.inventory</code> table.
     */
    fun inventory(): InventoryPath {
        if (!this::_inventory.isInitialized)
            _inventory = InventoryPath(this, FK_RENTAL_INVENTORY, null)

        return _inventory;
    }

    val inventory: InventoryPath
        get(): InventoryPath = inventory()

    private lateinit var _customer: CustomerPath

    /**
     * Get the implicit join path to the <code>sakila.customer</code> table.
     */
    fun customer(): CustomerPath {
        if (!this::_customer.isInitialized)
            _customer = CustomerPath(this, FK_RENTAL_CUSTOMER, null)

        return _customer;
    }

    val customer: CustomerPath
        get(): CustomerPath = customer()

    private lateinit var _staff: StaffPath

    /**
     * Get the implicit join path to the <code>sakila.staff</code> table.
     */
    fun staff(): StaffPath {
        if (!this::_staff.isInitialized)
            _staff = StaffPath(this, FK_RENTAL_STAFF, null)

        return _staff;
    }

    val staff: StaffPath
        get(): StaffPath = staff()

    private lateinit var _payment: PaymentPath

    /**
     * Get the implicit to-many join path to the <code>sakila.payment</code>
     * table
     */
    fun payment(): PaymentPath {
        if (!this::_payment.isInitialized)
            _payment = PaymentPath(this, null, FK_PAYMENT_RENTAL.inverseKey)

        return _payment;
    }

    val payment: PaymentPath
        get(): PaymentPath = payment()
    override fun `as`(alias: String): JRental = JRental(DSL.name(alias), this)
    override fun `as`(alias: Name): JRental = JRental(alias, this)
    override fun `as`(alias: Table<*>): JRental = JRental(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): JRental = JRental(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): JRental = JRental(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): JRental = JRental(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition): JRental = JRental(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): JRental = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition): JRental = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>): JRental = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): JRental = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): JRental = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): JRental = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): JRental = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): JRental = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): JRental = where(DSL.notExists(select))
}
