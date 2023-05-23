/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.chart.db.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.example.chart.db.tables.FilmNotInStock;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmNotInStockRecord extends TableRecordImpl<FilmNotInStockRecord> implements Record1<Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.film_not_in_stock.p_film_count</code>.
     */
    public void setPFilmCount(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.film_not_in_stock.p_film_count</code>.
     */
    public Integer getPFilmCount() {
        return (Integer) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<Integer> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<Integer> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return FilmNotInStock.FILM_NOT_IN_STOCK.P_FILM_COUNT;
    }

    @Override
    public Integer component1() {
        return getPFilmCount();
    }

    @Override
    public Integer value1() {
        return getPFilmCount();
    }

    @Override
    public FilmNotInStockRecord value1(Integer value) {
        setPFilmCount(value);
        return this;
    }

    @Override
    public FilmNotInStockRecord values(Integer value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmNotInStockRecord
     */
    public FilmNotInStockRecord() {
        super(FilmNotInStock.FILM_NOT_IN_STOCK);
    }

    /**
     * Create a detached, initialised FilmNotInStockRecord
     */
    public FilmNotInStockRecord(Integer pFilmCount) {
        super(FilmNotInStock.FILM_NOT_IN_STOCK);

        setPFilmCount(pFilmCount);
        resetChangedOnNotNull();
    }
}
