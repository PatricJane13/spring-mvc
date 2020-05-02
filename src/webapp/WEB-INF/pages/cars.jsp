<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>${title}</title>
</head>

<body>

<table width="50%" border="1" cellpadding="8">
    <caption align="center"><h1>${title}</h1></caption>
    <tr>
        <td><c:out value="Name"/></td>
        <td><c:out value="Model"/></td>
        <td><c:out value="Series"/></td>
    </tr>
    <c:forEach items="${messages}" var="message">
        <tr>
            <td><c:out value="${message.name}"/></td>
            <td><c:out value="${message.model}"/></td>
            <td><c:out value="${message.series}"/></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>