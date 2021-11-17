<%@ page import="ru.gb.entity.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: ilavinogradov
  Date: 18.11.2021
  Time: 01:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
    <% List<Product> list = (List<Product>) request.getAttribute("list");
        for (Product product : list){%>
        <h3>product: <%=product.getTitle()%>; ID: <%=product.getId()%>; cost: <%=product.getCost()%>; </h3>
    <hr>
    <% };%>
</body>
</html>
