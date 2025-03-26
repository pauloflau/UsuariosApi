# UsuariosAPI - Autenticacao e Integracao com API de Produtos

Este repositório contém a implementação de uma **API de usuários** que lida com o processo de **criação** e **autenticação** de usuários. A API foi construída para ser integrada com a uma **API de produtos**, permitindo que o front-end em **Angular** interaja com ambas as APIs para gerenciar e manipular produtos após a autenticação.

## Estrutura do Projeto

Este projeto é dividido em duas partes principais:

- **API de Usuários** (Responsável pela criação e autenticação de usuários)
- **API de Produtos** (Já existente, utilizada para manipulação de produtos)

## Funcionalidades
A API de usuários oferece as seguintes funcionalidades:

- **Criação de usuários** (POST /api/usuarios/register)
- **Autenticação de usuários** (POST /api/usuarios/login)

##Funcionalidade de Integração com a API de Produtos
Após o login bem-sucedido, a API de usuários gera um **token JWT** (JSON Web Token) que é utilizado para autenticar requisições subsequentes à API de produtos. O front-end Angular pode utilizar este token para interagir com a API de produtos, realizando operações como **criação, leitura, atualização e exclusão de produtos**.

## Tecnologias Utilizadas
- **Java 17+**
- **Spring Boot 3.x**
- **Spring Web**
- **Spring Data JPA**
- **JWT (para autenticacao)**
- **Banco de Dados Relacional** (ex: MySQL, PostgreSQL, H2)
- **Angular 12+** (Frontend)

## Pré-requisitos
Antes de rodar a aplicação, certifique-se de ter instalado:
- [JDK 17+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [Postman](https://www.postman.com/downloads/)
- Banco de Dados configurado (MySQL, PostgreSQL ou H2)

## Configuração do Banco de Dados (H2)

1. Configure as credenciais no `application.properties`:
   ```properties
   # Configuração do banco de dados H2 (em memória)
   spring.datasource.url=jdbc:h2:mem:testdb
   spring.datasource.driverClassName=org.h2.Driver
   spring.datasource.username=sa
   spring.datasource.password=password
   spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
   spring.h2.console.enabled=true  # Habilita o console H2 para visualização do banco

   ````

**Nota:** o banco de dados H2 será criado e destruído a cada execução da aplicação.

Caso queira visualizar os dados no banco, você pode acessar o console do H2 diretamente através do seguinte link (quando a aplicação estiver em execução):

[h2-console](http://localhost:8080/h2-console)

**JDBC URL**: jdbc:h2:mem:testdb

**Username**: sa

**Password**: password

## Executando o Projeto
Clone o repositório e navegue até a pasta do projeto:
```sh
git clone https://github.com/pauloflau/UsuariosAPI.git
cd UsuariosAPI
```

Compile e execute a aplicação com:
```sh
mvn spring-boot:run
```
A aplicação estará disponível em: [http://localhost:8080](http://localhost:8080/api)

## Referências
- [Documentação do Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [Documentação do Spring Data JPA](https://docs.spring.io/spring-data/jpa/reference/index.html)
- [Documentação do Spring Security(JWT)](https://docs.spring.io/spring-security/reference/index.html)
- [Documentação do Angular](https://angular.dev/)


## Contribuição
Se você deseja contribuir para o desenvolvimento deste projeto, fique à vontade para abrir uma pull request ou um issue.

## Licença
Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
