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

  
    private String urlImage;
    private int id;
    private int produitId;

    public Photos() {
    }

    public Photos(String urlImage, int id, int produitId) {
        this.urlImage = urlImage;
        this.id = id;
        this.produitId = produitId;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

   
   
    

 
    
}
