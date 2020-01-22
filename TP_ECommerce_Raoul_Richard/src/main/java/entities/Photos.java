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
public class Photos {

  
    private String url;
    private Categorie nomCategorie;
    private Produit idProduit;

    public Photos() {
    }

    public Photos(String url, Categorie nomCategorie, Produit idProduit) {
        this.url = url;
        this.nomCategorie = nomCategorie;
        this.idProduit = idProduit;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Categorie getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(Categorie nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public Produit getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Produit idProduit) {
        this.idProduit = idProduit;
    }

   
    

 
    
}
