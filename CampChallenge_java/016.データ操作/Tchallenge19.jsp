<%-- 
    Document   : Tchallenge19
    Created on : 2018/02/23, 11:19:59
    Author     : ibuka kentaro
--%>

<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("UTF-8");
            String name = request.getParameter("txtName");
            String gender = request.getParameter("gender");
            String hobby = request.getParameter("mulText");

            out.println("名前:"+ name);
            out.println("性別:"+ gender);
            out.println("趣味:"+ hobby);

        %>
    </body>
</html>
