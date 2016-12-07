# Projeto Calcular (Aula 12)

Projeto contendo a implementação do projeto proposto na *Aula 11*

[![Quality Gate](https://sonarqube.com/api/badges/gate?key=br.ufg.cs.cleydsonjr:cs20162-aula12)](https://sonarqube.com/dashboard/index?id=br.ufg.cs.cleydsonjr%3Acs20162-aula12)

## Instruções para execução do programa:
Para construir o pacote, execute:

    $ mvn package

Para executá-lo:

    $ cd target/
    $ java -jar qp.jar 

## Instruções para execução dos testes:
Execução dos testes unitários:

    $ mvn test

Execução dos testes com cobertura:

    $ mvn package -P cobertura

----------
Universidade Federal de Goiás  
Engenharia de Software  
Construção de Software 2016/02  
