# ktProfissional

Projeto Kotlin com foco em **boas práticas**, **estrutura profissional** e **evolução incremental**.
Este repositório documenta não apenas o código, mas também o **processo de desenvolvimento**.

## 🎯 Objetivo
O objetivo do **ktProfissional** é servir como um projeto-base para:
- estudo estruturado de Kotlin (JVM)
- aplicação de boas práticas de organização
- uso correto de Gradle e Git
- construção de código limpo e evolutivo

## 🛠️ Tecnologias
- Kotlin (JVM)
- Java 21
- Gradle (Kotlin DSL)
- JUnit Jupiter
- Git / GitHub

## ▶️ Como executar o projeto

Na raiz do projeto:

```bash
./gradlew run
``` 

## 🧪 Executar testes

```shell
1  ./gradlew test
```

## 📁 Estrutura do projeto

```text
ktProfissional/
├── app/
│   └── src/
│       ├── main/
│       │   └── kotlin/
│       │       └── br/com/ktprofissional/
│       │           ├── app/        # Ponto de entrada da aplicação
│       │           ├── domain/     # Regras de negócio
│       │           ├── service/    # Casos de uso
│       │           └── util/       # Utilitários
│       └── test/
├── gradle/
├── docs/
│   └── Roadmap.md
└── README.md
```

## 📌 Princípios adotados

- Separação clara de responsabilidades
- Código simples antes de código complexo
- Evolução incremental (sem overengineering)
- Documentação como parte do projeto
- Commits pequenos e descritivos

## 🧭 Roadmap

O planejamento e as fases do projeto estão descritos em:

- docs/Roadmap.md

## 📄 Licença

Projeto de uso educacional e experimental.