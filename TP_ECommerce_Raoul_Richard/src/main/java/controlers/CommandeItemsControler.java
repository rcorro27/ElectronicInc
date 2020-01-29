/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlers;

import actions.PanierAction;
import entities.Produit;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import managers.PanierManager;

/**
 *
 * @author rrobilla
 */
@WebServlet(name = "CommandeItemsControler", urlPatterns = {"/commandeItemsControler"})
public class CommandeItemsControler extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String val = "1";
        HashMap<Integer, Produit> panier = (HashMap) request.getSession().getAttribute("panier");
        if (request.getParameter("del") != null) {
            PanierAction.delProduitPanier(request, Integer.parseInt(request.getParameter("del")));
            request.getRequestDispatcher("panierControler?lien=1").forward(request, response);
        }
        HashMap<Integer, Integer> quantites = new HashMap();
        Double prixTotal = 0.0;
        for (Integer i : panier.keySet()) {
            quantites.put(i, Integer.parseInt(request.getParameter(String.valueOf(panier.get(i).getId()))));
            prixTotal += quantites.get(i) * panier.get(i).getPrix();
        }
        request.getSession().setAttribute("prixTotal", prixTotal);
        request.getSession().setAttribute("quantites", quantites);

        if (request.getSession().getAttribute("user") == null) {
            request.setAttribute("val", val);
            request.getRequestDispatcher("loginControler").forward(request, response);
        } else {
            request.getRequestDispatcher("commande.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
