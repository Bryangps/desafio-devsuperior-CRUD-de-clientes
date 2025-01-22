# Desafio do curso devsuperior CRUD de clientes

# Sobre o projeto

O sistema deve manter um cadastro de usuário, produtos e suas categorias. Cada
usuário possui nome, email, telefone, data de nascimento e uma senha de acesso. Os
dados dos produtos são: nome, descrição, preço e imagem. O sistema deve apresentar
um catálogo de produtos, os quais podem ser filtrados pelo nome do produto. A partir
desse catálogo, o usuário pode selecionar um produto para ver seus detalhes e para
decidir se o adiciona a um carrinho de compras. O usuário pode incluir e remover itens
do carrinho de compra, bem como alterar as quantidades de cada item. Uma vez que o
usuário decida encerrar o pedido, o pedido deve então ser salvo no sistema com o status
de "aguardando pagamento". Os dados de um pedido são: instante em que ele foi salvo,
status, e uma lista de itens, onde cada item se refere a um produto e sua quantidade no
pedido. O status de um pedido pode ser: aguardando pagamento, pago, enviado,
entregue e cancelado. Quando o usuário paga por um pedido, o instante do pagamento
deve ser registrado. Os usuários do sistema podem ser clientes ou administradores,
sendo que todo usuário cadastrado por padrão é cliente. Usuários não identificados
podem se cadastrar no sistema, navegar no catálogo de produtos e no carrinho de
compras. Clientes podem atualizar seu cadastro no sistema, registrar pedidos e visualizar
seus próprios pedidos. Usuários administradores tem acesso à área administrativa onde
pode acessar os cadastros de usuários, produtos e categorias. 

## Modelo conceitual
![image](https://github.com/user-attachments/assets/fef59f0b-5ed9-441d-a3cf-1275774202c1)


# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Bean Validation
- Maven
- H2
- OAuth2
- JWT
- 
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
