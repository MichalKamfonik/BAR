<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Delete book</title>
</head>
<body>
<p>Are you sure you want to delete this book?</p>
<p>ISBN: ${book.isbn}</p>
<p>Title: ${book.title}</p>
<p>Author: ${book.author}</p>
<p>Publisher: ${book.publisher}</p>
<p>Type: ${book.type}</p><br>
<form method="post">
    <input type="submit" name="choice" value="Yes">
    <input type="submit" name="choice" value="No">
</form>
</body>
</html>
