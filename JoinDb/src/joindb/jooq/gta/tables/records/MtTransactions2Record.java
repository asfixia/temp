/*
 * This file is generated by jOOQ.
 */
package joindb.jooq.gta.tables.records;


import java.math.BigDecimal;
import java.sql.Date;

import javax.annotation.Generated;

import joindb.jooq.gta.tables.MtTransactions2;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


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
public class MtTransactions2Record extends UpdatableRecordImpl<MtTransactions2Record> {

    private static final long serialVersionUID = -427036773;

    /**
     * Setter for <code>gta.mt_transactions2.scrapeid</code>.
     */
    public void setScrapeid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.scrapeid</code>.
     */
    public Integer getScrapeid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>gta.mt_transactions2.sr_docto</code>.
     */
    public void setSrDocto(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.sr_docto</code>.
     */
    public String getSrDocto() {
        return (String) get(1);
    }

    /**
     * Setter for <code>gta.mt_transactions2.nr_docto</code>.
     */
    public void setNrDocto(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.nr_docto</code>.
     */
    public Integer getNrDocto() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>gta.mt_transactions2.nm_especie</code>.
     */
    public void setNmEspecie(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.nm_especie</code>.
     */
    public String getNmEspecie() {
        return (String) get(3);
    }

    /**
     * Setter for <code>gta.mt_transactions2.faixa_sexo_quant</code>.
     */
    public void setFaixaSexoQuant(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.faixa_sexo_quant</code>.
     */
    public String getFaixaSexoQuant() {
        return (String) get(4);
    }

    /**
     * Setter for <code>gta.mt_transactions2.quant_animais</code>.
     */
    public void setQuantAnimais(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.quant_animais</code>.
     */
    public Integer getQuantAnimais() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>gta.mt_transactions2.cpf_cnpj_origem</code>.
     */
    public void setCpfCnpjOrigem(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.cpf_cnpj_origem</code>.
     */
    public BigDecimal getCpfCnpjOrigem() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>gta.mt_transactions2.proprietario_origem</code>.
     */
    public void setProprietarioOrigem(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.proprietario_origem</code>.
     */
    public String getProprietarioOrigem() {
        return (String) get(7);
    }

    /**
     * Setter for <code>gta.mt_transactions2.fazenda_origem</code>.
     */
    public void setFazendaOrigem(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.fazenda_origem</code>.
     */
    public String getFazendaOrigem() {
        return (String) get(8);
    }

    /**
     * Setter for <code>gta.mt_transactions2.n_propriedade</code>.
     */
    public void setNPropriedade(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.n_propriedade</code>.
     */
    public BigDecimal getNPropriedade() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>gta.mt_transactions2.municipio_de_origem</code>.
     */
    public void setMunicipioDeOrigem(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.municipio_de_origem</code>.
     */
    public String getMunicipioDeOrigem() {
        return (String) get(10);
    }

    /**
     * Setter for <code>gta.mt_transactions2.uf_origem</code>.
     */
    public void setUfOrigem(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.uf_origem</code>.
     */
    public String getUfOrigem() {
        return (String) get(11);
    }

    /**
     * Setter for <code>gta.mt_transactions2.nr_docdest</code>.
     */
    public void setNrDocdest(BigDecimal value) {
        set(12, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.nr_docdest</code>.
     */
    public BigDecimal getNrDocdest() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>gta.mt_transactions2.nm_proprd</code>.
     */
    public void setNmProprd(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.nm_proprd</code>.
     */
    public String getNmProprd() {
        return (String) get(13);
    }

    /**
     * Setter for <code>gta.mt_transactions2.nm_prodes</code>.
     */
    public void setNmProdes(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.nm_prodes</code>.
     */
    public String getNmProdes() {
        return (String) get(14);
    }

    /**
     * Setter for <code>gta.mt_transactions2.nr_proprd</code>.
     */
    public void setNrProprd(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.nr_proprd</code>.
     */
    public String getNrProprd() {
        return (String) get(15);
    }

    /**
     * Setter for <code>gta.mt_transactions2.municipio_destino</code>.
     */
    public void setMunicipioDestino(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.municipio_destino</code>.
     */
    public String getMunicipioDestino() {
        return (String) get(16);
    }

    /**
     * Setter for <code>gta.mt_transactions2.uf_destino</code>.
     */
    public void setUfDestino(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.uf_destino</code>.
     */
    public String getUfDestino() {
        return (String) get(17);
    }

    /**
     * Setter for <code>gta.mt_transactions2.dc_final</code>.
     */
    public void setDcFinal(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.dc_final</code>.
     */
    public String getDcFinal() {
        return (String) get(18);
    }

    /**
     * Setter for <code>gta.mt_transactions2.id_meiotr</code>.
     */
    public void setIdMeiotr(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.id_meiotr</code>.
     */
    public String getIdMeiotr() {
        return (String) get(19);
    }

    /**
     * Setter for <code>gta.mt_transactions2.dt_aft01</code>.
     */
    public void setDtAft01(Date value) {
        set(20, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.dt_aft01</code>.
     */
    public Date getDtAft01() {
        return (Date) get(20);
    }

    /**
     * Setter for <code>gta.mt_transactions2.dt_aft02</code>.
     */
    public void setDtAft02(Date value) {
        set(21, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.dt_aft02</code>.
     */
    public Date getDtAft02() {
        return (Date) get(21);
    }

    /**
     * Setter for <code>gta.mt_transactions2.dt_brucel</code>.
     */
    public void setDtBrucel(Date value) {
        set(22, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.dt_brucel</code>.
     */
    public Date getDtBrucel() {
        return (Date) get(22);
    }

    /**
     * Setter for <code>gta.mt_transactions2.dt_vacmar</code>.
     */
    public void setDtVacmar(Date value) {
        set(23, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.dt_vacmar</code>.
     */
    public Date getDtVacmar() {
        return (Date) get(23);
    }

    /**
     * Setter for <code>gta.mt_transactions2.atestado_de_exames</code>.
     */
    public void setAtestadoDeExames(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.atestado_de_exames</code>.
     */
    public String getAtestadoDeExames() {
        return (String) get(24);
    }

    /**
     * Setter for <code>gta.mt_transactions2.observacoes</code>.
     */
    public void setObservacoes(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.observacoes</code>.
     */
    public String getObservacoes() {
        return (String) get(25);
    }

    /**
     * Setter for <code>gta.mt_transactions2.emitente</code>.
     */
    public void setEmitente(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.emitente</code>.
     */
    public String getEmitente() {
        return (String) get(26);
    }

    /**
     * Setter for <code>gta.mt_transactions2.area_de_atuacao</code>.
     */
    public void setAreaDeAtuacao(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.area_de_atuacao</code>.
     */
    public String getAreaDeAtuacao() {
        return (String) get(27);
    }

    /**
     * Setter for <code>gta.mt_transactions2.dt_emissao</code>.
     */
    public void setDtEmissao(Date value) {
        set(28, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.dt_emissao</code>.
     */
    public Date getDtEmissao() {
        return (Date) get(28);
    }

    /**
     * Setter for <code>gta.mt_transactions2.dt_valid</code>.
     */
    public void setDtValid(Date value) {
        set(29, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.dt_valid</code>.
     */
    public Date getDtValid() {
        return (Date) get(29);
    }

    /**
     * Setter for <code>gta.mt_transactions2.fone</code>.
     */
    public void setFone(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.fone</code>.
     */
    public String getFone() {
        return (String) get(30);
    }

    /**
     * Setter for <code>gta.mt_transactions2.nr_mtfunc</code>.
     */
    public void setNrMtfunc(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.nr_mtfunc</code>.
     */
    public String getNrMtfunc() {
        return (String) get(31);
    }

    /**
     * Setter for <code>gta.mt_transactions2.nm_usuario</code>.
     */
    public void setNmUsuario(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.nm_usuario</code>.
     */
    public String getNmUsuario() {
        return (String) get(32);
    }

    /**
     * Setter for <code>gta.mt_transactions2.unidade_expedidora</code>.
     */
    public void setUnidadeExpedidora(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.unidade_expedidora</code>.
     */
    public String getUnidadeExpedidora() {
        return (String) get(33);
    }

    /**
     * Setter for <code>gta.mt_transactions2.unidade_expedidora_municipio</code>.
     */
    public void setUnidadeExpedidoraMunicipio(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.unidade_expedidora_municipio</code>.
     */
    public String getUnidadeExpedidoraMunicipio() {
        return (String) get(34);
    }

    /**
     * Setter for <code>gta.mt_transactions2.nr_dar</code>.
     */
    public void setNrDar(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.nr_dar</code>.
     */
    public String getNrDar() {
        return (String) get(35);
    }

    /**
     * Setter for <code>gta.mt_transactions2.vl_dar</code>.
     */
    public void setVlDar(String value) {
        set(36, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.vl_dar</code>.
     */
    public String getVlDar() {
        return (String) get(36);
    }

    /**
     * Setter for <code>gta.mt_transactions2.nr_guia</code>.
     */
    public void setNrGuia(String value) {
        set(37, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.nr_guia</code>.
     */
    public String getNrGuia() {
        return (String) get(37);
    }

    /**
     * Setter for <code>gta.mt_transactions2.vl_correto</code>.
     */
    public void setVlCorreto(String value) {
        set(38, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.vl_correto</code>.
     */
    public String getVlCorreto() {
        return (String) get(38);
    }

    /**
     * Setter for <code>gta.mt_transactions2.path_id</code>.
     */
    public void setPathId(Short value) {
        set(39, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.path_id</code>.
     */
    public Short getPathId() {
        return (Short) get(39);
    }

    /**
     * Setter for <code>gta.mt_transactions2.fileid</code>.
     */
    public void setFileid(Short value) {
        set(40, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.fileid</code>.
     */
    public Short getFileid() {
        return (Short) get(40);
    }

    /**
     * Setter for <code>gta.mt_transactions2.id</code>.
     */
    public void setId(BigDecimal value) {
        set(41, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(41);
    }

    /**
     * Setter for <code>gta.mt_transactions2.situacao</code>.
     */
    public void setSituacao(String value) {
        set(42, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.situacao</code>.
     */
    public String getSituacao() {
        return (String) get(42);
    }

    /**
     * Setter for <code>gta.mt_transactions2.sellergroupid</code>.
     */
    public void setSellergroupid(BigDecimal value) {
        set(43, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.sellergroupid</code>.
     */
    public BigDecimal getSellergroupid() {
        return (BigDecimal) get(43);
    }

    /**
     * Setter for <code>gta.mt_transactions2.buyergroupid</code>.
     */
    public void setBuyergroupid(BigDecimal value) {
        set(44, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.buyergroupid</code>.
     */
    public BigDecimal getBuyergroupid() {
        return (BigDecimal) get(44);
    }

    /**
     * Setter for <code>gta.mt_transactions2.sellercar</code>.
     */
    public void setSellercar(String value) {
        set(45, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.sellercar</code>.
     */
    public String getSellercar() {
        return (String) get(45);
    }

    /**
     * Setter for <code>gta.mt_transactions2.buyercar</code>.
     */
    public void setBuyercar(String value) {
        set(46, value);
    }

    /**
     * Getter for <code>gta.mt_transactions2.buyercar</code>.
     */
    public String getBuyercar() {
        return (String) get(46);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MtTransactions2Record
     */
    public MtTransactions2Record() {
        super(MtTransactions2.MT_TRANSACTIONS2);
    }

    /**
     * Create a detached, initialised MtTransactions2Record
     */
    public MtTransactions2Record(Integer scrapeid, String srDocto, Integer nrDocto, String nmEspecie, String faixaSexoQuant, Integer quantAnimais, BigDecimal cpfCnpjOrigem, String proprietarioOrigem, String fazendaOrigem, BigDecimal nPropriedade, String municipioDeOrigem, String ufOrigem, BigDecimal nrDocdest, String nmProprd, String nmProdes, String nrProprd, String municipioDestino, String ufDestino, String dcFinal, String idMeiotr, Date dtAft01, Date dtAft02, Date dtBrucel, Date dtVacmar, String atestadoDeExames, String observacoes, String emitente, String areaDeAtuacao, Date dtEmissao, Date dtValid, String fone, String nrMtfunc, String nmUsuario, String unidadeExpedidora, String unidadeExpedidoraMunicipio, String nrDar, String vlDar, String nrGuia, String vlCorreto, Short pathId, Short fileid, BigDecimal id, String situacao, BigDecimal sellergroupid, BigDecimal buyergroupid, String sellercar, String buyercar) {
        super(MtTransactions2.MT_TRANSACTIONS2);

        set(0, scrapeid);
        set(1, srDocto);
        set(2, nrDocto);
        set(3, nmEspecie);
        set(4, faixaSexoQuant);
        set(5, quantAnimais);
        set(6, cpfCnpjOrigem);
        set(7, proprietarioOrigem);
        set(8, fazendaOrigem);
        set(9, nPropriedade);
        set(10, municipioDeOrigem);
        set(11, ufOrigem);
        set(12, nrDocdest);
        set(13, nmProprd);
        set(14, nmProdes);
        set(15, nrProprd);
        set(16, municipioDestino);
        set(17, ufDestino);
        set(18, dcFinal);
        set(19, idMeiotr);
        set(20, dtAft01);
        set(21, dtAft02);
        set(22, dtBrucel);
        set(23, dtVacmar);
        set(24, atestadoDeExames);
        set(25, observacoes);
        set(26, emitente);
        set(27, areaDeAtuacao);
        set(28, dtEmissao);
        set(29, dtValid);
        set(30, fone);
        set(31, nrMtfunc);
        set(32, nmUsuario);
        set(33, unidadeExpedidora);
        set(34, unidadeExpedidoraMunicipio);
        set(35, nrDar);
        set(36, vlDar);
        set(37, nrGuia);
        set(38, vlCorreto);
        set(39, pathId);
        set(40, fileid);
        set(41, id);
        set(42, situacao);
        set(43, sellergroupid);
        set(44, buyergroupid);
        set(45, sellercar);
        set(46, buyercar);
    }
}