/*
 * This file is generated by jOOQ.
 */
package joindb.jooq.proposta.routines;


import java.math.BigDecimal;

import javax.annotation.Generated;

import joindb.jooq.proposta.Proposta;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


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
public class Getcpfcnpjvalidity extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = -1223483987;

    /**
     * The parameter <code>proposta.getCpfCnpjValidity.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>proposta.getCpfCnpjValidity.value</code>.
     */
    public static final Parameter<BigDecimal> VALUE = createParameter("value", org.jooq.impl.SQLDataType.NUMERIC, false, false);

    /**
     * Create a new routine call instance
     */
    public Getcpfcnpjvalidity() {
        super("getCpfCnpjValidity", Proposta.PROPOSTA, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(VALUE);
    }

    /**
     * Set the <code>value</code> parameter IN value to the routine
     */
    public void setValue(BigDecimal value) {
        setValue(VALUE, value);
    }

    /**
     * Set the <code>value</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setValue(Field<BigDecimal> field) {
        setField(VALUE, field);
    }
}
