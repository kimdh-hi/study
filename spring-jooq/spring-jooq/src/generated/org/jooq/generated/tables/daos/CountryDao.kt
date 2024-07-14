/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.daos


import java.time.LocalDateTime

import kotlin.collections.List

import org.jooq.Configuration
import org.jooq.generated.tables.JCountry
import org.jooq.generated.tables.pojos.Country
import org.jooq.generated.tables.records.CountryRecord
import org.jooq.impl.AutoConverter
import org.jooq.impl.DAOImpl
import org.jooq.types.UInteger


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CountryDao(configuration: Configuration?) : DAOImpl<CountryRecord, Country, Long>(JCountry.COUNTRY, Country::class.java, configuration) {

    /**
     * Create a new CountryDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: Country): Long? = o.countryId

    /**
     * Fetch records that have <code>country_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfJCountryId(lowerInclusive: Long?, upperInclusive: Long?): List<Country> = fetchRange(JCountry.COUNTRY.COUNTRY_ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>country_id IN (values)</code>
     */
    fun fetchByJCountryId(vararg values: Long): List<Country> = fetch(JCountry.COUNTRY.COUNTRY_ID, *values.toTypedArray())

    /**
     * Fetch a unique record that has <code>country_id = value</code>
     */
    fun fetchOneByJCountryId(value: Long): Country? = fetchOne(JCountry.COUNTRY.COUNTRY_ID, value)

    /**
     * Fetch records that have <code>country BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfJCountry(lowerInclusive: String?, upperInclusive: String?): List<Country> = fetchRange(JCountry.COUNTRY.COUNTRY_, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>country IN (values)</code>
     */
    fun fetchByJCountry(vararg values: String): List<Country> = fetch(JCountry.COUNTRY.COUNTRY_, *values)

    /**
     * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfJLastUpdate(lowerInclusive: LocalDateTime?, upperInclusive: LocalDateTime?): List<Country> = fetchRange(JCountry.COUNTRY.LAST_UPDATE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    fun fetchByJLastUpdate(vararg values: LocalDateTime): List<Country> = fetch(JCountry.COUNTRY.LAST_UPDATE, *values)
}