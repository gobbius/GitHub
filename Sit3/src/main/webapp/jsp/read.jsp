<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : read
    Created on : May 26, 2015, 8:26:07 PM
    Author     : notepad
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
    <c:forEach var="elem" items="${listTable}">
        <p>${elem.id}</p>
        <p>${elem.lastName}</p>
        <p>${elem.name}</p>
        <p>${elem.surName}</p>
    </c:forEach>
    </body>
</html>
