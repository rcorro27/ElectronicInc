/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entities.Produit;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author rrobilla
 */
public class PanierManager {

    private static HashMap<Integer, Produit> panier = null;

    public static void addProduit(int produitId, HttpServletRequest request) {
        if (panier == null) {
            panier = new HashMap();
        }
        panier.put(produitId, ProduitManager.getProduit(produitId));
    }

    public static HashMap getPanier() {
        return panier;
    }

    public static void delProduit(int id, HttpServletRequest request) {
        //panier = new HashMap<>();
        if (!panier.isEmpty() && panier != null) {
            panier.remove(id);
        }
    }

    public static void delPanier() {
        for (Integer i : panier.keySet()) {
            panier.remove(i);
        }
    }
}
