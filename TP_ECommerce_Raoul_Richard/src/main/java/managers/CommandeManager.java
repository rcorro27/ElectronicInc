/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.ConnexionBDD;

/**
 *
 * @author rcorroch
 */
public class CommandeManager {
    private final static String querySetOrder = "INSERT INTO bd_boutique.order(user_id,order_date,prix_total)\n"
            + "VALUES (?,?,?) ";
    
    public static void setOrder(int user_id, Date date, Double prix) {

        try {
            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(querySetOrder);

            preparedStatement.setInt(1, user_id);
            preparedStatement.setDate(2, date);
            preparedStatement.setDouble(3, prix);

            preparedStatement.execute();
            ConnexionBDD.close();
        } catch (SQLException ex) {
            Logger.getLogger(CommandeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void setOrderItems(int produitId, int orderId, Double prix) {

        try {
            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(querySetOrderItems);

            preparedStatement.setInt(1, produitId);
            preparedStatement.setInt(2, orderId);
            preparedStatement.setDouble(3, prix);

            preparedStatement.execute();
            ConnexionBDD.close();
        } catch (SQLException ex) {
            Logger.getLogger(CommandeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
