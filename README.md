# API REST

## Getting Started
Pré-requisitos:
* [MongoDB](www.mongodb.com)
* [Postman](https://www.getpostman.com/apps)
 

Para executar a API clone o repositório com o comando:
```sh
git clone https://github.com/feliperj97/desafioRest
```
**No arquivo `application.properties` configurar a conexão com o banco de dados**
## Tecnologias utilizadas
* `MongoDB`
* `SpringBoot`
* `Java`
## EndPoints
- GET /api/planetas - Lista todos os planetas
- GET /api/planeta/{codigo} - Lista um planeta buscando pelo codigo
- GET /api/planeta/search=nome - Busca planeta pelo nome
- POST /api/planetas - Adiciona um planeta
- PUT /api/planeta - Atualiza um planeta
- DELETE /api/planeta/ - Deleta planeta
- DELETE /api/planeta/{codigo} - Deleta planeta pelo ID

### ToDos

 - Implementar SWAPI
