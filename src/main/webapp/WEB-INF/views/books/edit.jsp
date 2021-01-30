<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Edit book</title>
</head>
<body>
<form:form method="post" modelAttribute="book">
    <p>
        ISBN: <form:input path="isbn"/>
        <form:errors path="isbn"/>
    </p>
    <p>
        Title: <form:input path="title"/>
        <form:errors path="title"/>
    </p>
    <p>
        Author: <form:input path="author"/>
        <form:errors path="author"/>
    </p>
    <p>
        Publisher: <form:input path="publisher"/>
        <form:errors path="publisher"/>
    </p>
    <p>
        Type: <form:input path="type"/>
        <form:errors path="type"/>
    </p>
    <p><input type="submit"></p>
</form:form>
</body>
</html>
