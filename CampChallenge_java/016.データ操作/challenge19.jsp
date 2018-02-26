<%-- 
    Document   : challenge19
    Created on : 2018/02/20, 15:52:00
    Author     : ibuka kentaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./Tchallenge19.jsp" method="post"></p>

        <p>名前:<br>
            <input type="text" name="txtName"></p>

        <p>性別:<br>
            <input type="radio" name="gender" value="男性">男性
            <input type="radio" name="gender" value="女性">女性</p>

        <p>趣味:<br>
            <textarea name="mulText"></textarea></p>


        <input type="submit" name="btnSubmit">


    </form>
</body>
</html>
