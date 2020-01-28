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
    private String produit_name;
    private int categorie_id;
    private double prix;
    private int stock;
    private String url_image;

    public String getUrl_image() {
        return url_image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduit_name() {
        return produit_name;
    }

    public void setProduit_name(String produit_name) {
        this.produit_name = produit_name;
    }

    public int getCategorie_id() {
        return categorie_id;
    }

    public void setCategorie_id(int categorie_id) {
        this.categorie_id = categorie_id;
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

    public Produit(int id, String produit_name, int categorie_id, double prix, int stock, String url_image) {
        this.id = id;
        this.produit_name = produit_name;
        this.categorie_id = categorie_id;
        this.prix = prix;
        this.stock = stock;
        this.url_image = url_image;

    }

}
