/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joindb;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Parameter;
import org.jooq.Record;
import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.name;

/**
 *
 * @author danilo
 */
public class SqlHelper {

    //Permite definir Alias para a tabela e|ou Para o campo
    //Danilo se for o Return com um valor só da funcao, é retornado apenas o field. (Apenas alias do campo)
    //Danilo se for Return com uma tupla de valores é retornado uma tabela. (Alias da tabela + do campo)
    public static <T extends Object> Field<T> getFieldFromParameter(Parameter<T> parameter,
            String tableAlias, String fieldAlias) {
        assert (tableAlias != null || fieldAlias != null);
        if (fieldAlias != null)
            fieldAlias = fieldAlias.toLowerCase();
        Name name = tableAlias != null ? 
                name(tableAlias, fieldAlias != null ? fieldAlias : parameter.getName())
                : name(fieldAlias);
        return field(name, parameter.getType());
    }
    
    public static <T extends Object> Field<T> getFieldFromParameter(Parameter<T> parameter,
            String tableAlias) {
        return getFieldFromParameter(parameter, tableAlias, null);
    }
}
