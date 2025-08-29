# Agenda de Banho para Pets — Resumo e Conceitos do Código

## Resumo rápido (o que o programa faz)

Este programa de console em Java gerencia uma agenda simples com 10 horários (0 a 9) para banho de pets. Você pode:
- Agendar um banho (com hidratação ou com tosa)
- Consultar a agenda (ver horários livres/ocupados)
- Editar um agendamento (trocar nome do pet e do dono)
- Excluir um agendamento

Tudo acontece pelo menu no terminal.

---

## Como executar

1. Instale o Java (JDK 8 ou superior).
2. No diretório do projeto, compile:
```bash
javac *.java
```
3. Execute:
```bash
java Principal
```

---

## Conceitos do código explicados (para iniciantes)

A ideia desta seção é explicar os blocos básicos de programação usados no projeto, com linguagem simples e dizendo onde aparecem.

- **Classe**: é um “molde” que descreve um tipo de coisa do mundo real no código.
  - Onde aparece: `Agendamento`, `BanhoSimples`, `BanhoComTosa`, `AgendaManager`, `Principal`.

- **Objeto**: é um “exemplar” criado a partir de uma classe (como um produto feito a partir do molde).
  - Onde aparece: quando você agenda, o programa cria um objeto de `BanhoSimples` ou `BanhoComTosa`.

- **Atributos**: são as informações guardadas dentro de um objeto (campos/variáveis da classe).
  - Onde aparece: em `Agendamento` há `nomePet`, `especie`, `nomeDono`, `telefoneDono`, `horario`, `servicoAdicional`.

- **Métodos**: são ações ou funções que a classe/objeto pode executar.
  - Onde aparece: `AgendaManager.agendar(...)`, `listar()`, `editar(...)`, `excluir(...)` são métodos.

- **Construtor**: método especial que cria e prepara um objeto, definindo seus primeiros valores.
  - Onde aparece: `Agendamento(...)` recebe os dados do agendamento; `BanhoSimples(...)` e `BanhoComTosa(...)` chamam o construtor da classe-mãe para já definir o serviço.

- **Palavra-chave `new`**: cria um novo objeto na memória.
  - Onde aparece: em `Principal`, ao agendar, o código faz `new BanhoSimples(...)` ou `new BanhoComTosa(...)`.

- **Herança (`extends`)**: permite que uma classe reaproveite código de outra classe.
  - Onde aparece: `BanhoSimples extends Agendamento` e `BanhoComTosa extends Agendamento`. Assim, elas herdam os atributos e métodos de `Agendamento` e só mudam o que é necessário (o serviço adicional).

- **`@Override`**: indica que um método foi “redefinido” na classe filha para ter um comportamento próprio.
  - Onde aparece: em `BanhoSimples` e `BanhoComTosa`, o método `toString()` é sobrescrito para adicionar o tipo de serviço ao texto.

- **`toString()`**: define como um objeto vira texto quando precisamos imprimir na tela.
  - Onde aparece: em `Agendamento` (monta um texto com os dados) e é complementado nas classes filhas.

- **`static`**: significa que algo pertence à classe, e não a um objeto específico.
  - Onde aparece: em `AgendaManager`, tanto o array `agenda` quanto os métodos (`agendar`, `listar`, etc.) são `static`. Isso permite chamar `AgendaManager.listar()` sem criar um objeto `AgendaManager`.

- **Array**: é uma lista de tamanho fixo para guardar vários elementos do mesmo tipo.
  - Onde aparece: `Agendamento[] agenda = new Agendamento[10];` guarda até 10 agendamentos (posições 0 a 9).

- **Índice (posição no array)**: cada espaço no array tem um número. Aqui, usamos de 0 a 9 para representar horários.
  - Onde aparece: quando você escolhe o horário, o programa usa esse número como posição no array.

- **Encapsulamento (palavras `public` e `private`)**: controla o que pode ser acessado de fora da classe.
  - Onde aparece: em `Agendamento`, os atributos são `private` (protegem os dados) e só podem ser lidos/mudados pelos métodos (getters/setters) que são `public`.

- **`this`**: palavra usada dentro da classe para se referir ao próprio objeto (diferenciar atributo de parâmetro).
  - Onde aparece: no construtor de `Agendamento` e nos setters (`this.nomePet = nomePet;`).

- **Getters e Setters**: métodos para ler (get) e alterar (set) os atributos de forma segura.
  - Onde aparece: em `Agendamento`, por exemplo `getNomePet()` e `setNomePet(...)`.

- **`import`**: traz classes de outras “caixas de ferramentas” da linguagem.
  - Onde aparece: em `Principal`, `import java.util.Scanner;` para ler dados digitados.

- **`Scanner`**: objeto que lê o que o usuário digita no console.
  - Onde aparece: em `Principal`, para pegar nomes, telefone e horário.

- **`switch` / `case`**: escolhe o que fazer com base em um número/opção.
  - Onde aparece: em `Principal`, decide entre agendar, listar, editar, excluir ou sair.

- **`if` / `else`**: toma decisões (se algo é verdadeiro, faz X; senão, faz Y).
  - Onde aparece: em `AgendaManager.agendar(...)` verifica se a posição é válida e se está livre; em `Principal`, escolhe entre `BanhoSimples` ou `BanhoComTosa`.

- **`do { ... } while (condição);`**: repete o menu até o usuário escolher sair.
  - Onde aparece: em `Principal`, mantém o programa rodando até a opção 5.

- **Tipos de dado**: `String` (textos), `int` (números inteiros) e `boolean` (verdadeiro/falso, implicitamente nas condições).
  - Onde aparece: `String` para nomes/telefone/horário textual; `int` para escolher opções e índices.

---

## O que cada arquivo faz

- `Principal.java`: mostra o menu, lê os dados do usuário e chama os métodos da agenda.
- `AgendaManager.java`: guarda a lista de agendamentos (array) e oferece métodos para agendar, listar, editar e excluir.
- `Agendamento.java`: define os dados (atributos) de um agendamento e como ele vira texto (`toString`).
- `BanhoSimples.java`: um tipo de agendamento que define o serviço como “Hidratação”.
- `BanhoComTosa.java`: um tipo de agendamento que define o serviço como “Tosa”.

---

## Fluxo do programa (resumo)

1. O programa inicia em `Principal.main` e mostra o menu.
2. O usuário escolhe uma opção.
3. Para agendar, o programa cria um objeto (`new BanhoSimples` ou `new BanhoComTosa`) e guarda no array da `AgendaManager` na posição escolhida (0 a 9).
4. Para listar, mostra cada posição do array e, se houver agendamento, imprime o `toString()` do objeto.
5. Para editar/excluir, usa o índice informado e altera ou limpa a posição no array.
6. Repete o menu até o usuário escolher sair.

---

## Exemplos de uso do menu

- Agendar banho simples no horário 3:
  - Opção 1 → preencher dados → horário 3 → serviço 1 (Hidratação)
- Ver agenda:
  - Opção 2
- Editar horário 3:
  - Opção 3 → digitar 3 → informar novos nomes
- Excluir horário 3:
  - Opção 4 → digitar 3

---

## Dicas e melhorias

- Validar melhor o telefone (formato).
- Permitir mudar o tipo de serviço ao editar.
- Salvar em arquivo para não perder os dados ao encerrar o programa.
- Aumentar a quantidade de horários ou permitir configurar o tamanho da agenda.
