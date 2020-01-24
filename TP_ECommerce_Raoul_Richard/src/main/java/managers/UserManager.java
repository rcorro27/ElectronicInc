/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import services.ConnexionBDD;
import entities.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rcorroch
 */
public class UserManager {

    private static String queryGetUser = "Select username,password from user where username=? and password=?";

    /*public static User getuser(String username, String password) {
        User user =null;
        try {
            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(queryGetUser);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();

             user = new User(resultSet.getInt("id"),
                    resultSet.getString("nom"),
                    resultSet.getString("type_user"),
                    resultSet.getString("type_user"),
                    resultSet.getString("type_user"),
                    resultSet.getString("type_user"),
                    resultSet.getString("type_user"),
                    resultSet.getString("type_user"));

            ConnexionBDD.close();

        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }*/
    public static ArrayList<User> setUser(int id, String nom, String type_user, String email, String password, String prenom, String username, String adresse) {

        return null;
    }
}