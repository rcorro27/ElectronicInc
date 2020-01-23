/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author rcorroch
 */
public class Panier {
    private int orderid;
    private String produitid;
    private int quantite;
    private double prix;
    private User utilisateur;

    public Panier() {
    }

    public Panier(int orderid, String produitid, int quantite, double prix, User utilisateur) {
        this.orderid = orderid;
        this.produitid = produitid;
        this.quantite = quantite;
        this.prix = prix;
        this.utilisateur = utilisateur;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getProduitid() {
        return produitid;
    }

    public void setProduitid(String produitid) {
        this.produitid = produitid;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public User getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(User utilisateur) {
        this.utilisateur = utilisateur;
    }


}
