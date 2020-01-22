/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author rcorroch
 */
public class Commandes {
    private int id;
    private int userid;
    private Produit idproduit;
    private Date dateorder;

    public Commandes(int id, int userid, Produit idproduit, Date dateorder) {
        this.id = id;
        this.userid = userid;
        this.idproduit = idproduit;
        this.dateorder = dateorder;
    }

    public Commandes() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produit getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(Produit idproduit) {
        this.idproduit = idproduit;
    }

    public Date getDateorder() {
        return dateorder;
    }

    public void setDateorder(Date dateorder) {
        this.dateorder = dateorder;
    }
    
    
}
