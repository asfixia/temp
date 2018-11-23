/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joindb;

import java.sql.Connection;
import java.sql.SQLException;
import static joindb.jooq.csr_database.tables.MtMunicipio.MT_MUNICIPIO;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

/**
 *
 * @author danilo
 */
public class EstadoMunicipioInformation {

//    private HashMap<String, Integer> estadoSiglaId;
//    
//    public EstadoMunicipioInformation() {
//        DatabaseManager databaseManager = new DatabaseManager();
//        try (Connection connection = databaseManager.startConnection()) {
//            DSLContext create = DSL.using(connection, SQLDialect.POSTGRES_10);
//            Result<Record> mtMunicipio = create.fetch("SELECT * FROM csr_database.mt_municipio");
//            Iterator<Record> itMtMunicipio = mtMunicipio.iterator();
//            estadoSiglaId = new HashMap<>();
//            while (itMtMunicipio.hasNext()) {
//
//            }
//        }
//    }
//    
    
    public static Integer getMunicipioId(Integer geocodigo) throws SQLException {
        Integer result = null;
        if (geocodigo != null) {
            DatabaseManager databaseManager = new DatabaseManager();
            try (Connection connection = databaseManager.startConnection()) {
                DSLContext create = DSL.using(connection, SQLDialect.POSTGRES_10);
                Record mtMunicipio = create.fetchOne("SELECT * FROM csr_database.mt_municipio\n"
                        + "WHERE municipio_geocodigo = '" + geocodigo + "'");
                result = mtMunicipio.getValue(MT_MUNICIPIO.MUNICIPIO_ID);
            }
        }
        return result;
    }
    
    public static Integer getEstadoId(String sigla) {
        return (sigla != null) ? 10 : null;
    }
    
    public static void createDB() throws SQLException {
        DatabaseManager databaseManager = new DatabaseManager();
        try (Connection connection = databaseManager.startConnection()) {
            DSLContext create = DSL.using(connection, SQLDialect.POSTGRES_10);
            //Fetch todos
            create.fetch("CREATE TABLE IF NOT EXISTS csr_database.MT_municipio AS \n"
                    + "(SELECT estados.id as estado_id, estados.sigla as estado_sigla, municipios.id as municipio_id, municipios.geocodigo as municipio_geocodigo\n"
                    + "FROM csr_database.estados, csr_database.municipios\n"
                    + "WHERE\n"
                    + "ST_INTERSECTS(municipios.geom, estados.geom)\n"
                    + "and estados.sigla = 'MT')");
        }
    }
//    
//    public void fillDB() throws SQLException {
//        
//    }
}
