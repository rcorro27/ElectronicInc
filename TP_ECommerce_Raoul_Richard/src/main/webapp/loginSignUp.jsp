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
        <title>Login/Register</title>
        <link href="css_richard.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        
            <fieldset>
                <legend name="login">Login</legend>
                <form action="userControler">
                    <p>Username <input type="text" name="username"/></p>
                    <p>Password <input type="text" name="pwd"/></p>
                    <p><input type="submit"/></br></p>               
                </form>
            </fieldset>
        
        <br/>
        <br/>
        <br/>
        <br/>
        
            <fieldset>
                <legend name="register"> Register </legend>
                <form action="userControler">
                    <p>Username <input type="text" name="username"/></p>
                    <p>Password <input type="text" name="pwd"/></p>
                    <p>Prenom   <input type="text" name="prenom"/></p>
                    <p>Nom      <input type="text" name="nom"/></p>
                    <p>Adresse  <input type="text" name="adresse"/></p>
                    <p>Email    <input type="text" name="email"/></p></p>
                    <p>Client   <input type="radio" name="type_user" value="client" checked> </p>
                    <p>Vendeur <input type="radio" name="type_user" value="vendeur"></p>
                    <p> <input type="submit"/></br></P>               
                </form>
            </fieldset>
        
        <%if (val == "0") {%>
        username ou password incorrect
        <%}%>
    </body>
</html>
