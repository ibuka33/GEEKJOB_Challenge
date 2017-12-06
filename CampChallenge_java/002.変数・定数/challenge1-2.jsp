<%-- 
    Document   : challenge1-2
    Created on : 2017/12/04, 16:47:09
    Author     : ibuka kentaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <h1>課題2</h1>
    <body>
        <%
String name=("井深");
int age=28;
out.print("こんにちは！");

out.print("私は");
out.print(name);
out.print("です。");
out.print("年齢は");
out.print(age);
out.print("歳です。");
%>
       
    </body>
</html>
