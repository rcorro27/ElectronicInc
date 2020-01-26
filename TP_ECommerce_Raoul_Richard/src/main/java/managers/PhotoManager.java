/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entities.Categorie;
import entities.Photos;
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
public class PhotoManager {

    private static String querygetallphotos = "select * from image";
    private final static String querysetphotos = "INSERT INTO image(id,produit_id,url_image)\n"
            + "VALUES (?,?,?) ";
    private final static String querydeletephotos = "delete FROM bd_boutique.image where id = ? ";
    private final static String queryupdatephoto = "update bd_boutique.image set url_image = ? where id = ? ";
    private final static String querygetbyproduitid = "select * from image where produit_id = ?";

    public static ArrayList<Photos> getall() {
        ArrayList<Photos> listephotos = null;
        try {
            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(querygetallphotos);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.isBeforeFirst()) {
                listephotos = new ArrayList<>();
                while (resultSet.next()) {
                    listephotos.add(new Photos(resultSet.getInt("id"),
                            resultSet.getInt("produit_id"),
                            resultSet.getString("url_image")));
                }
            }

            ConnexionBDD.close();

        } catch (SQLException ex) {
            Logger.getLogger(CategorieManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listephotos;
    }

    public static void setphoto(int id, int produitid, String urlimage) {

        try {
            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(querysetphotos);

            preparedStatement.setInt(1, id);
            preparedStatement.setInt(2, produitid);
            preparedStatement.setString(3, urlimage);

            preparedStatement.execute();
            ConnexionBDD.close();
        } catch (SQLException ex) {
            Logger.getLogger(CategorieManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void deletephotos(int id) {

        try {
            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(querydeletephotos);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
            ConnexionBDD.close();
        } catch (SQLException ex) {
            Logger.getLogger(CategorieManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateimage(int id, String urlimage) {

        try {
            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(queryupdatephoto);

            preparedStatement.setString(1, urlimage);
            preparedStatement.setInt(2, id);

            preparedStatement.execute();
            ConnexionBDD.close();
        } catch (SQLException ex) {
            Logger.getLogger(CategorieManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Photos> getphotobyidproduit(int idproduit) {
        ArrayList<Photos> listephotobyidproduit = null;
        try {

            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(querygetbyproduitid);
            preparedStatement.setInt(1, idproduit);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.isBeforeFirst()) {
                listephotobyidproduit = new ArrayList<>();
                while (resultSet.next()) {
                    listephotobyidproduit.add(new Photos(resultSet.getInt("id"),
                            resultSet.getString("url_image")));
                }
            }
            ConnexionBDD.close();
        } catch (SQLException ex) {
            Logger.getLogger(ProduitManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listephotobyidproduit;
    }

    /*  public static ArrayList<Photos> getPhotoByCategorie(Categorie idCategorie) {
        ArrayList<Photos> listPhotoByCategorie = new ArrayList<>();
        if (listPhoto != null) {

            for (Photos photo : listPhoto) {
                if (photo.getNomCategorie().equals(idCategorie)) {
                    listPhotoByCategorie.add(photo);
                }
            }

        }
        return listPhotoByCategorie;

    }

    public static ArrayList<Photos> getPhotoByIdProduit(Produit id) {
        ArrayList<Photos> listPhotoByIdProduit = new ArrayList<>();
        if (listPhoto != null) {

            for (Photos photo : listPhoto) {
                if (photo.getIdProduit().equals(id)) {
                    listPhotoByIdProduit.add(photo);
                }
            }

        }
        return listPhotoByIdProduit;
    }*/
}
