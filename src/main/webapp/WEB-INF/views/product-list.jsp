<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Danh sách sản phẩm</h1>
<c:forEach items="${products}" var="product" >
    <p>${product.productName}</p>
</c:forEach>
</body>
</html>