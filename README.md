# FórumHub - Challenge Back End Alura

API REST desenvolvida em Java com Spring Boot para o gerenciamento de tópicos de um fórum.

## 🛠️ Tecnologias Utilizadas
* **Java 17**
* **Spring Boot 3**
* **Maven**
* **MySQL** (Persistência)
* **Flyway** (Migrations)
* **Spring Security & JWT** (Autenticação)

## 🚀 Como Rodar o Projeto
1. Clone este repositório.
2. Certifique-se de ter o **MySQL** instalado e rodando.
3. Crie um banco de dados (schema) chamado `forumhub`.
4. No arquivo `src/main/resources/application.properties`, atualize as propriedades `spring.datasource.username` e `spring.datasource.password` com suas credenciais locais.
5. Execute a aplicação via IntelliJ ou comando `./mvnw spring-boot:run`.

## 📌 Funcionalidades (CRUD)
* `POST /login`: Autenticação de usuários.
* `POST /topicos`: Cadastro de novo tópico (Requer Token).
* `GET /topicos`: Listagem paginada e ordenada.
* `GET /topicos/{id}`: Detalhamento de um tópico específico.
* `PUT /topicos/{id}`: Atualização de dados.
* `DELETE /topicos/{id}`: Remoção de tópicos.

## 🔑 Autenticação
A API utiliza **Stateless Authentication** com Tokens JWT. Para acessar os endpoints de tópicos, é necessário enviar o Header:
`Authorization: Bearer <seu_token_aqui>`
