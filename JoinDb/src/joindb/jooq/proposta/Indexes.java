/*
 * This file is generated by jOOQ.
 */
package joindb.jooq.proposta;


import javax.annotation.Generated;

import joindb.jooq.proposta.tables.GuiaTransitoAnimal;
import joindb.jooq.proposta.tables.Propriedade;
import joindb.jooq.proposta.tables.PropriedadeInformacao;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>proposta</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index GTA_PK = Indexes0.GTA_PK;
    public static final Index PROPRIEDADE_PK = Indexes0.PROPRIEDADE_PK;
    public static final Index UQ_PROPRIEDADE_GEOM = Indexes0.UQ_PROPRIEDADE_GEOM;
    public static final Index PROPRIEDADE_INFORMATION_PK = Indexes0.PROPRIEDADE_INFORMATION_PK;
    public static final Index UQ_PROPRIEDADE_INFORMATION_CNJP_CPF_NOME = Indexes0.UQ_PROPRIEDADE_INFORMATION_CNJP_CPF_NOME;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index GTA_PK = Internal.createIndex("GTA_pk", GuiaTransitoAnimal.GUIA_TRANSITO_ANIMAL, new OrderField[] { GuiaTransitoAnimal.GUIA_TRANSITO_ANIMAL.ID }, true);
        public static Index PROPRIEDADE_PK = Internal.createIndex("propriedade_pk", Propriedade.PROPRIEDADE, new OrderField[] { Propriedade.PROPRIEDADE.ID }, true);
        public static Index UQ_PROPRIEDADE_GEOM = Internal.createIndex("uq_propriedade_geom", Propriedade.PROPRIEDADE, new OrderField[] { Propriedade.PROPRIEDADE.GEOM }, true);
        public static Index PROPRIEDADE_INFORMATION_PK = Internal.createIndex("propriedade_information_pk", PropriedadeInformacao.PROPRIEDADE_INFORMACAO, new OrderField[] { PropriedadeInformacao.PROPRIEDADE_INFORMACAO.ID }, true);
        public static Index UQ_PROPRIEDADE_INFORMATION_CNJP_CPF_NOME = Internal.createIndex("uq_propriedade_information_cnjp_cpf_nome", PropriedadeInformacao.PROPRIEDADE_INFORMACAO, new OrderField[] { PropriedadeInformacao.PROPRIEDADE_INFORMACAO.CNPJ, PropriedadeInformacao.PROPRIEDADE_INFORMACAO.NOME_PROPRIEDADE, PropriedadeInformacao.PROPRIEDADE_INFORMACAO.CPF, PropriedadeInformacao.PROPRIEDADE_INFORMACAO.NOME_PROPRIETARIO, PropriedadeInformacao.PROPRIEDADE_INFORMACAO.PROPRIEDADE_ID }, true);
    }
}