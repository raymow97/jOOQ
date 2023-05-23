/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.chart.db.tables.records;


import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.example.chart.db.tables.Language;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LanguageRecord extends UpdatableRecordImpl<LanguageRecord> implements Record3<Integer, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.language.language_id</code>.
     */
    public void setLanguageId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.language.language_id</code>.
     */
    public Integer getLanguageId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.language.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.language.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.language.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.language.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, LocalDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, LocalDateTime> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Language.LANGUAGE.LANGUAGE_ID;
    }

    @Override
    public Field<String> field2() {
        return Language.LANGUAGE.NAME;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Language.LANGUAGE.LAST_UPDATE;
    }

    @Override
    public Integer component1() {
        return getLanguageId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public LocalDateTime component3() {
        return getLastUpdate();
    }

    @Override
    public Integer value1() {
        return getLanguageId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public LocalDateTime value3() {
        return getLastUpdate();
    }

    @Override
    public LanguageRecord value1(Integer value) {
        setLanguageId(value);
        return this;
    }

    @Override
    public LanguageRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public LanguageRecord value3(LocalDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public LanguageRecord values(Integer value1, String value2, LocalDateTime value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LanguageRecord
     */
    public LanguageRecord() {
        super(Language.LANGUAGE);
    }

    /**
     * Create a detached, initialised LanguageRecord
     */
    public LanguageRecord(Integer languageId, String name, LocalDateTime lastUpdate) {
        super(Language.LANGUAGE);

        setLanguageId(languageId);
        setName(name);
        setLastUpdate(lastUpdate);
        resetChangedOnNotNull();
    }
}
