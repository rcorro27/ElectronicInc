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
    private double prixtotal;
    private Date orderdate;

    public Commandes() {
    }

    public Commandes(int id, int userid, double prixtotal, Date orderdate) {
        this.id = id;
        this.userid = userid;
        this.prixtotal = prixtotal;
        this.orderdate = orderdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public double getPrixtotal() {
        return prixtotal;
    }

    public void setPrixtotal(double prixtotal) {
        this.prixtotal = prixtotal;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    
   

    
    
  
    
}
