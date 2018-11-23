/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joindb;

import java.sql.SQLException;

/**
 *
 * @author Danilo2
 */
public class JoinDb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        JoinDatabases dbs = new JoinDatabases();
        dbs.loadPropriedades();
        dbs.getAllGtaInformation();
    }
    
}
