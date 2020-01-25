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
    private String typeuser;
    private String email;
    private String password;
    private String username;
    private String prenom;
    private String adresse;

    public User() {
    }

    public User(String nom, String typeuser, String email, String password, String username, String prenom, String adresse) {
        this.nom = nom;
        this.typeuser = typeuser;
        this.email = email;
        this.password = password;
        this.username = username;
        this.prenom = prenom;
        this.adresse = adresse;
    }
    

    public User(int id, String nom, String typeuser, String email, String password, String username, String prenom, String adresse) {
        this.id = id;
        this.nom = nom;
        this.typeuser = typeuser;
        this.email = email;
        this.password = password;
        this.username = username;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public User(int id, String username) {
        this.id = id;
        this.username = username;
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

    public String getTypeuser() {
        return typeuser;
    }

    public void setTypeuser(String typeuser) {
        this.typeuser = typeuser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    
    

   
   
}
