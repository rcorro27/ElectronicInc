<%-- 
    Document   : panier
    Created on : Jan 23, 2020, 10:29:03 AM
    Author     : rrobilla
--%>

<%@page import="entities.Produit"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Enumeration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% HashMap<Integer, Produit> panier = (HashMap) request.getSession().getAttribute("panier");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%if (panier != null) {%>
        <form action = "commandeItemsControler" >

            <table>
                <%for (Integer i : panier.keySet()) {%>
                <tr>
                    <td><%=((Produit) panier.get(i)).getProduit_name()%></td>
                    <td>Quantite <input type="text" name="<%=String.valueOf(((Produit) panier.get(i)).getId())%>" value="1"/></td>
                <td>Prix a l'unite <%=String.valueOf(((Produit) panier.get(i)).getPrix())%></td>
                <tr></tr>
                <%}%>
            </table>
            <input type="submit" value="Passer a la caisse"/>
        </form>

        <%} else {
                out.println("Votre panier est vide");
            }
        %>
    </body>
</html>
