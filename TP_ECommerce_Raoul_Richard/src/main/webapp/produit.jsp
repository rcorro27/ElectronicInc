<%-- 
    Document   : produit
    Created on : Jan 29, 2020, 10:13:07 AM
    Author     : rrobilla
--%>

<%@page import="entities.Produit"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%Produit p = (Produit) request.getAttribute("produit");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <th><%=p.getProduit_name()%></th>
            </tr>
            <tr>
                <td><img src="images/<%=p.getUrl_image()%>"/></td>
            </tr>
        </table>
        <a href="panierControler?idProduit=<%=p.getId()%>">ajouter au panier</a>
        <a href="panierControler?lien=1&idProduit=<%=p.getId()%>">Afficher panier</a>
    </body>
</html>
