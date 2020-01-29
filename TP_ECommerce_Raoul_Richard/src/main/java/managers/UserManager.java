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
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author rcorroch
 */
public class UserManager {
    
    private final static String querygetuser = "Select id, username, email from user where username = ? and password = ? ";
    private final static String querySetuser = "INSERT INTO user(username,password,prenom,nom,adresse,email,type_user)\n"
            + "VALUES (?,?,?,?,?,?,?) ";
    private final static String querydeleteuser = "delete FROM bd_boutique.user where id = ? ";
    private final static String queryupdateeuser = "update bd_boutique.user \n"
            + "set username = ? ,\n"
            + "	password = ? ,\n"
            + "    prenom = ? ,\n"
            + "    nom = ? ,\n"
            + "    adresse = ? ,\n"
            + "    email = ? ,\n"
            + "    type_user = ? \n"
            + "    where id = ? ;";
    
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
                            resultSet.getString("username"),
                            resultSet.getString("email"));
                }
            }
            
            ConnexionBDD.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
    
    public static void setUser(String username, String password, String prenom, String nom, String adresse, String email, String type_user, HttpServletRequest request) {
        
        try {
            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(querySetuser);
            
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, prenom);
            preparedStatement.setString(4, nom);
            preparedStatement.setString(5, adresse);
            preparedStatement.setString(6, email);
            preparedStatement.setString(7, type_user);
            
            preparedStatement.execute();
            ConnexionBDD.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void deleteuser(int id) {
        
        try {
            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(querydeleteuser);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            ConnexionBDD.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void updatetuser(int id, String nom, String type_user, String email, String password, String prenom, String username, String adresse) {
        
        try {
            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(queryupdateeuser);
            
            preparedStatement.setInt(1, id);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, prenom);
            preparedStatement.setString(4, nom);
            preparedStatement.setString(5, adresse);
            preparedStatement.setString(6, email);
            preparedStatement.setString(7, type_user);
            preparedStatement.setInt(8, id);
            
            preparedStatement.execute();
            ConnexionBDD.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean valider(String a, String b) {
        boolean flag = false;
        if ((UserManager.getuser(a, b)) != null) {
            flag = true;
        }
        return flag;
    }
}
