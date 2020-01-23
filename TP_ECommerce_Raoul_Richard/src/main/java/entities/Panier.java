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
    private int produitid;
    private int quantite;
    private double prixunitaire;
    private int id;

    public Panier() {
    }

    public Panier(int orderid, int produitid, int quantite, double prixunitaire, int id) {
        this.orderid = orderid;
        this.produitid = produitid;
        this.quantite = quantite;
        this.prixunitaire = prixunitaire;
        this.id = id;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getProduitid() {
        return produitid;
    }

    public void setProduitid(int produitid) {
        this.produitid = produitid;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double getPrixunitaire() {
        return prixunitaire;
    }

    public void setPrixunitaire(double prixunitaire) {
        this.prixunitaire = prixunitaire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    
}
