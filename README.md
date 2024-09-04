# Projeto Desafio TG

## Descrição

Este projeto foi desenvolvido como parte de um teste com desafios proposto pela Target Sistemas. O objetivo do teste era aplicar conhecimentos técnicos em programação para resolver problemas específicos, demonstrando habilidades em manipulação de dados, lógica de programação.

## Configuração do Ambiente

### Adicionando o GSON ao Projeto

Para resolver uma das questões do projeto, que envolvia a manipulação de dados no formato JSON, foi necessário adicionar a biblioteca GSON ao projeto. Decidi não utilizar o Maven para gerenciar as dependências e, em vez disso, incluí manualmente o JAR do GSON no projeto. Segui os seguintes passos para isso, usando o IntelliJ IDEA:

1. **Download do JAR do GSON**:
   - Fiz o download da biblioteca GSON diretamente do [site oficial do Maven Central](https://search.maven.org/).
   - O arquivo baixado foi o `gson-2.9.1.jar`, onde `2.9.1` representa a versão da biblioteca.

2. **Adição do JAR ao Projeto**:
   - No IntelliJ IDEA, naveguei até o menu `File` > `Project Structure`.
   - Dentro da aba `Modules`, selecionei o módulo do projeto em que a biblioteca seria adicionada.
   - Cliquei na aba `Dependencies` e utilizei o botão `+` para adicionar a dependência.
   - Selecionei a opção `JARs or directories` e naveguei até o local onde o arquivo `gson-2.9.1.jar` foi salvo.
   - Confirmei a adição e a biblioteca GSON foi integrada ao projeto.

3. **Verificação**:
   - Para garantir que a biblioteca foi adicionada corretamente, verifiquei se o IntelliJ reconheceu as classes e métodos do GSON, e rodei os testes necessários para validar a integração.

## Como Executar o Projeto

1. Clone este repositório.
2. Importe o projeto no IntelliJ IDEA.
3. Certifique-se de que todas as dependências estão corretamente configuradas.
4. Execute a aplicação a partir da classe principal ou utilizando as configurações de execução disponíveis.
