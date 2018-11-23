/*
 * This file is generated by jOOQ.
 */
package joindb.jooq.proposta;


import javax.annotation.Generated;

import joindb.jooq.proposta.tables.GuiaTransitoAnimal;
import joindb.jooq.proposta.tables.Propriedade;
import joindb.jooq.proposta.tables.PropriedadeInformacao;


/**
 * Convenience access to all tables in proposta
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>proposta.guia_transito_animal</code>.
     */
    public static final GuiaTransitoAnimal GUIA_TRANSITO_ANIMAL = joindb.jooq.proposta.tables.GuiaTransitoAnimal.GUIA_TRANSITO_ANIMAL;

    /**
     * Armazena a propriedade em uma determinada data
     */
    public static final Propriedade PROPRIEDADE = joindb.jooq.proposta.tables.Propriedade.PROPRIEDADE;

    /**
     * The table <code>proposta.propriedade_informacao</code>.
     */
    public static final PropriedadeInformacao PROPRIEDADE_INFORMACAO = joindb.jooq.proposta.tables.PropriedadeInformacao.PROPRIEDADE_INFORMACAO;
}