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
public class Produit {
    private int id;
    private String produitname;
    private int categorieid;
    private double prix;
    private int stock;

    public Produit() {
    }

    public Produit(int id, String produitname, int categorieid, double prix, int stock) {
        this.id = id;
        this.produitname = produitname;
        this.categorieid = categorieid;
        this.prix = prix;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduitname() {
        return produitname;
    }

    public void setProduitname(String produitname) {
        this.produitname = produitname;
    }

    public int getCategorieid() {
        return categorieid;
    }

    public void setCategorieid(int categorieid) {
        this.categorieid = categorieid;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    

    
}
