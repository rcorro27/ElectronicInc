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
        <link href="css_richard.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <fieldset>
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
        </fieldset>
        <article>
            Total: <%=request.getSession().getAttribute("prixTotal")%>
        </article>
        <article>
            <form action="commandeControler">
                <input type="submit" value="Payer"/>
            </form>
        </article>
    </body>
</html>
