/*
 * This file is generated by jOOQ.
 */
package joindb.jooq.proposta.tables.records;


import java.sql.Date;

import javax.annotation.Generated;

import joindb.jooq.proposta.tables.GuiaTransitoAnimal;

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
public class GuiaTransitoAnimalRecord extends UpdatableRecordImpl<GuiaTransitoAnimalRecord> {

    private static final long serialVersionUID = -1112233277;

    /**
     * Setter for <code>proposta.guia_transito_animal.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.municipio_destino</code>.
     */
    public void setMunicipioDestino(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.municipio_destino</code>.
     */
    public Integer getMunicipioDestino() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.municipio_fonte</code>.
     */
    public void setMunicipioFonte(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.municipio_fonte</code>.
     */
    public Integer getMunicipioFonte() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.propriedade_fonte_id</code>.
     */
    public void setPropriedadeFonteId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.propriedade_fonte_id</code>.
     */
    public Integer getPropriedadeFonteId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.propriedade_destino_id</code>.
     */
    public void setPropriedadeDestinoId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.propriedade_destino_id</code>.
     */
    public Integer getPropriedadeDestinoId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.estado_fonte</code>.
     */
    public void setEstadoFonte(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.estado_fonte</code>.
     */
    public Integer getEstadoFonte() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.estado_destino</code>.
     */
    public void setEstadoDestino(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.estado_destino</code>.
     */
    public Integer getEstadoDestino() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.transporte_id</code>.
     */
    public void setTransporteId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.transporte_id</code>.
     */
    public String getTransporteId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.especie_tipo</code>.
     */
    public void setEspecieTipo(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.especie_tipo</code>.
     */
    public String getEspecieTipo() {
        return (String) get(8);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.transporte_motivo</code>.
     */
    public void setTransporteMotivo(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.transporte_motivo</code>.
     */
    public String getTransporteMotivo() {
        return (String) get(9);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.meio_transporte</code>.
     */
    public void setMeioTransporte(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.meio_transporte</code>.
     */
    public String getMeioTransporte() {
        return (String) get(10);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.data_emitida</code>.
     */
    public void setDataEmitida(Date value) {
        set(11, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.data_emitida</code>.
     */
    public Date getDataEmitida() {
        return (Date) get(11);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.vacina_aftosa_primeira</code>.
     */
    public void setVacinaAftosaPrimeira(Date value) {
        set(12, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.vacina_aftosa_primeira</code>.
     */
    public Date getVacinaAftosaPrimeira() {
        return (Date) get(12);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.vacina_aftosa_segunda</code>.
     */
    public void setVacinaAftosaSegunda(Date value) {
        set(13, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.vacina_aftosa_segunda</code>.
     */
    public Date getVacinaAftosaSegunda() {
        return (Date) get(13);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.vacina_bucellosis</code>.
     */
    public void setVacinaBucellosis(Date value) {
        set(14, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.vacina_bucellosis</code>.
     */
    public Date getVacinaBucellosis() {
        return (Date) get(14);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.vacina_merek</code>.
     */
    public void setVacinaMerek(Date value) {
        set(15, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.vacina_merek</code>.
     */
    public Date getVacinaMerek() {
        return (Date) get(15);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.emissor_id</code>.
     */
    public void setEmissorId(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.emissor_id</code>.
     */
    public String getEmissorId() {
        return (String) get(16);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.emissao_tipo</code>.
     */
    public void setEmissaoTipo(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.emissao_tipo</code>.
     */
    public String getEmissaoTipo() {
        return (String) get(17);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.valido_ate</code>.
     */
    public void setValidoAte(Date value) {
        set(18, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.valido_ate</code>.
     */
    public Date getValidoAte() {
        return (Date) get(18);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.situacao</code>. Situação do GTA: BAIXADA
     */
    public void setSituacao(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.situacao</code>. Situação do GTA: BAIXADA
     */
    public String getSituacao() {
        return (String) get(19);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.femea_6</code>.
     */
    public void setFemea_6(Integer value) {
        set(20, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.femea_6</code>.
     */
    public Integer getFemea_6() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.femea_12</code>.
     */
    public void setFemea_12(Integer value) {
        set(21, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.femea_12</code>.
     */
    public Integer getFemea_12() {
        return (Integer) get(21);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.femea_24</code>.
     */
    public void setFemea_24(Integer value) {
        set(22, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.femea_24</code>.
     */
    public Integer getFemea_24() {
        return (Integer) get(22);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.femea_36</code>.
     */
    public void setFemea_36(Integer value) {
        set(23, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.femea_36</code>.
     */
    public Integer getFemea_36() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.femea_mais</code>.
     */
    public void setFemeaMais(Integer value) {
        set(24, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.femea_mais</code>.
     */
    public Integer getFemeaMais() {
        return (Integer) get(24);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.macho_6</code>.
     */
    public void setMacho_6(Integer value) {
        set(25, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.macho_6</code>.
     */
    public Integer getMacho_6() {
        return (Integer) get(25);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.macho_12</code>.
     */
    public void setMacho_12(Integer value) {
        set(26, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.macho_12</code>.
     */
    public Integer getMacho_12() {
        return (Integer) get(26);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.macho_24</code>.
     */
    public void setMacho_24(Integer value) {
        set(27, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.macho_24</code>.
     */
    public Integer getMacho_24() {
        return (Integer) get(27);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.macho_36</code>.
     */
    public void setMacho_36(Integer value) {
        set(28, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.macho_36</code>.
     */
    public Integer getMacho_36() {
        return (Integer) get(28);
    }

    /**
     * Setter for <code>proposta.guia_transito_animal.macho_mais</code>.
     */
    public void setMachoMais(Integer value) {
        set(29, value);
    }

    /**
     * Getter for <code>proposta.guia_transito_animal.macho_mais</code>.
     */
    public Integer getMachoMais() {
        return (Integer) get(29);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GuiaTransitoAnimalRecord
     */
    public GuiaTransitoAnimalRecord() {
        super(GuiaTransitoAnimal.GUIA_TRANSITO_ANIMAL);
    }

    /**
     * Create a detached, initialised GuiaTransitoAnimalRecord
     */
    public GuiaTransitoAnimalRecord(Long id, Integer municipioDestino, Integer municipioFonte, Integer propriedadeFonteId, Integer propriedadeDestinoId, Integer estadoFonte, Integer estadoDestino, String transporteId, String especieTipo, String transporteMotivo, String meioTransporte, Date dataEmitida, Date vacinaAftosaPrimeira, Date vacinaAftosaSegunda, Date vacinaBucellosis, Date vacinaMerek, String emissorId, String emissaoTipo, Date validoAte, String situacao, Integer femea_6, Integer femea_12, Integer femea_24, Integer femea_36, Integer femeaMais, Integer macho_6, Integer macho_12, Integer macho_24, Integer macho_36, Integer machoMais) {
        super(GuiaTransitoAnimal.GUIA_TRANSITO_ANIMAL);

        set(0, id);
        set(1, municipioDestino);
        set(2, municipioFonte);
        set(3, propriedadeFonteId);
        set(4, propriedadeDestinoId);
        set(5, estadoFonte);
        set(6, estadoDestino);
        set(7, transporteId);
        set(8, especieTipo);
        set(9, transporteMotivo);
        set(10, meioTransporte);
        set(11, dataEmitida);
        set(12, vacinaAftosaPrimeira);
        set(13, vacinaAftosaSegunda);
        set(14, vacinaBucellosis);
        set(15, vacinaMerek);
        set(16, emissorId);
        set(17, emissaoTipo);
        set(18, validoAte);
        set(19, situacao);
        set(20, femea_6);
        set(21, femea_12);
        set(22, femea_24);
        set(23, femea_36);
        set(24, femeaMais);
        set(25, macho_6);
        set(26, macho_12);
        set(27, macho_24);
        set(28, macho_36);
        set(29, machoMais);
    }
}
