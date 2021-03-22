<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:template title="Formulário">
    <jsp:body>

        <h1>Calculadora de Idade</h1>
        <form action="calculadora-idade" method="post">
            Nome: <input type="text" name="name">
            Ano de Nascimento: <input type="text" name="year" id="input-year">
            Estado: <select id="select-state" class="browser-default">
            <option value="" disabled selected>Escolha um estado</option>
            </select>
            Cidade: <select id="select-city" class="browser-default">
            <option value="" disabled selected>Escolha uma cidade</option>
        </select>
            <p></p>
            <button>Enviar</button>
        </form>
        <script>
            window.onload =  function (){
                //plugin https://igorescobar.github.io/jQuery-Mask-Plugin
                $('#input-year').mask('0000');

                //ajax get para listar estados
                $.get('states', function(data) {
                    let $select = $('#select-state');

                    $.each(data, function(index, item) {
                        $('<option>').val(index).text(item).appendTo($select);
                    });
                });

                //evento de seleção de estado no select
                $('#select-state').change(function (){
                    //parâmetro a ser enviado
                    let params = {
                        estado: $(this).find(':selected').text()
                    }
                    //armazenamento no localstorage
                    localStorage.setItem('state', params.estado);

                    //busca das cidades por estado
                    $.get('cities', $.param(params), function (data){
                        let $select = $('#select-city');
                        $select.html('');
                        $.each(data, function(index, item) {
                            $('<option>').val(index).text(item).appendTo($select);
                        });
                    })
                });
                //persiste no localstorage a cidade selecionadda
                $('#select-city').change(function (){
                    localStorage['city'] = $(this).find(':selected').text();
                });
            }
        </script>
    </jsp:body>
</t:template>