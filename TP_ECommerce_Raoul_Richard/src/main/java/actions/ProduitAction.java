/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import entities.Categorie;
import entities.Photos;
import entities.Produit;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import managers.CategorieManager;
import managers.PhotoManager;
import managers.ProduitManager;

/**
 *
 * @author rrobilla
 */
public class ProduitAction {

//   public static void printAllProducts(HttpServletRequest request){
////        request.setAttribute("listProducts", ProduitManager.getAll());
//        ArrayList<Produit> produits = ProduitManager.getAll();
//        ArrayList<Categorie> categories = CategorieManager.getall();
//        ArrayList<Photos> photos=PhotoManager.getall();
//        request.setAttribute("produits", produits);
//        request.setAttribute("categories", categories);
//        request.setAttribute("photos", photos);

    public static void printAllProducts(HttpServletRequest request){
        request.setAttribute("listProducts", ProduitManager.getAll());

        
               
       
    }
    
    public static void printProductsByCat(HttpServletRequest request, int idCategorie){
        request.setAttribute("listProducts", ProduitManager.getByIdCategorie(idCategorie));
    }
}
