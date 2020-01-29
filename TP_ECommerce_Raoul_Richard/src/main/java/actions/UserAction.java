/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import entities.User;
import javax.servlet.http.HttpServletRequest;
import managers.UserManager;

/**
 *
 * @author rrobilla
 */
public class UserAction {
    public static User getUser(HttpServletRequest request, String a, String b) {
        return UserManager.getuser(a, b);
    }
    public static User setuser(HttpServletRequest request,String username,String password,
            String prenom,String nom,String adresse ,String email,String type_user){
            UserManager.setUser(username, password, prenom, nom, adresse, email, type_user, request);
            return UserManager.getuser(username, password);
    } 
    
    
   
}
