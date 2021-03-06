/*
 * This file is generated by jOOQ.
 */
package joindb.jooq.public_;


import javax.annotation.Generated;

import joindb.jooq.public_.tables.AreaImovelJuntos;
import joindb.jooq.public_.tables.records.AreaImovelJuntosRecord;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AreaImovelJuntosRecord, Integer> IDENTITY_AREA_IMOVEL_JUNTOS = Identities0.IDENTITY_AREA_IMOVEL_JUNTOS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AreaImovelJuntosRecord> AREA_IMOVEL_JUNTOS_PKEY = UniqueKeys0.AREA_IMOVEL_JUNTOS_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<AreaImovelJuntosRecord, Integer> IDENTITY_AREA_IMOVEL_JUNTOS = Internal.createIdentity(AreaImovelJuntos.AREA_IMOVEL_JUNTOS, AreaImovelJuntos.AREA_IMOVEL_JUNTOS.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<AreaImovelJuntosRecord> AREA_IMOVEL_JUNTOS_PKEY = Internal.createUniqueKey(AreaImovelJuntos.AREA_IMOVEL_JUNTOS, "AREA_IMOVEL_juntos_pkey", AreaImovelJuntos.AREA_IMOVEL_JUNTOS.ID);
    }
}
