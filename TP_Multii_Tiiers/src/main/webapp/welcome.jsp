<%--
  Created by IntelliJ IDEA.
  User: Levono
  Date: 03/03/2022
  Time: 08:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% String name=request.getParameter("uname");
       out.print ("welcome " +name);%>

    <% response.sendRedirect("http://www.google.com"); %>
</body>
</html>
