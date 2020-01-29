<%-- 
    Document   : commande
    Created on : Jan 27, 2020, 1:12:58 PM
    Author     : rrobilla
--%>

<%@page import="entities.User"%>
<%@page import="java.util.HashMap"%>
<%@page import="entities.Produit"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%HashMap<Integer, Produit> panier = (HashMap) request.getSession().getAttribute("panier");
    HashMap<Integer, Integer> quantites = (HashMap) request.getSession().getAttribute("quantites");
    User u = (User) request.getSession().getAttribute("user");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css_richard.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" type="text/css" href="headerFooter.css">
        <title>JSP Page</title>
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

            </div>
        </header>
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
        <footer>
            <div id='divfooterleft'><img src="images/Technology_settings-08-512.png" alt="logo" style="width:32px;">
                <b><sup><span style="font-size:25px;">Electronik INC.&copy;</span></sup></b><br><br>
                <a href="tel:5551234567"><img src="images/phonesquare512.png" alt="phone" width="20">555-1234567</a><br><br>
                <a href="mailto:raoul_robillard@hotmail.com"><img src="images/mailblack512.png" alt="mail" width="20">raoul_robillard@hotmail.com</a><br><br>
                <img src="images/pin9512.png" alt="address" width="20">1234 Blv. Papineau<br>
                <img src="images/capture1.png" alt="address" width="20">Mtl, QC, H1X 2K5
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
