<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:template title="Formulário">
    <jsp:body>
        <form action="calculadora-idade" method="post">
            Nome: <input type="text" name="name">
            Ano de Nascimento: <input type="text" name="year">
            <button>Enviar</button>
        </form>

    </jsp:body>
</t:template>