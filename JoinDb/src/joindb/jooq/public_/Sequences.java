/*
 * This file is generated by jOOQ.
 */
package joindb.jooq.public_;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in public
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
     * The sequence <code>public.AREA_IMOVEL_juntos_id_seq</code>
     */
    public static final Sequence<Integer> AREA_IMOVEL_JUNTOS_ID_SEQ = new SequenceImpl<Integer>("AREA_IMOVEL_juntos_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER.nullable(false));
}