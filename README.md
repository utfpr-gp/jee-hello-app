# jee-hello-app

# Checklist

- [ ] Encaminhamento e redirecionamento
  - [ ] Usar encaminhamento fora do modelo MVC (i.e. um servlet encaminhando a requisição para outro servlet). A dica é dividir um processamento complexo em duas etapas, ou seja, em dois servlets.
  - [ ] Usar redirecionamento depois de requisições POST de um formulário para evitar o reenvio destes dados ao atualizar a página com F5.
  - [ ] Para uma mesma rota de um Servlet, usar doGet para encaminhar a uma página e doPost para recuperar os dados da página/formulário
- [ ] Escopo de requisição, sessão e aplicação
- [ ] Cookies
  - [ ] Cookie que dura apenas uma sessão do navegador
  - [ ] Cookie com tempo de vida customizado além de uma sessão do navegador
- [ ] Controle de erros e exceção via web.xml
    - [ ] Tratamento por código de status ou exceção específica
    - [ ] Tratamento de erros genérico
- [ ] Expression Language (EL) para acessar os objetos de domínio (beans) da camada de modelo do MVC
- [ ] JSTL e TagLib
  - [ ] forEach
  - [ ] if
  - [ ] Template com cabeçalho e rodapé
- [ ] JavaScript
    - [ ] Requisição AJAX
    - [ ] Armazenamento no LocalStorage
    - [ ] Uso de plugin JQuery
- [ ] JPA
    - [ ] No mínimo 4 entidades, contabilizando as entidades User e Role, se houverem.
    - [ ] Operações de CRUD. 
  
