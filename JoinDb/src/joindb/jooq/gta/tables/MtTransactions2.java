/*
 * This file is generated by jOOQ.
 */
package joindb.jooq.gta.tables;


import java.math.BigDecimal;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import joindb.jooq.gta.Gta;
import joindb.jooq.gta.Indexes;
import joindb.jooq.gta.Keys;
import joindb.jooq.gta.tables.records.MtTransactions2Record;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class MtTransactions2 extends TableImpl<MtTransactions2Record> {

    private static final long serialVersionUID = 533423237;

    /**
     * The reference instance of <code>gta.mt_transactions2</code>
     */
    public static final MtTransactions2 MT_TRANSACTIONS2 = new MtTransactions2();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MtTransactions2Record> getRecordType() {
        return MtTransactions2Record.class;
    }

    /**
     * The column <code>gta.mt_transactions2.scrapeid</code>.
     */
    public final TableField<MtTransactions2Record, Integer> SCRAPEID = createField("scrapeid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>gta.mt_transactions2.sr_docto</code>.
     */
    public final TableField<MtTransactions2Record, String> SR_DOCTO = createField("sr_docto", org.jooq.impl.SQLDataType.CHAR(1), this, "");

    /**
     * The column <code>gta.mt_transactions2.nr_docto</code>.
     */
    public final TableField<MtTransactions2Record, Integer> NR_DOCTO = createField("nr_docto", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>gta.mt_transactions2.nm_especie</code>.
     */
    public final TableField<MtTransactions2Record, String> NM_ESPECIE = createField("nm_especie", org.jooq.impl.SQLDataType.VARCHAR(80), this, "");

    /**
     * The column <code>gta.mt_transactions2.faixa_sexo_quant</code>.
     */
    public final TableField<MtTransactions2Record, String> FAIXA_SEXO_QUANT = createField("faixa_sexo_quant", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>gta.mt_transactions2.quant_animais</code>.
     */
    public final TableField<MtTransactions2Record, Integer> QUANT_ANIMAIS = createField("quant_animais", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>gta.mt_transactions2.cpf_cnpj_origem</code>.
     */
    public final TableField<MtTransactions2Record, BigDecimal> CPF_CNPJ_ORIGEM = createField("cpf_cnpj_origem", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>gta.mt_transactions2.proprietario_origem</code>.
     */
    public final TableField<MtTransactions2Record, String> PROPRIETARIO_ORIGEM = createField("proprietario_origem", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>gta.mt_transactions2.fazenda_origem</code>.
     */
    public final TableField<MtTransactions2Record, String> FAZENDA_ORIGEM = createField("fazenda_origem", org.jooq.impl.SQLDataType.VARCHAR(80), this, "");

    /**
     * The column <code>gta.mt_transactions2.n_propriedade</code>.
     */
    public final TableField<MtTransactions2Record, BigDecimal> N_PROPRIEDADE = createField("n_propriedade", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>gta.mt_transactions2.municipio_de_origem</code>.
     */
    public final TableField<MtTransactions2Record, String> MUNICIPIO_DE_ORIGEM = createField("municipio_de_origem", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>gta.mt_transactions2.uf_origem</code>.
     */
    public final TableField<MtTransactions2Record, String> UF_ORIGEM = createField("uf_origem", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>gta.mt_transactions2.nr_docdest</code>.
     */
    public final TableField<MtTransactions2Record, BigDecimal> NR_DOCDEST = createField("nr_docdest", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>gta.mt_transactions2.nm_proprd</code>.
     */
    public final TableField<MtTransactions2Record, String> NM_PROPRD = createField("nm_proprd", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>gta.mt_transactions2.nm_prodes</code>.
     */
    public final TableField<MtTransactions2Record, String> NM_PRODES = createField("nm_prodes", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>gta.mt_transactions2.nr_proprd</code>.
     */
    public final TableField<MtTransactions2Record, String> NR_PROPRD = createField("nr_proprd", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>gta.mt_transactions2.municipio_destino</code>.
     */
    public final TableField<MtTransactions2Record, String> MUNICIPIO_DESTINO = createField("municipio_destino", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>gta.mt_transactions2.uf_destino</code>.
     */
    public final TableField<MtTransactions2Record, String> UF_DESTINO = createField("uf_destino", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>gta.mt_transactions2.dc_final</code>.
     */
    public final TableField<MtTransactions2Record, String> DC_FINAL = createField("dc_final", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>gta.mt_transactions2.id_meiotr</code>.
     */
    public final TableField<MtTransactions2Record, String> ID_MEIOTR = createField("id_meiotr", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>gta.mt_transactions2.dt_aft01</code>.
     */
    public final TableField<MtTransactions2Record, Date> DT_AFT01 = createField("dt_aft01", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>gta.mt_transactions2.dt_aft02</code>.
     */
    public final TableField<MtTransactions2Record, Date> DT_AFT02 = createField("dt_aft02", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>gta.mt_transactions2.dt_brucel</code>.
     */
    public final TableField<MtTransactions2Record, Date> DT_BRUCEL = createField("dt_brucel", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>gta.mt_transactions2.dt_vacmar</code>.
     */
    public final TableField<MtTransactions2Record, Date> DT_VACMAR = createField("dt_vacmar", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>gta.mt_transactions2.atestado_de_exames</code>.
     */
    public final TableField<MtTransactions2Record, String> ATESTADO_DE_EXAMES = createField("atestado_de_exames", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>gta.mt_transactions2.observacoes</code>.
     */
    public final TableField<MtTransactions2Record, String> OBSERVACOES = createField("observacoes", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>gta.mt_transactions2.emitente</code>.
     */
    public final TableField<MtTransactions2Record, String> EMITENTE = createField("emitente", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>gta.mt_transactions2.area_de_atuacao</code>.
     */
    public final TableField<MtTransactions2Record, String> AREA_DE_ATUACAO = createField("area_de_atuacao", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>gta.mt_transactions2.dt_emissao</code>.
     */
    public final TableField<MtTransactions2Record, Date> DT_EMISSAO = createField("dt_emissao", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>gta.mt_transactions2.dt_valid</code>.
     */
    public final TableField<MtTransactions2Record, Date> DT_VALID = createField("dt_valid", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>gta.mt_transactions2.fone</code>.
     */
    public final TableField<MtTransactions2Record, String> FONE = createField("fone", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>gta.mt_transactions2.nr_mtfunc</code>.
     */
    public final TableField<MtTransactions2Record, String> NR_MTFUNC = createField("nr_mtfunc", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>gta.mt_transactions2.nm_usuario</code>.
     */
    public final TableField<MtTransactions2Record, String> NM_USUARIO = createField("nm_usuario", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>gta.mt_transactions2.unidade_expedidora</code>.
     */
    public final TableField<MtTransactions2Record, String> UNIDADE_EXPEDIDORA = createField("unidade_expedidora", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>gta.mt_transactions2.unidade_expedidora_municipio</code>.
     */
    public final TableField<MtTransactions2Record, String> UNIDADE_EXPEDIDORA_MUNICIPIO = createField("unidade_expedidora_municipio", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>gta.mt_transactions2.nr_dar</code>.
     */
    public final TableField<MtTransactions2Record, String> NR_DAR = createField("nr_dar", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>gta.mt_transactions2.vl_dar</code>.
     */
    public final TableField<MtTransactions2Record, String> VL_DAR = createField("vl_dar", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>gta.mt_transactions2.nr_guia</code>.
     */
    public final TableField<MtTransactions2Record, String> NR_GUIA = createField("nr_guia", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>gta.mt_transactions2.vl_correto</code>.
     */
    public final TableField<MtTransactions2Record, String> VL_CORRETO = createField("vl_correto", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>gta.mt_transactions2.path_id</code>.
     */
    public final TableField<MtTransactions2Record, Short> PATH_ID = createField("path_id", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>gta.mt_transactions2.fileid</code>.
     */
    public final TableField<MtTransactions2Record, Short> FILEID = createField("fileid", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>gta.mt_transactions2.id</code>.
     */
    public final TableField<MtTransactions2Record, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>gta.mt_transactions2.situacao</code>.
     */
    public final TableField<MtTransactions2Record, String> SITUACAO = createField("situacao", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>gta.mt_transactions2.sellergroupid</code>.
     */
    public final TableField<MtTransactions2Record, BigDecimal> SELLERGROUPID = createField("sellergroupid", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>gta.mt_transactions2.buyergroupid</code>.
     */
    public final TableField<MtTransactions2Record, BigDecimal> BUYERGROUPID = createField("buyergroupid", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>gta.mt_transactions2.sellercar</code>.
     */
    public final TableField<MtTransactions2Record, String> SELLERCAR = createField("sellercar", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>gta.mt_transactions2.buyercar</code>.
     */
    public final TableField<MtTransactions2Record, String> BUYERCAR = createField("buyercar", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * Create a <code>gta.mt_transactions2</code> table reference
     */
    public MtTransactions2() {
        this(DSL.name("mt_transactions2"), null);
    }

    /**
     * Create an aliased <code>gta.mt_transactions2</code> table reference
     */
    public MtTransactions2(String alias) {
        this(DSL.name(alias), MT_TRANSACTIONS2);
    }

    /**
     * Create an aliased <code>gta.mt_transactions2</code> table reference
     */
    public MtTransactions2(Name alias) {
        this(alias, MT_TRANSACTIONS2);
    }

    private MtTransactions2(Name alias, Table<MtTransactions2Record> aliased) {
        this(alias, aliased, null);
    }

    private MtTransactions2(Name alias, Table<MtTransactions2Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MtTransactions2(Table<O> child, ForeignKey<O, MtTransactions2Record> key) {
        super(child, key, MT_TRANSACTIONS2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Gta.GTA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.MT_TRANSACTIONS2_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MtTransactions2Record> getPrimaryKey() {
        return Keys.MT_TRANSACTIONS2_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MtTransactions2Record>> getKeys() {
        return Arrays.<UniqueKey<MtTransactions2Record>>asList(Keys.MT_TRANSACTIONS2_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MtTransactions2 as(String alias) {
        return new MtTransactions2(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MtTransactions2 as(Name alias) {
        return new MtTransactions2(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MtTransactions2 rename(String name) {
        return new MtTransactions2(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MtTransactions2 rename(Name name) {
        return new MtTransactions2(name, null);
    }
}
