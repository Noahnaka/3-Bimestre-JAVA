# Agenda de Banho para Pets (Java)

Este projeto é um programa simples em Java para gerenciar agendamentos de banho (com ou sem tosa) para pets. Ele funciona no console (linha de comando) e permite:

- Agendar um banho para um horário específico
- Consultar todos os horários e ver quais estão livres/ocupados
- Editar um agendamento (trocar nome do pet e do dono)
- Excluir um agendamento

A agenda tem 10 horários numerados de 0 a 9.

---

## Como executar

1. Tenha o Java instalado (JDK 8+).
2. Compile os arquivos `.java` (no mesmo diretório):
```bash
javac *.java
```
3. Execute o programa principal:
```bash
java Principal
```

---

## Como usar (passo a passo)

Ao rodar, o programa mostra um menu:

```
Menu:
1 - Agendar banho
2 - Consultar agenda
3 - Editar agendamento
4 - Excluir agendamento
5 - Sair
```

- **1 - Agendar banho**: você informa dados do pet e do dono, escolhe o horário (0 a 9) e o tipo de serviço (Hidratação ou Tosa). Se o horário estiver livre, o agendamento é salvo.
- **2 - Consultar agenda**: mostra os 10 horários e o que está marcado em cada um.
- **3 - Editar agendamento**: você escolhe um horário e pode alterar o nome do pet e do dono.
- **4 - Excluir agendamento**: remove o agendamento de um horário.
- **5 - Sair**: fecha o programa.

Dicas:
- Os horários vão de 0 a 9. Se você digitar algo fora desse intervalo, o programa avisa.
- Não é possível agendar dois banhos no mesmo horário.

---

## Explicação do código (para iniciantes)

Abaixo está um resumo simples do que cada arquivo faz.

### `Principal.java`
- É o ponto de entrada do programa (onde tudo começa): método `main`.
- Mostra o menu e usa um `Scanner` para ler o que o usuário digita.
- Dependendo da opção escolhida (1 a 5), chama métodos da classe `AgendaManager` (agendar, listar, editar, excluir).
- Quando você escolhe agendar, o programa cria um objeto que representa o agendamento (pode ser `BanhoSimples` ou `BanhoComTosa`).

### `AgendaManager.java`
- É como um “controlador” da agenda.
- Guarda os agendamentos em um array de tamanho 10: `Agendamento[]`.
- Métodos principais:
  - `agendar(ag, posicao)`: coloca um agendamento no horário indicado, se estiver livre.
  - `listar()`: mostra todos os horários (livres ou ocupados).
  - `editar(posicao, novoNomePet, novoNomeDono)`: altera nomes do pet e do dono.
  - `excluir(posicao)`: apaga o agendamento do horário.

### `Agendamento.java`
- Representa os dados de um agendamento: nome do pet, espécie, nome e telefone do dono, horário e o serviço adicional (se houver).
- É uma classe base (ou “mãe”). Outras classes especiais herdam dela.
- Possui getters e setters (métodos para ler/alterar os valores) e um `toString()` que monta um texto para mostrar na tela.

### `BanhoSimples.java` e `BanhoComTosa.java`
- São tipos específicos de agendamento que herdam de `Agendamento`.
- `BanhoSimples` define o serviço como “Hidratação”.
- `BanhoComTosa` define o serviço como “Tosa”.
- Herança permite reaproveitar o código da classe base e mudar apenas o que é diferente.

---

## Conceitos de programação usados (explicado de forma simples)

- **Classe**: modelo que descreve um tipo de objeto. Ex.: `Agendamento` é o modelo de um agendamento.
- **Objeto**: uma instância (um “exemplar”) de uma classe. Ao agendar um banho, o programa cria um objeto com os dados.
- **Atributos**: as informações do objeto (nome do pet, telefone, etc.).
- **Métodos**: ações/funções que podemos executar (agendar, editar, excluir).
- **Array**: uma lista de tamanho fixo. Aqui, temos 10 posições (0 a 9) para os horários.
- **Herança**: quando uma classe aproveita o código de outra. `BanhoSimples` e `BanhoComTosa` aproveitam tudo de `Agendamento` e só mudam o tipo de serviço.
- **toString()**: método especial que diz como mostrar um objeto como texto. Ajuda na hora de imprimir na tela.

---

## Exemplos rápidos

- Agendar banho simples no horário 3:
  - Opção 1 → preencha os dados → horário 3 → serviço 1 (Hidratação)

- Verificar agenda:
  - Opção 2

- Editar o horário 3:
  - Opção 3 → digite 3 → informe os novos nomes

- Excluir o horário 3:
  - Opção 4 → digite 3

---

## Possíveis melhorias

- Validar melhor o telefone (formato)
- Permitir mudar o tipo de serviço ao editar
- Salvar os dados em arquivo para não perder quando fechar o programa
- Aumentar a quantidade de horários ou permitir escolher o tamanho da agenda

---

## Estrutura dos arquivos

- `Principal.java`: menu e entrada do usuário
- `AgendaManager.java`: lógica da agenda (agendar/listar/editar/excluir)
- `Agendamento.java`: dados do agendamento (classe base)
- `BanhoSimples.java`: agendamento com hidratação
- `BanhoComTosa.java`: agendamento com tosa

Se tiver dúvidas, fique à vontade para melhorar o código e comentar!
