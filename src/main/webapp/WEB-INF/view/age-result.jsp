<%--
  Created by IntelliJ IDEA.
  User: ronifabio
  Date: 03/03/2021
  Time: 18:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    A sua idade é ${age}
    <br>
    Data: ${date}
    Dados do usuário: ${user.name} - ${user.age}
    Contador Global: ${counterApplication}
    Contador Sessão: ${counterSession}
    Primeiro usuário: ${users[0].name}

    <h2>Lista de usuário que usaram a calculadora:</h2>
    <c:if test="${not empty users}">
    <ul>
        <c:forEach var="user" items="${users}">
            <li>${user.name} - ${user.age}</li>
        </c:forEach>
    </ul>
    </c:if>
    <c:if test="${empty users}">
        Não há usuários na lista
    </c:if>

</body>
</html>
