# TODO

- Endpoints
  - Criar cotação (/stock)
  - Devolver cotação pelo ID (/stock/{id})
  - Listar cotações (/stock/all)

- Deverá ter um outro docker para registrar as empresas registradas, o docker de criação de cotação deverá consultar este para validar uma nova cotação criada

- Modelo de dados

```
stock (ação)
--
id
name

stockquote (cotação de ação)
--
id
stock: stock
date
value
```


- Outros
  - Redis
  - Dockerizar
