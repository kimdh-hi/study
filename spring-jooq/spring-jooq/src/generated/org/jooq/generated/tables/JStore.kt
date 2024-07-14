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
import org.jooq.generated.indexes.STORE_IDX_FK_ADDRESS_ID
import org.jooq.generated.keys.FK_CUSTOMER_STORE
import org.jooq.generated.keys.FK_INVENTORY_STORE
import org.jooq.generated.keys.FK_STORE_ADDRESS
import org.jooq.generated.keys.FK_STORE_STAFF
import org.jooq.generated.keys.KEY_STORE_IDX_UNIQUE_MANAGER
import org.jooq.generated.keys.KEY_STORE_PRIMARY
import org.jooq.generated.tables.JAddress.AddressPath
import org.jooq.generated.tables.JCustomer.CustomerPath
import org.jooq.generated.tables.JInventory.InventoryPath
import org.jooq.generated.tables.JStaff.StaffPath
import org.jooq.generated.tables.records.StoreRecord
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
open class JStore(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, StoreRecord>?,
    parentPath: InverseForeignKey<out Record, StoreRecord>?,
    aliased: Table<StoreRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<StoreRecord>(
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
         * The reference instance of <code>sakila.store</code>
         */
        val STORE: JStore = JStore()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<StoreRecord> = StoreRecord::class.java

    /**
     * The column <code>sakila.store.store_id</code>.
     */
    val STORE_ID: TableField<StoreRecord, Long?> = createField(DSL.name("store_id"), SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "", AutoConverter<UInteger, Long>(UInteger::class.java, Long::class.java))

    /**
     * The column <code>sakila.store.manager_staff_id</code>.
     */
    val MANAGER_STAFF_ID: TableField<StoreRecord, Long?> = createField(DSL.name("manager_staff_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "", AutoConverter<UInteger, Long>(UInteger::class.java, Long::class.java))

    /**
     * The column <code>sakila.store.address_id</code>.
     */
    val ADDRESS_ID: TableField<StoreRecord, Long?> = createField(DSL.name("address_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "", AutoConverter<UInteger, Long>(UInteger::class.java, Long::class.java))

    /**
     * The column <code>sakila.store.last_update</code>.
     */
    val LAST_UPDATE: TableField<StoreRecord, LocalDateTime?> = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "")

    private constructor(alias: Name, aliased: Table<StoreRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<StoreRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<StoreRecord>?, where: Condition): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>sakila.store</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sakila.store</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sakila.store</code> table reference
     */
    constructor(): this(DSL.name("store"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, StoreRecord>?, parentPath: InverseForeignKey<out Record, StoreRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, STORE, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class StorePath : JStore, Path<StoreRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, StoreRecord>?, parentPath: InverseForeignKey<out Record, StoreRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<StoreRecord>): super(alias, aliased)
        override fun `as`(alias: String): StorePath = StorePath(DSL.name(alias), this)
        override fun `as`(alias: Name): StorePath = StorePath(alias, this)
        override fun `as`(alias: Table<*>): StorePath = StorePath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else JSakila.SAKILA
    override fun getIndexes(): List<Index> = listOf(STORE_IDX_FK_ADDRESS_ID)
    override fun getIdentity(): Identity<StoreRecord, Long?> = super.getIdentity() as Identity<StoreRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<StoreRecord> = KEY_STORE_PRIMARY
    override fun getUniqueKeys(): List<UniqueKey<StoreRecord>> = listOf(KEY_STORE_IDX_UNIQUE_MANAGER)
    override fun getReferences(): List<ForeignKey<StoreRecord, *>> = listOf(FK_STORE_STAFF, FK_STORE_ADDRESS)

    private lateinit var _staff: StaffPath

    /**
     * Get the implicit join path to the <code>sakila.staff</code> table.
     */
    fun staff(): StaffPath {
        if (!this::_staff.isInitialized)
            _staff = StaffPath(this, FK_STORE_STAFF, null)

        return _staff;
    }

    val staff: StaffPath
        get(): StaffPath = staff()

    private lateinit var _address: AddressPath

    /**
     * Get the implicit join path to the <code>sakila.address</code> table.
     */
    fun address(): AddressPath {
        if (!this::_address.isInitialized)
            _address = AddressPath(this, FK_STORE_ADDRESS, null)

        return _address;
    }

    val address: AddressPath
        get(): AddressPath = address()

    private lateinit var _customer: CustomerPath

    /**
     * Get the implicit to-many join path to the <code>sakila.customer</code>
     * table
     */
    fun customer(): CustomerPath {
        if (!this::_customer.isInitialized)
            _customer = CustomerPath(this, null, FK_CUSTOMER_STORE.inverseKey)

        return _customer;
    }

    val customer: CustomerPath
        get(): CustomerPath = customer()

    private lateinit var _inventory: InventoryPath

    /**
     * Get the implicit to-many join path to the <code>sakila.inventory</code>
     * table
     */
    fun inventory(): InventoryPath {
        if (!this::_inventory.isInitialized)
            _inventory = InventoryPath(this, null, FK_INVENTORY_STORE.inverseKey)

        return _inventory;
    }

    val inventory: InventoryPath
        get(): InventoryPath = inventory()
    override fun `as`(alias: String): JStore = JStore(DSL.name(alias), this)
    override fun `as`(alias: Name): JStore = JStore(alias, this)
    override fun `as`(alias: Table<*>): JStore = JStore(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): JStore = JStore(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): JStore = JStore(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): JStore = JStore(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition): JStore = JStore(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): JStore = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition): JStore = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>): JStore = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): JStore = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): JStore = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): JStore = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): JStore = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): JStore = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): JStore = where(DSL.notExists(select))
}