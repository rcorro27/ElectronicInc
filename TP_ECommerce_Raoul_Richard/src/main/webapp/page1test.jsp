<%-- 
    Document   : page1
    Created on : Jan 20, 2020, 5:53:56 PM
    Author     : rrobilla
--%>
<%@page import="entities.Produit"%>
<%@page import="java.util.ArrayList"%>
<%
    ArrayList<Produit> produits = (ArrayList<Produit>) request.getAttribute("listProducts");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        <table>
            <tr>
                <th>id</th>
                <th>nom</th>
                <th><a href="servletControler?idCategorie=2">dfgbnfh</a></th>
            </tr>
          <%for(Produit p:produits) {%>
          <tr>
              <td><%=p.getId()%></td>
              <td><%=p.getNom()%></td>
              <%}%>
          </tr>
        </table>
        
        
    </body>
</html>
