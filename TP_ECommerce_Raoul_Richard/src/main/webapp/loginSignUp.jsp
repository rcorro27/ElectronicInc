<%-- 
    Document   : loginSignUp
    Created on : Jan 27, 2020, 11:52:40 AM
    Author     : rrobilla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%String val = (String) request.getAttribute("val");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <fieldset>
            <form action="userControler">
                <legend name="login">
                    <p>Username <input type="text" name="username"/></p>
                    <p>Password <input type="text" name="pwd"/></p>
                    <input type="submit"/></br>               
            </form>
        </fieldset>
        <br/>
        <br/>
        <br/>
        <br/>

        <fieldset>
            <form action="userControler">
                <legend name="register">
                    <p>Username <input type="text" name="username"/></p>
                    <p>Password <input type="text" name="pwd"/></p>
                    <p>Prenom <input type="text" name="prenom"/></p>
                    <p>Nom <input type="text" name="nom"/></p>
                    <p>Adresse <input type="text" name="adresse"/></p>
                    <p>Email <input type="text" name="email"/></p></p>
                    <p>Client <input type="radio" name="type_user" value="client" checked> </p>
                    <p> Vendeur   <input type="radio" name="type_user" value="vendeur"></p>

                    <input type="submit"/></br>               
            </form>
        </fieldset>
        <%if (val == "0") {%>
        username ou password incorrect
        <%}%>
    </body>
</html>
