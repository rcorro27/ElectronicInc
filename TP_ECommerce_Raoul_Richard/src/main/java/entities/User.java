/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author rrobilla
 */
public class User {

    private int id;
    private String nom;
    private String type_user;
    private String email;
    private String pwd;
    

   
    public User(int id, String nom, String type_user, String email, String pwd) {
        this.id = id;
        this.nom = nom;
        this.type_user = type_user;
        this.email = email;
        this.pwd = pwd;
    }

    public User() {
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType_user() {
        return type_user;
    }

    public void setType_user(String type_user) {
        this.type_user = type_user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
