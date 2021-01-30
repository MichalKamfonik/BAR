<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Show book</title>
</head>
<body>
<p>ISBN: ${book.isbn}</p>
<p>Title: ${book.title}</p>
<p>Author: ${book.author}</p>
<p>Publisher: ${book.publisher}</p>
<p>Type: ${book.type}</p>
<p><a href="<c:url value="/admin/books/all"/> ">Back to list books list</a></p>
</body>
</html>
