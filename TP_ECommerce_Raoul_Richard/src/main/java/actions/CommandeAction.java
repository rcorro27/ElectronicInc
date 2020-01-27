/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import entities.Produit;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import managers.CommandeManager;

/**
 *
 * @author rrobilla
 */
public class CommandeAction {

    public static void setOrderItems(HttpServletRequest request) {
        HashMap<Integer, Produit> panier = (HashMap) request.getSession().getAttribute("panier");
        HashMap<Integer, Integer> quantite = (HashMap) request.getSession().getAttribute("quantites");
        for(Integer i: panier.keySet()) {
           CommandeManager.setOrderItems(i, CommandeManager.getOrderId(), panier.get(i).getPrix(), quantite.get(i));
           //CommandeManager.setOrderItems();
        }

    }
}
