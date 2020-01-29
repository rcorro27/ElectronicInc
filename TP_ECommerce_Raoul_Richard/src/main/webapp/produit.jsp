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
        <link href="css_richard.css" rel="stylesheet" type="text/css"/>
        <title>Produit</title>
    </head>
    <body>
        <fieldset>
            <table>
                <tr>
                    <th><%=p.getProduit_name()%></th>
                </tr>
                <tr>
                    <td><img id="images" src="images/<%=p.getUrl_image()%>" width="400px"/></td>
                </tr>
            </table>
        </fieldset>
        <article>      
            <a href="panierControler?idProduit=<%=p.getId()%>">Ajouter au panier</a>
        </article>
        <article> 
            <a href="panierControler?lien=1&idProduit=<%=p.getId()%>">Afficher panier</a>
        </article>
    </body>
</html>
