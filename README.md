# Explorando Padrões de Projetos na Prática com Java

Repositório com as implementações dos padrões de projeto explorados no Lab "Explorando Padrões de Projetos na Prática com Java". Especificamente, este projeto explorou alguns padrões usando Java puro:
- Singleton
- Strategy
- Facade

## ✅ O que foi implementado neste projeto

Este repositório foi adaptado com base no conteúdo apresentado no lab da DIO, incluindo:

### 🔒 Singleton
Implementado utilizando o padrão *Lazy Holder*, que garante uma instanciação segura e sob demanda da classe Singleton.

- Classe: SingletonLazyHolder
- Método acessado via interface gráfica: getInstance()

### 🧠 Strategy (em desenvolvimento)
A estrutura está preparada para implementar o padrão Strategy futuramente. Um botão na interface simula essa ação com uma mensagem indicativa.

### 🏢 Facade (em desenvolvimento)
A estrutura também está preparada para o padrão Facade, com um botão configurado que exibe uma mensagem indicativa.

---

## 🖥️ Interface Gráfica

Foi desenvolvida uma interface gráfica simples em Java Swing (AppGui) com três botões:

- *Testar Singleton* – Chama a classe Singleton e mostra a instância atual na tela.
- *Testar Strategy* – Exibe a mensagem "Chamando Strategy..." como placeholder.
- *Testar Facade* – Exibe a mensagem "Chamando Facade..." como placeholder.
