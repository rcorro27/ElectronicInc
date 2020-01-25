/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entities.Categorie;
import entities.Produit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.ConnexionBDD;

/**
 *
 * @author rcorroch
 */
public class CategorieManager {

    private static String querygetallcategories = "select * from categorie";
    private final static String querySetcategorie = "INSERT INTO categorie(id,categorie_name)\n"
            + "VALUES (?,?) ";
    private final static String querydeletecategorie = "delete FROM bd_boutique.categorie where id = ? ";
     private final static String queryupdatecategorie = "update bd_boutique.categorie set categorie_name = ? where id = ? ";

    public static ArrayList<Categorie> getall() {
        ArrayList<Categorie> listecategorie = null;
        try {
            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(querygetallcategories);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.isBeforeFirst()) {
                listecategorie = new ArrayList<>();
                while (resultSet.next()) {
                    listecategorie.add(new Categorie(resultSet.getInt("id"),
                            resultSet.getString("categorie_name")));
                }
            }

            ConnexionBDD.close();

        } catch (SQLException ex) {
            Logger.getLogger(CategorieManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listecategorie;
    }

    public static void setcategorie(int id, String nom) {

        try {
            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(querySetcategorie);

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, nom);

            preparedStatement.execute();
            ConnexionBDD.close();
        } catch (SQLException ex) {
            Logger.getLogger(CategorieManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void deletecategorie(int id) {

        try {
            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(querydeletecategorie);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            ConnexionBDD.close();
        } catch (SQLException ex) {
            Logger.getLogger(CategorieManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public static void updatecategorie(int id, String nom){

        try {
            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(queryupdatecategorie);
            
            preparedStatement.setString(1, nom);
            preparedStatement.setInt(2, id);
            
            preparedStatement.execute();
            ConnexionBDD.close();
        } catch (SQLException ex) {
            Logger.getLogger(CategorieManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
