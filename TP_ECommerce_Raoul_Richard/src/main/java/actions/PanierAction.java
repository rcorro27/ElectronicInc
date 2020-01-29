/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import javax.servlet.http.HttpServletRequest;
import managers.PanierManager;

/**
 *
 * @author rrobilla
 */
public class PanierAction {

    public static void addProduitPanier(HttpServletRequest request, int id) {
        PanierManager.addProduit(id, request);
        request.getSession().setAttribute("panier", PanierManager.getPanier());
    }

    public static void delProduitPanier(HttpServletRequest request, int id) {
        PanierManager.delProduit(id, request);
        //request.getSession().setAttribute("panier", PanierManager.getPanier());

    }
    public static void delPanier() {
        PanierManager.delPanier();
    }
    public static void afficherPanier(HttpServletRequest request) {
        request.setAttribute("affichePanier", PanierManager.getPanier());
    }
}
