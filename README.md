# JavaAPI-REST-SpringBoot
Curso sobre um sistema para o gerenciamento de pessoas de uma empresa através de uma API REST, criada com o Spring Boot.

Passos:
Setup inicial de projeto com o Spring Boot Initialzr

Necessario que sejam feitas algumas configuracoes no Intellij
File -> Project Structure(que possui toda a configuracao e estrutura do projeto) -> SDKs -> 11(clica no + e seleciona o caminho)
-> Project(seleciona o 11)
No botao Run selecionar Edit Configurations -> botao + nova application, clicar PersonapiApplication como main

Criação de modelo de dados para o mapeamento de entidades em bancos de dados
pasta entity
O import da biblioteca lombok @Data permite que nao seja necessario gerar os getters and setters

Desenvolvimento de operações de gerenciamento de usuários (Cadastro, leitura, atualização e remoção de pessoas de um sistema).
Relação de cada uma das operações acima com o padrão arquitetural REST.
Desenvolvimento de testes unitários para validação das funcionalidades
Implantação do sistema na nuvem através do Heroku

Para executar o projeto no terminal, digite o seguinte comando:
```
 mvn spring-boot:run
``` 
Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/api/v1/people
```
