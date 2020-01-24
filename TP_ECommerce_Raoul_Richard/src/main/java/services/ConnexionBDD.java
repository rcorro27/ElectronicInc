/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jlidou
 */
public class ConnexionBDD {

    private static String url = "jdbc:mysql://localhost:3310/bd_boutique?serverTimezone=UTC";
    private static String login = "root";
    private static String pwd = "abc123...";
    private static Connection connection;

    public static PreparedStatement getPreparedStatement(String query) {
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, login, pwd);
            preparedStatement = connection.prepareStatement(query);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return preparedStatement;
    }

    
    public static void close() {
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
