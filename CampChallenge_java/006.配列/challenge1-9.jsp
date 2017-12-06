<%-- 
    Document   : challenge1-9
    Created on : 2017/12/06, 16:53:41
    Author     : ibuka kentaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   <h1>課題9</h1>
    <body>
        <%
String[] data = {"10", "100", "soeda", "hayashi", "-20", "118", "END"};
   
data[3]="33";       
out.print(data[3]);
   %>     
    </body>
</html>
