 Projeto-MODULO_33
 Projeto de Gerenciamento de Carros - Spring Boot

Este é um projeto de exemplo em Spring Boot que gerencia Carros, Marcas e Acessórios, utilizando Spring Data JPA para persistência de dados.
 Funcionalidades
- Cadastro de Marcas
- Cadastro de Carros (associados a uma Marca)
- Cadastro de Acessórios
- Associação de múltiplos Acessórios a um Carro
 Tecnologias Utilizadas
- Java 17
- Spring Boot 3.2.5
- Spring Data JPA / Hibernate
- Maven
- PostgreSQL (conectado a um banco de dados na nuvem - Neon)

 Como Executar
1. Clone o repositório.
2. Configure as variáveis de banco de dados no arquivo `src/main/resources/application.properties`.
3. Execute o comando na raiz do projeto: `mvn spring-boot:run`.
4. A aplicação estará disponível em `http://localhost:8081`.
