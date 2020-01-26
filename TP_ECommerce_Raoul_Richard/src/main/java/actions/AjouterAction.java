/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import javax.servlet.http.HttpServletRequest;
import managers.PanierManager;
import managers.UserManager;

/**
 *
 * @author rcorroch
 */
public class AjouterAction {

    public static void adduseraction(HttpServletRequest request, String nom, String type_user, String email,
            String password, String prenom, String username, String adresse) {
        UserManager.setUser(nom, type_user, email, password, prenom, username, adresse, request);
    }
    
}
