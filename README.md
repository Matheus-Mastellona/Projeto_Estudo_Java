# Java Projetos

Este repositório contém materiais e códigos desenvolvidos durante o curso de Java que estou fazendo, que abrange desde os fundamentos da linguagem até tópicos avançados e projetos práticos.

## Conteúdo do Curso

- **Fundamentos da Linguagem Java**: Sintaxe básica, tipos de dados, operadores e estruturas de controle.
- **Programação Orientada a Objetos (POO)**: Classes, objetos, herança, polimorfismo, encapsulamento e abstração.
- **Programação Funcional**: Uso de expressões lambda e Stream API.
- **Banco de Dados**:
  - **MySQL**: Conceitos de bancos de dados relacionais e integração com Java.
  - **MongoDB**: Introdução a bancos de dados NoSQL e sua utilização com Java.
- **Frameworks e Bibliotecas**:
  - **Spring Boot**: Desenvolvimento de aplicações web e microservices.
  - **JavaFX**: Criação de interfaces gráficas modernas.
  - **JPA (Hibernate)**: Mapeamento objeto-relacional e persistência de dados.
- **Projetos Práticos**: Desenvolvimento de aplicações reais para consolidar o aprendizado.

## Estrutura do Repositório
- `Aprendizado`
  - `src/`: Contém os códigos-fonte organizados por módulos e temas abordados no curso.
  - `resources/`: Arquivos de apoio, como scripts SQL e outros recursos utilizados nos projetos.
  - `docs/`: Documentações adicionais e anotações relevantes.
- `campo-minado`
  - `src/`: Contém os códigos-fonte organizados por pacotes e classes.
    - ``br/com/mastelloni/cm/``: Pacote principal do jogo, contendo as classes relacionadas à lógica do campo minado.
    - ``CampoMinado.java``: Classe principal que executa o jogo.
    - ``Tabuleiro.java``: Classe que representa o tabuleiro do jogo.
    - ``Celula.java``: Classe que representa cada célula do tabuleiro.
    - ``bin/``: Diretório onde os arquivos compilados (.class) são armazenados após a compilação.
  - ``lib/``: Contém bibliotecas externas utilizadas no projeto.
    - ``lib/``: Bibliotecas adicionais necessárias para a execução do jogo.
      - ``biblioteca.jar``: Exemplo de biblioteca externa.
  - ``test/``: Contém os testes automatizados do projeto.
    - ``br/com/mastelloni/cm/``: Pacote de testes relacionados à lógica do campo minado.
      - ``CampoMinadoTest.java``: Testes para a classe CampoMinado.
      - ``TabuleiroTest.java``: Testes para a classe Tabuleiro.
      - ``CelulaTest.java``: Testes para a classe Celula.
            etc.
  - ``.vscode/``: Configurações específicas do Visual Studio Code para o projeto.
      - ``settings.json``: Configurações do editor para o projeto.
      - ``launch.json``: Configurações de depuração.
