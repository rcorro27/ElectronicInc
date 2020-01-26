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

  
    
    private int id;
    private int produitid;
    private String urlimage;

    public Photos() {
    }

    public Photos( int id, int produitid, String urlimage) {
        this.urlimage = urlimage;
        this.id = id;
        this.produitid = produitid;
    }

    public Photos(int id, String urlimage) {
        this.id = id;
        this.urlimage = urlimage;
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
