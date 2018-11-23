/*
 * This file is generated by jOOQ.
 */
package joindb.jooq.gta;


import javax.annotation.Generated;

import joindb.jooq.gta.tables.MtTransactions2;
import joindb.jooq.gta.tables.records.MtTransactions2Record;

import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>gta</code> schema.
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


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<MtTransactions2Record> MT_TRANSACTIONS2_PK = UniqueKeys0.MT_TRANSACTIONS2_PK;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<MtTransactions2Record> MT_TRANSACTIONS2_PK = Internal.createUniqueKey(MtTransactions2.MT_TRANSACTIONS2, "mt_transactions2_pk", MtTransactions2.MT_TRANSACTIONS2.SCRAPEID);
    }
}