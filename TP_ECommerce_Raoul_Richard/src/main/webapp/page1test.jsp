<%-- 
    Document   : page1
    Created on : Jan 20, 2020, 5:53:56 PM
    Author     : rrobilla
--%>
<%@page import="entities.Photos"%>
<%@page import="entities.Categorie"%>
<%@page import="entities.Produit"%>
<%@page import="java.util.ArrayList"%>
<%
    ArrayList<Produit> produits = (ArrayList<Produit>) request.getAttribute("listProducts");
    ArrayList<Categorie> categories = (ArrayList<Categorie>) request.getAttribute("categories");
    ArrayList<Photos> photos = (ArrayList<Photos>) request.getAttribute("photos");
    String idProduit = null;

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        <ul>
            <li><a href="servletControler?idCategorie=1">Laptops</a></li>
            <li><a href="servletControler?idCategorie=2">Cellulaires</a></li>
            <li><a href="servletControler?idCategorie=3">Ecrans</a></li>
            <li><a href="servletControler?idCategorie=4">Jeux videos</a></li>
        </ul>
        <table>
            
            <%for (Produit p : produits) {%>

            <%idProduit = String.valueOf(p.getId());%>
            <tr> 
                <th><%=p.getProduit_name()%></th>

            </tr>
            <tr>
                <td><img src="images/<%=p.getUrl_image()%>" alt=""</td>
            </tr>
            <%}%>
        </table>
        <a href="panierControler?idProduit=<%=idProduit%>">ajouter au panier</a>
        <a href="panierControler?lien=1&idProduit=<%=idProduit%>">Afficher panier</a>




    </body>
</html>
