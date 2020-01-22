/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entities.User;
import java.util.ArrayList;

/**
 *
 * @author rcorroch
 */
public class UserManager {

    private static ArrayList<User> listuser;

    public static ArrayList<User> getuser(String username, String pws) {
        ArrayList<User> user = new ArrayList<>();
        if (listuser != null) {
            for (User u : listuser) {
                if (u.getEmail().contains(username) && u.getPwd().contains(pws)) {
                    user.add(u);
                }
            }
        }

        return user;
    }

    public static ArrayList<User> setUser(int id, String nom, String type_user, String email, String pwd) {

        User nouveauUser = new User();
        nouveauUser.setId(id);
        nouveauUser.setNom(nom);
        nouveauUser.setType_user(type_user);
        nouveauUser.setEmail(email);
        nouveauUser.setPwd(pwd);
        listuser.add(nouveauUser);

        return listuser;
    }
}
