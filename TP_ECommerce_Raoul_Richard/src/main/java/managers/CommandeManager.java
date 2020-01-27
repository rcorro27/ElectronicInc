/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    private final static String querySetOrderItems = "INSERT INTO bd_boutique.order_items(produit_id,order_id,prix_unitaire,quantite)\n"
            + "VALUES (?,?,?,?) ";
    private static String queryGetOrderId = "select max(id) from bd_boutique.order";

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

    public static void setOrderItems(int idProduit, int idOrder, Double prix, int quantite) {

        try {
            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(querySetOrderItems);

            preparedStatement.setInt(1, idProduit);
            preparedStatement.setInt(2, idOrder);
            preparedStatement.setDouble(3, prix);
            preparedStatement.setInt(4, quantite);

            preparedStatement.execute();
            ConnexionBDD.close();
        } catch (SQLException ex) {
            Logger.getLogger(CommandeManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int getOrderId() {
        int orderId = 0;
        try {
            PreparedStatement preparedStatement = ConnexionBDD.getPreparedStatement(queryGetOrderId);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.isBeforeFirst()) {
                while (resultSet.next()) {
                    orderId = resultSet.getInt("max(id)");
                }
            }
            ConnexionBDD.close();

        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return orderId;
    }
}
