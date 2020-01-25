/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import services.ConnexionBDD;
import entities.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rcorroch
 */
public class UserManager {

    private final static String querygetuser = "Select id, username from user where username = ? and password = ? ";
    private final static String querySetuser = "INSERT INTO user(username,password,prenom,nom,adresse,email,type_user)\n"
            + "VALUES (?,?,?,?,?,?,?) ";
    private final static String url = "jdbc:mysql://localhost:3310/bd_boutique?serverTimezone=UTC";

    public static User getuser(String username, String password) {
        User user = null;
        try {
            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(querygetuser);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.isBeforeFirst()) {
                while (resultSet.next()) {

                    user = new User(resultSet.getInt("id"),
                            resultSet.getString("username"));
                }
            }

            ConnexionBDD.close();

        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    public static void setUser(String nom, String type_user, String email, String password, String prenom, String username, String adresse) {
        //change
        try {
            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(querySetuser);
            preparedStatement.setString(1, nom);
            preparedStatement.setString(2, type_user);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, password);
            preparedStatement.setString(5, prenom);
            preparedStatement.setString(6, username);
            preparedStatement.setString(7, adresse);

            preparedStatement.execute();
            ConnexionBDD.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
