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

  
    private String urlimage;
    private int id;
    private int produitid;

    public Photos() {
    }

    public Photos(String urlimage, int id, int produitid) {
        this.urlimage = urlimage;
        this.id = id;
        this.produitid = produitid;
    }

    public String getUrlimage() {
        return urlimage;
    }

    public void setUrlimage(String urlimage) {
        this.urlimage = urlimage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduitid() {
        return produitid;
    }

    public void setProduitid(int produitid) {
        this.produitid = produitid;
    }

   
   
   
    

 
    
}
