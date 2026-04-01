# 📌 Projeto CRUD com Java Servlet

## 👩‍💻 Integrantes

* Nayara Pereira
* Alisson Ramos

---

## 📖 Descrição do Projeto

Este projeto consiste no desenvolvimento de uma aplicação web utilizando **Java Servlet**, com o objetivo de implementar um sistema CRUD (Create, Read, Update e Delete).

A aplicação permite o gerenciamento de funcionários, possibilitando:

* Cadastro de novos funcionários
* Visualização da lista de funcionários
* Exclusão de registros

---

## 🛠️ Tecnologias Utilizadas

* Java
* Servlet (Javax)
* HTML
* MySQL
* JDBC
* Apache Tomcat

---

## 🗄️ Estrutura do Banco de Dados

Banco de dados: **swii5**

Tabela: **user905**

Campos:

* id (INT, AUTO_INCREMENT, PRIMARY KEY)
* name (VARCHAR)
* password (VARCHAR)
* email (VARCHAR)
* country (VARCHAR)

---

## ⚙️ Funcionalidades

### ✅ Create (Criar)

Permite cadastrar novos funcionários através de um formulário HTML.

### ✅ Read (Ler)

Exibe a lista completa de funcionários cadastrados no banco de dados.

### ✅ Delete (Excluir)

Permite remover um funcionário do banco de dados.

---

## ▶️ Como Executar o Projeto

1. Importar o projeto na IDE (Eclipse ou IntelliJ)
2. Configurar o servidor Apache Tomcat
3. Criar o banco de dados no MySQL:

```sql
CREATE DATABASE swii5;
```

4. Criar a tabela:

```sql
CREATE TABLE user905 (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    password VARCHAR(100),
    email VARCHAR(100),
    country VARCHAR(50)
);
```

5. Configurar usuário e senha do banco no arquivo `EmpDao.java`
6. Executar o projeto no servidor

---

## 🧪 Testes

Foram realizados testes com dados fictícios para validar:

* Cadastro de funcionários
* Listagem correta
* Exclusão de registros

---

## 📸 Evidências

Foram incluídos no projeto:

* Print da tabela no banco de dados
* Print da listagem de funcionários no sistema

---

## 📌 Considerações Finais

O projeto atingiu o objetivo proposto, demonstrando na prática a utilização de Servlets para manipulação de dados em um banco relacional.

A aplicação CRUD é essencial no desenvolvimento de sistemas, sendo amplamente utilizada no mercado.



