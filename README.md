# Desafio do curso devsuperior CRUD de clientes

# Sobre o projeto

Projeto Spring Boot contendo um CRUD completo de web services REST para
acessar um recurso de clientes, contendo as cinco operações básicas:
- Busca paginada de recursos
- Busca de recurso por id
- Inserir novo recurso
- Atualizar recurso
- Deletar recurso

São tratadas as seguintes exceções: 
- Id não encontrado (para GET por id, PUT e DELETE), retornando código 404.
- Erro de validação, retornando código 422 e mensagens customizada para cada campo inválido. As
regras de validação são:
  - Nome: não pode ser vazio
  - Data de nascimento: não pode ser data futura 

## Modelo conceitual
![image](https://github.com/user-attachments/assets/4edcede8-a358-486c-8f87-2a264123953a)


# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Bean Validation
- Maven
- H2
# Como executar o projeto

## Back end
Pré-requisitos: Java 21

```bash
# clonar repositório
git clone git@github.com:Bryangps/desafio-devsuperior-CRUD-de-clientes.git

# entrar na pasta do projeto back end
cd D:\Java_Geral\...

# abra o projeto no Intellij

# executar o projeto
./mvnw spring-boot:run
ou
Run da IDE
```
