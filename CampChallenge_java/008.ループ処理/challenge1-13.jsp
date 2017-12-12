<%-- 
    Document   : challenge1-13
    Created on : 2017/12/12, 15:02:40
    Author     : ibuka kentaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <h1>課題13</h1>
    <body>
    <%
       
    int total= 0;

    for(int i = 1; i<= 100; i++) {
    total = total + i;
    }
    out.print(total);  
     %>
    </body>
</html>
