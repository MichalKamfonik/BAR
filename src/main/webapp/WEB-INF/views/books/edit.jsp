<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Edit book</title>
</head>
<body>
<form:form method="post" modelAttribute="book">
    <p>ISBN: <form:input path="isbn"/></p>
    <p>Title: <form:input path="title"/></p>
    <p>Author: <form:input path="author"/></p>
    <p>Publisher: <form:input path="publisher"/></p>
    <p>Type: <form:input path="type"/></p>
    <p><input type="submit"></p>
</form:form>
</body>
</html>
