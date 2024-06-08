# Global Solution 1

Global Solution 1 da disciplicna Microservice and Web Engineering

## Pré-requisitos

- Java 17+
- Docker
- Acesso a internet
- Acesso ao Docker Hub

## Instalação

#### Clone

```
git clone https://github.com/FrnndzFiap/fiap-gs1.git
```

#### Docker

* Executar container

spring.profiles.active=dev

```
docker run -d -p 8080:8080 -e PROFILE=dev frnndzfiap/fiap-gs1
```

spring.profiles.active=stg

```
docker run -d -p 8080:8080 -e PROFILE=stg frnndzfiap/fiap-gs1
```

spring.profiles.active=prd

```
docker run -d -p 8080:8080 -e PROFILE=prd frnndzfiap/fiap-gs1
```

## Contatos

- Gustavo Fernandez - rm94382
- Vinicus da Silva Pires - rm96187
- Alex Vinicius Costa da Silva - rm96022
