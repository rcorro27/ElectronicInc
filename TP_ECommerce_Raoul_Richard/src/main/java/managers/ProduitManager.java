/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entities.Produit;
import java.util.ArrayList;

/**
 *
 * @author rrobilla
 */
public class ProduitManager {

    private static ArrayList<Produit> produits;

    private static void init() {
        produits = new ArrayList<>();
        produits.add(new Produit(1, "laptop Asus", 1, 899.99));
        produits.add(new Produit(2, "jeux Xbox GTA V", 2, 39.99));
        produits.add(new Produit(3, "Ecran Acer 20p", 3, 199.99));
        produits.add(new Produit(4, "Samsung Galaxy", 4, 699.99));
    }

    public static ArrayList<Produit> getAll() {
        if (produits == null) {
            init();
        }
        return produits;
    }

    public static ArrayList<Produit> getByIdCategorie(int idCat) {
        if (produits == null) {
            init();
        }
        ArrayList<Produit> retour = new ArrayList<>();
        for (Produit p : produits) {
            if (p.getId_categorie() == idCat) {
                retour.add(p);
            }
        }
        return retour;
    }
}
