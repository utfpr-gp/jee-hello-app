<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:template title="Tela Inicial">
    <jsp:body>
        <h1>Minha Tela Inicial</h1>

        <a href="hello-servlet">Alô Mundo!</a>
        <a href="calculadora-idade">Calculadora de Idade!</a>

    </jsp:body>
</t:template>