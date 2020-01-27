<%-- 
    Document   : loginSignUp
    Created on : Jan 27, 2020, 11:52:40 AM
    Author     : rrobilla
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%String val = (String)request.getAttribute("val");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="userControler">
            <legend name="login">
                Username <input type="text" name="username"/></br>
                Password <input type="text" name="pwd"/></br>
                <input type="submit"/></br>               
        </form>
        <%if(val=="0") {%>
            username ou password incorrect
            <%}%>
    </body>
</html>
