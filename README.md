
# **Aplicação Web com Java Spring Boot** 

## **Descrição do Projeto**

Esta aplicação web foi desenvolvida com Java Spring Boot e integra funcionalidades essenciais para a gestão de usuários. O sistema oferece uma interface amigável e responsiva, criada com o framework Bootstrap (HTML e CSS), e utiliza o banco de dados MySQL para o armazenamento das informações.


## Funcionalidades Principais

1. **Página de Tema:** Uma interface inicial personalizada para apresentação do projeto.
2. **Cadastro de Usuário:** Permite o registro de novos usuários no sistema.
3. **Login:** Autenticação segura para acesso ao sistema.
4. **Gestão Administrativa:**
   + Listagem de todos os usuários cadastrados.
   + Exclusão de usuários existentes.
5. **APIs REST:**
   + GET: Recupera informações de usuários.
   + POST: Adiciona novos usuários ao sistema.
   + PUT: Atualiza informações de usuários.
   + DELETE: Remove usuários existentes

**Tecnologias Utilizadas**

   + Backend: Java Spring Boot.
   + Frontend: HTML, CSS e Bootstrap.
   + Banco de Dados: MySQL.

**Estrutura do Projeto**

1. **Controladores (Controllers):**
   - Implementam as APIs REST utilizando os métodos HTTP (GET, POST, PUT, DELETE).
2. **Serviços (Services):**
   + Contêm a lógica de negócio da aplicação.
3. **Repositórios (Repositories):**
   + Gerenciam a comunicação com o banco de dados usando Spring Data JPA.
4. **Modelos (Entities):**
   + Representam as entidades do banco de dados (ex.: Usuários).
5. **Configurações de Segurança:**
   + Implementadas com Spring Security para autenticação e controle de acesso.












