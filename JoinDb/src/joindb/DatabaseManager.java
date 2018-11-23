/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joindb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Danilo2
 */
public class DatabaseManager {

    public static String DB_HOST = "enceladus";
    public static String DB_NAME = "cit";
    public static String PORT = "5432";
    public static String USER = "cit";
    public static String PASSWORD = "cit2018";
    
    public final Connection startConnection() {
        String url = "jdbc:postgresql://" + DB_HOST + ":" + PORT + "/" + DB_NAME;
        try {
            Class.forName("org.postgresql.Driver").newInstance();
            Connection conn = DriverManager.getConnection(url, USER, PASSWORD);
            conn.setAutoCommit(false);
            return conn;
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return null;
        } catch (Exception e) {
            System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
            return null;
        }
    }

    public DatabaseManager() {
    }
    
    //#TODO precisa verificar se vai fechar statement e connection.
    public ResultSet runQuery(String sqlQuery) throws SQLException {
        ResultSet queryResult;
        try (Connection curConnection = startConnection();
                Statement statement = curConnection.createStatement()) {
            queryResult = statement.executeQuery(sqlQuery);
        }
        return queryResult;
    }
}
