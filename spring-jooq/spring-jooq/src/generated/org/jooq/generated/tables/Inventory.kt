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
import org.jooq.generated.Sakila
import org.jooq.generated.indexes.INVENTORY_IDX_FK_FILM_ID
import org.jooq.generated.indexes.INVENTORY_IDX_STORE_ID_FILM_ID
import org.jooq.generated.keys.FK_INVENTORY_FILM
import org.jooq.generated.keys.FK_INVENTORY_STORE
import org.jooq.generated.keys.FK_RENTAL_INVENTORY
import org.jooq.generated.keys.KEY_INVENTORY_PRIMARY
import org.jooq.generated.tables.Film.FilmPath
import org.jooq.generated.tables.Rental.RentalPath
import org.jooq.generated.tables.Store.StorePath
import org.jooq.generated.tables.records.InventoryRecord
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl
import org.jooq.types.UInteger


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class Inventory(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, InventoryRecord>?,
    parentPath: InverseForeignKey<out Record, InventoryRecord>?,
    aliased: Table<InventoryRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<InventoryRecord>(
    alias,
    Sakila.SAKILA,
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
         * The reference instance of <code>sakila.inventory</code>
         */
        val INVENTORY: Inventory = Inventory()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<InventoryRecord> = InventoryRecord::class.java

    /**
     * The column <code>sakila.inventory.inventory_id</code>.
     */
    val INVENTORY_ID: TableField<InventoryRecord, UInteger?> = createField(DSL.name("inventory_id"), SQLDataType.INTEGERUNSIGNED.nullable(false).identity(true), this, "")

    /**
     * The column <code>sakila.inventory.film_id</code>.
     */
    val FILM_ID: TableField<InventoryRecord, UInteger?> = createField(DSL.name("film_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sakila.inventory.store_id</code>.
     */
    val STORE_ID: TableField<InventoryRecord, UInteger?> = createField(DSL.name("store_id"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "")

    /**
     * The column <code>sakila.inventory.last_update</code>.
     */
    val LAST_UPDATE: TableField<InventoryRecord, LocalDateTime?> = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(0).nullable(false).defaultValue(DSL.field(DSL.raw("CURRENT_TIMESTAMP"), SQLDataType.LOCALDATETIME)), this, "")

    private constructor(alias: Name, aliased: Table<InventoryRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<InventoryRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<InventoryRecord>?, where: Condition): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>sakila.inventory</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>sakila.inventory</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>sakila.inventory</code> table reference
     */
    constructor(): this(DSL.name("inventory"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, InventoryRecord>?, parentPath: InverseForeignKey<out Record, InventoryRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, INVENTORY, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class InventoryPath : Inventory, Path<InventoryRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, InventoryRecord>?, parentPath: InverseForeignKey<out Record, InventoryRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<InventoryRecord>): super(alias, aliased)
        override fun `as`(alias: String): InventoryPath = InventoryPath(DSL.name(alias), this)
        override fun `as`(alias: Name): InventoryPath = InventoryPath(alias, this)
        override fun `as`(alias: Table<*>): InventoryPath = InventoryPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Sakila.SAKILA
    override fun getIndexes(): List<Index> = listOf(INVENTORY_IDX_FK_FILM_ID, INVENTORY_IDX_STORE_ID_FILM_ID)
    override fun getIdentity(): Identity<InventoryRecord, UInteger?> = super.getIdentity() as Identity<InventoryRecord, UInteger?>
    override fun getPrimaryKey(): UniqueKey<InventoryRecord> = KEY_INVENTORY_PRIMARY
    override fun getReferences(): List<ForeignKey<InventoryRecord, *>> = listOf(FK_INVENTORY_FILM, FK_INVENTORY_STORE)

    private lateinit var _film: FilmPath

    /**
     * Get the implicit join path to the <code>sakila.film</code> table.
     */
    fun film(): FilmPath {
        if (!this::_film.isInitialized)
            _film = FilmPath(this, FK_INVENTORY_FILM, null)

        return _film;
    }

    val film: FilmPath
        get(): FilmPath = film()

    private lateinit var _store: StorePath

    /**
     * Get the implicit join path to the <code>sakila.store</code> table.
     */
    fun store(): StorePath {
        if (!this::_store.isInitialized)
            _store = StorePath(this, FK_INVENTORY_STORE, null)

        return _store;
    }

    val store: StorePath
        get(): StorePath = store()

    private lateinit var _rental: RentalPath

    /**
     * Get the implicit to-many join path to the <code>sakila.rental</code>
     * table
     */
    fun rental(): RentalPath {
        if (!this::_rental.isInitialized)
            _rental = RentalPath(this, null, FK_RENTAL_INVENTORY.inverseKey)

        return _rental;
    }

    val rental: RentalPath
        get(): RentalPath = rental()
    override fun `as`(alias: String): Inventory = Inventory(DSL.name(alias), this)
    override fun `as`(alias: Name): Inventory = Inventory(alias, this)
    override fun `as`(alias: Table<*>): Inventory = Inventory(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): Inventory = Inventory(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): Inventory = Inventory(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): Inventory = Inventory(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition): Inventory = Inventory(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): Inventory = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition): Inventory = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>): Inventory = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): Inventory = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): Inventory = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): Inventory = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): Inventory = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): Inventory = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): Inventory = where(DSL.notExists(select))
}
