<%-- 
    Document   : challenge1-10
    Created on : 2017/12/06, 17:01:15
    Author     : ibuka kentaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <h1>課題10</h1>
    <body>
<%@ page import="java.util.HashMap" %> 
<%
HashMap<String, String>prof =new HashMap<String, String>();

prof.put("1","AAA");
prof.put("hello", "world");
prof.put("soeda" ,"33");
prof.put("20", "20");

out.println("1:"+prof.get("1"));
out.println("hello:"+prof.get("hello"));
out.println("soeda:"+prof.get("soeda"));
out.println("20:"+prof.get("20"));

%>
        
    </body>
</html>
