<%-- 
    Document   : challenge1-3
    Created on : 2017/12/05, 15:31:18
    Author     : ibuka kentaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
             <h1>課題3</h1>
    <body>
        <%
     final int BASE = 7;
int num = 5;
int tasu = BASE + num;
int hiku = BASE - num;
int kake = BASE * num;
int wari = BASE / num;
int amari = BASE % 3;

out.print("BASEとnumの足し算は"+(tasu)+"です。");

out.print("BASEとnumの引き算は"+(hiku)+"です。");

out.print("BASEとnumの掛け算は"+(kake)+"です。");

out.print("BASEをnumで割った時の商は"+(wari)+"です。");

out.print("BASEをnumで割った時の余りは"+(amari)+"です。");

    %>
    </body>
</html>
