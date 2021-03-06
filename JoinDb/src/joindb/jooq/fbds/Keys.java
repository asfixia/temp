/*
 * This file is generated by jOOQ.
 */
package joindb.jooq.fbds;


import javax.annotation.Generated;

import joindb.jooq.fbds.tables.AreaImovelMgEs_228Muni;
import joindb.jooq.fbds.tables.records.AreaImovelMgEs_228MuniRecord;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>FBDS</code> schema.
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

    public static final Identity<AreaImovelMgEs_228MuniRecord, Integer> IDENTITY_AREA_IMOVEL_MG_ES_228_MUNI = Identities0.IDENTITY_AREA_IMOVEL_MG_ES_228_MUNI;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AreaImovelMgEs_228MuniRecord> AREA_IMOVEL_MG_ES_228_MUNI_PKEY = UniqueKeys0.AREA_IMOVEL_MG_ES_228_MUNI_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<AreaImovelMgEs_228MuniRecord, Integer> IDENTITY_AREA_IMOVEL_MG_ES_228_MUNI = Internal.createIdentity(AreaImovelMgEs_228Muni.AREA_IMOVEL_MG_ES_228_MUNI, AreaImovelMgEs_228Muni.AREA_IMOVEL_MG_ES_228_MUNI.ID_0);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<AreaImovelMgEs_228MuniRecord> AREA_IMOVEL_MG_ES_228_MUNI_PKEY = Internal.createUniqueKey(AreaImovelMgEs_228Muni.AREA_IMOVEL_MG_ES_228_MUNI, "area_imovel_mg_es_228_muni_pkey", AreaImovelMgEs_228Muni.AREA_IMOVEL_MG_ES_228_MUNI.ID_0);
    }
}
