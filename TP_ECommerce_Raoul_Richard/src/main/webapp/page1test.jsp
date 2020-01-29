<%-- 
    Document   : page1
    Created on : Jan 20, 2020, 5:53:56 PM
    Author     : rrobilla
--%>
<%@page import="entities.User"%>
<%@page import="entities.Photos"%>
<%@page import="entities.Categorie"%>
<%@page import="entities.Produit"%>
<%@page import="java.util.ArrayList"%>
<%
    ArrayList<Produit> produits = (ArrayList<Produit>) request.getAttribute("listProducts");
    ArrayList<Categorie> categories = (ArrayList<Categorie>) request.getAttribute("categories");
    User u = (User) request.getSession().getAttribute("user");
    String idProduit = null;

%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
        <link rel="stylesheet" type="text/css" href="pagePrincipale.css">
        
    </head>
    <body>
        <header>
            <img src="images/Technology_settings-08-512.png" alt="logo" style="width:10%">
            <div class="vertical-center"> <b><sup><span style="font-size:32px;font-family: JuneBug3;">Electronik INC.&copy;</span></sup></b>
            </div>
            <div class="right">
                <a href="http://www.facebook.com"><img src="images/download.png" alt="facebook" width="32"></a>
                <a href="http://www.twitter.com"><img src="images/twitter.png" alt="twitter" width="32"></a>
                <a href="http://www.instagram.com"><img src="images/instagram.png" alt="insta" width="32"></a></br></br></br></br></br>
                    <%if (u != null) {
                            out.println("Bonjour " + u.getUsername() + " <a href=\"loginControler\">Logout</a>");
                        } else {%>
                <a href="loginControler">Login/SignUp</a>
                <%}%><br/>
                <a href="panierControler?lien=1&idProduit=<%=idProduit%>">Votre panier</a>

            </div>
        </header>

        <ul style="list-style-type:none">
            <li><a href="servletControler" class="active">All</a></li>
                <%for (Categorie c : categories) {%>
            <li><a href="servletControler?idCategorie=<%=c.getId()%>"><%=c.getNom()%></a></li>
                <%}%>
        </ul>

        <%for (Produit p : produits) {%>

        <%idProduit = String.valueOf(p.getId());%>
        <div>
            <h3><%=p.getProduit_name() + "  " + p.getPrix() + "$"%></h3>
            <a href="produitControler?id=<%=p.getId()%>"><img src="images/<%=p.getUrl_image()%>" alt="" width="400px"/></a></td>
    </div>


    <%}%>


    <footer>
        <div id='divfooterleft'><img src="images/Technology_settings-08-512.png" alt="logo" style="width:32px;">
            <b><sup><span style="font-size:25px;">Electronik INC.&copy;</span></sup></b><br><br>
            <a href="tel:5551234567"><img src="icones/phonesquare512.png" alt="phone" width="20">555-1234567</a><br><br>
            <a href="mailto:raoul_robillard@hotmail.com"><img src="icones/mailblack512.png" alt="mail" width="20">raoul_robillard@hotmail.com</a><br><br>
            <img src="icones/pin9512.png" alt="address" width="20">1234 Blv. Papineau<br>
            <img src="icones/capture1.png" alt="address" width="20">Mtl, QC, H1X 2K5
        </div>
        <div id='divfooter'><h2 style='padding-top:20px;'>Horaire</h2>
            <ul style="list-style-type:none;">
                <li>Lun: 8h00 a 21h00</li>
                <li>Mar: 8h00 a 21h00</li>
                <li>Mer: 8h00 a 21h00</li>
                <li>Jeu: 8h00 a 21h00</li>
                <li>Ven: 8h00 a 21h00</li>
                <li>Sam: 8h00 a 17h00</li>
                <li>Dim: 8h00 a 17h00</li>
            </ul></div>
        <div class="right"><br>
            <p>Raoul et Richard&copy; <br>
                <a href="#">Back to top&nbsp;</a></p></div>



    </footer>


</body>
</html>
