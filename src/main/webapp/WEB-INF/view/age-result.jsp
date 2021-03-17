<%--
  Created by IntelliJ IDEA.
  User: ronifabio
  Date: 03/03/2021
  Time: 18:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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

</body>
</html>
