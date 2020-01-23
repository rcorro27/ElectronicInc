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
    private int userId;
    private double prixTotal;
    private Date orderDate;

    public Commandes(int id, int userId, double prixTotal, Date orderDate) {
        this.id = id;
        this.userId = userId;
        this.prixTotal = prixTotal;
        this.orderDate = orderDate;
    }

    public Commandes() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(double prixTotal) {
        this.prixTotal = prixTotal;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    
  
    
}
