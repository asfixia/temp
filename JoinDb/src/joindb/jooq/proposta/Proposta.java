/*
 * This file is generated by jOOQ.
 */
package joindb.jooq.proposta;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import joindb.jooq.DefaultCatalog;
import joindb.jooq.proposta.tables.GuiaTransitoAnimal;
import joindb.jooq.proposta.tables.Propriedade;
import joindb.jooq.proposta.tables.PropriedadeInformacao;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Proposta extends SchemaImpl {

    private static final long serialVersionUID = -1782632697;

    /**
     * The reference instance of <code>proposta</code>
     */
    public static final Proposta PROPOSTA = new Proposta();

    /**
     * The table <code>proposta.guia_transito_animal</code>.
     */
    public final GuiaTransitoAnimal GUIA_TRANSITO_ANIMAL = joindb.jooq.proposta.tables.GuiaTransitoAnimal.GUIA_TRANSITO_ANIMAL;

    /**
     * Armazena a propriedade em uma determinada data
     */
    public final Propriedade PROPRIEDADE = joindb.jooq.proposta.tables.Propriedade.PROPRIEDADE;

    /**
     * The table <code>proposta.propriedade_informacao</code>.
     */
    public final PropriedadeInformacao PROPRIEDADE_INFORMACAO = joindb.jooq.proposta.tables.PropriedadeInformacao.PROPRIEDADE_INFORMACAO;

    /**
     * No further instances allowed
     */
    private Proposta() {
        super("proposta", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            GuiaTransitoAnimal.GUIA_TRANSITO_ANIMAL,
            Propriedade.PROPRIEDADE,
            PropriedadeInformacao.PROPRIEDADE_INFORMACAO);
    }
}