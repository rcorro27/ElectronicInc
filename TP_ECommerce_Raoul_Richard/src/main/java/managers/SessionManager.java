/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entities.User;
import javax.servlet.http.HttpSession;

/**
 *
 * @author rcorroch
 */
public class SessionManager {

    public static HttpSession addinfosession() {
        HttpSession session = null;
        Object ajouter = null;
        String clef = null;
        session.setAttribute(clef,ajouter );
        
        return null;
    }

    public HttpSession getsession(User user) {

        
        return null;
    }
}
