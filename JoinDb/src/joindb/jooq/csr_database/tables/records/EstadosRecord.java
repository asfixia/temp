/*
 * This file is generated by jOOQ.
 */
package joindb.jooq.csr_database.tables.records;


import javax.annotation.Generated;

import joindb.jooq.csr_database.tables.Estados;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.postgis.Geometry;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EstadosRecord extends UpdatableRecordImpl<EstadosRecord> implements Record5<Integer, Geometry, String, String, Integer> {

    private static final long serialVersionUID = -951204908;

    /**
     * Setter for <code>csr_database.estados.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>csr_database.estados.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>csr_database.estados.geom</code>.
     */
    public void setGeom(Geometry value) {
        set(1, value);
    }

    /**
     * Getter for <code>csr_database.estados.geom</code>.
     */
    public Geometry getGeom() {
        return (Geometry) get(1);
    }

    /**
     * Setter for <code>csr_database.estados.nome</code>.
     */
    public void setNome(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>csr_database.estados.nome</code>.
     */
    public String getNome() {
        return (String) get(2);
    }

    /**
     * Setter for <code>csr_database.estados.sigla</code>.
     */
    public void setSigla(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>csr_database.estados.sigla</code>.
     */
    public String getSigla() {
        return (String) get(3);
    }

    /**
     * Setter for <code>csr_database.estados.geocodigo</code>.
     */
    public void setGeocodigo(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>csr_database.estados.geocodigo</code>.
     */
    public Integer getGeocodigo() {
        return (Integer) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Geometry, String, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Geometry, String, String, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Estados.ESTADOS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Geometry> field2() {
        return Estados.ESTADOS.GEOM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Estados.ESTADOS.NOME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Estados.ESTADOS.SIGLA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Estados.ESTADOS.GEOCODIGO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Geometry component2() {
        return getGeom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getNome();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSigla();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getGeocodigo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Geometry value2() {
        return getGeom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getNome();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSigla();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getGeocodigo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EstadosRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EstadosRecord value2(Geometry value) {
        setGeom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EstadosRecord value3(String value) {
        setNome(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EstadosRecord value4(String value) {
        setSigla(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EstadosRecord value5(Integer value) {
        setGeocodigo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EstadosRecord values(Integer value1, Geometry value2, String value3, String value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EstadosRecord
     */
    public EstadosRecord() {
        super(Estados.ESTADOS);
    }

    /**
     * Create a detached, initialised EstadosRecord
     */
    public EstadosRecord(Integer id, Geometry geom, String nome, String sigla, Integer geocodigo) {
        super(Estados.ESTADOS);

        set(0, id);
        set(1, geom);
        set(2, nome);
        set(3, sigla);
        set(4, geocodigo);
    }
}
