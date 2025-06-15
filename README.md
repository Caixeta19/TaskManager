
# 📝 TaskManager

Sistema de Gerenciamento de Tarefas com Priorização desenvolvido com **Spring Boot** e **Thymeleaf**.

## 📚 Descrição

O **TaskManager** é uma aplicação web criada para auxiliar usuários na organização de tarefas, permitindo:
- Cadastro e visualização de tarefas;
- Definição de prioridades por níveis (Alta, Média, Baixa);
- Interface simples e intuitiva;
- Visualização e evidência por meio de imagens.

## 🔧 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Thymeleaf**
- **H2 Database**
- **Maven**
- **HTML/CSS**
- **JUnit (testes)**

## 📂 Estrutura do Projeto

```
src
└── main
    ├── java/com/example/taskmanager
    │   ├── controller
    │   │   ├── PrioridadeController.java
    │   │   └── TarefasController.java
    │   ├── model
    │   │   ├── Enum/NiveisPrioridade.java
    │   │   ├── Prioridade.java
    │   │   └── Tarefas.java
    │   ├── repository
    │   │   ├── PrioridadeRepository.java
    │   │   └── TarefasRepository.java
    │   └── service
    │       └── Application.java
    ├── resources
    │   ├── static/images
    │   └── templates
    │       ├── prioridades.html
    │       └── tarefas.html
    └── application.yml
```

## 🧪 Funcionalidades

- ✅ Cadastrar novas tarefas com título e descrição;
- ✅ Atribuir prioridade à tarefa (Alta, Média, Baixa);
- ✅ Listar tarefas por ordem de prioridade;
- ✅ Cadastrar diferentes níveis de prioridade;
- ✅ Visualização clara em páginas separadas:
  - `/tarefas` — Lista de tarefas.
  - `/prioridades` — Lista e cadastro de prioridades.

## 🖼️ Evidências Visuais

O projeto contém capturas de tela na pasta `visualEvidency`:
- 📷 `CadastrarPrioridade.png`
- 📷 `CadastrarTarefa.png`
- 📷 `TaskManagerPrioridade.png`
- 📷 `TaskManagerTarefas.png`

Essas imagens ilustram o funcionamento e o visual da aplicação.


## 🧑‍💻 Desenvolvido por

- Guilherme Caixeta e equipe colaboradora.
