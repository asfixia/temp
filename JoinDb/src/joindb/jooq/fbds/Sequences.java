/*
 * This file is generated by jOOQ.
 */
package joindb.jooq.fbds;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in FBDS
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>FBDS.area_imovel_mg_es_228_muni_id_0_seq</code>
     */
    public static final Sequence<Integer> AREA_IMOVEL_MG_ES_228_MUNI_ID_0_SEQ = new SequenceImpl<Integer>("area_imovel_mg_es_228_muni_id_0_seq", Fbds.FBDS, org.jooq.impl.SQLDataType.INTEGER.nullable(false));
}
