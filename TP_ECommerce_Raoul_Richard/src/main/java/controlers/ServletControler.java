/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlers;

import actions.ProduitAction;
import entities.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import managers.UserManager;

/**
 *
 * @author rrobilla
 */
@WebServlet(name = "ServletControler", urlPatterns = {"/servletControler"})
public class ServletControler extends HttpServlet {
/*
    String nom = "pedro";
    String type_user = "sts";
    String email = "st@gmail.com";
    String password = "paul254";
    String prenom = "richard";
    String username = "paul25";
    String adresse = "rue 333 ddfsdf 3323 dsf";
*/
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      
        //1 - recupe les parametres
        String idCatString = request.getParameter("idCategorie");

        // 2 -  appelle les actions en fonction des params
        //  if (idCatString == null) {
        //   ProduitAction.printAllProducts(request);
        //  } else {
        //  ProduitAction.printProductsByCat(request, Integer.parseInt(idCatString));
        // }
       // User user=UserManager.getuser("paul25", "paul254");
       // UserManager.updatetuser(, nom, type_user, email, password, prenom, username, adresse);
       // UserManager.setUser(nom, type_user, email, password, prenom, username, adresse);
        
         
        // 3- Redirection
        // request.getRequestDispatcher("page1test.jsp").forward(request, response);
                
                
                
                   try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet testmethodes</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet testmethodes at </h1>");
            out.println("</body>");
            out.println("</html>");
            
          
            
            
          
            
            
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
