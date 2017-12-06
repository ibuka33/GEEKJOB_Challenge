<%-- 
    Document   : challenge1-7
    Created on : 2017/12/06, 14:53:22
    Author     : ibuka kentaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   <h1>課題7</h1>
    <body>
    <%  
    char a;  
     switch('a'){
         case ('A'):
     out.print("英語");
     break;
     
         case ('あ'):
     out.print("日本語");
     break;  }
       %> 
        </body>
</html>
