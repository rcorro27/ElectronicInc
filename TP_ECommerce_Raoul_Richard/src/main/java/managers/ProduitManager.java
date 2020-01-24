/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

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
 * @author rrobilla
 */
public class ProduitManager {

    private static String queryGetAll = "select * from produit";

    public static ArrayList<Produit> getAll() {
        ArrayList<Produit> retour = null;
        try {
            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(queryGetAll);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.isBeforeFirst()) {
                retour = new ArrayList<>();
                while (resultSet.next()) {
                    retour.add(new Produit(resultSet.getInt("id"),
                            resultSet.getString("produit_name"),
                            resultSet.getInt("categorie_id"),
                            resultSet.getDouble("prix"),
                            resultSet.getInt("stock")));
                }
            }

            ConnexionBDD.close();

        } catch (SQLException ex) {
            Logger.getLogger(ProduitManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retour;
    }

    private static String queryGetByIdCategorie = "select * from produit where categorie_id = ?";

    public static ArrayList<Produit> getByIdCategorie(int idCat) {
        ArrayList<Produit> retour = null;
        try {

            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(queryGetByIdCategorie);
            preparedStatement.setInt(1, idCat);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.isBeforeFirst()) {
                retour = new ArrayList<>();
                while (resultSet.next()) {
                    retour.add(new Produit(resultSet.getInt("id"),
                            resultSet.getString("produit_name"),
                            resultSet.getInt("categorie_id"),
                            resultSet.getDouble("prix"),
                            resultSet.getInt("stock")));
                }
            }
            ConnexionBDD.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProduitManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retour;
    }

    private static String queryGetByIdProduit = "select * from produit where id = ?";

    public static Produit getProduit(int id) {
        Produit p = null;
        try {

            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(queryGetByIdCategorie);
            preparedStatement.setInt(1, id - 1);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.isBeforeFirst()) {

                while (resultSet.next()) {
                    p = new Produit(resultSet.getInt("id"),
                            resultSet.getString("produit_name"),
                            resultSet.getInt("categorie_id"),
                            resultSet.getDouble("prix"),
                            resultSet.getInt("stock"));
                }
            }
            ConnexionBDD.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProduitManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }
}
