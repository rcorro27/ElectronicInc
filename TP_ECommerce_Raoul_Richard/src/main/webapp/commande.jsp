<%-- 
    Document   : commande
    Created on : Jan 27, 2020, 1:12:58 PM
    Author     : rrobilla
--%>

<%@page import="java.util.HashMap"%>
<%@page import="entities.Produit"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%HashMap<Integer, Produit> panier = (HashMap) request.getSession().getAttribute("panier");
    HashMap<Integer, Integer> quantites = (HashMap) request.getSession().getAttribute("quantites");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <th>Produit</th>
                <th>Quantite</th>
                <th>Prix</th>
            </tr>
            <%for (Integer i : panier.keySet()) {%>
            <tr>
                <td><%=panier.get(i).getProduit_name()%></td>
                <td><%=quantites.get(i)%></td>
                <td><%=panier.get(i).getPrix() * quantites.get(i)%></td>
            </tr>
            <%}%>
        </table>
        Total: <%=request.getSession().getAttribute("prixTotal")%>
        <form action="commandeControler">
            <input type="submit" value="Payer"/>
        </form>
    </body>
</html>
