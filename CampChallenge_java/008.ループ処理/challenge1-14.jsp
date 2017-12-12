<%-- 
    Document   : challenge1-14
    Created on : 2017/12/12, 14:21:30
    Author     : ibuka kentaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <h1>課題14</h1>
    <body>
    <%
   
    int key = 1000; 
   
    int count = 0;   
    
    while( key >= 100  ) {
    key = key / 2;
    count++;
    {
      
    out.println(count); 

    }

    }
 
     %>  
  </body>
</html>
