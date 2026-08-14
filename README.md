# 🧮 Calculadora em Java

Projeto desenvolvido durante meus estudos de Java com o objetivo de praticar métodos, parâmetros, retorno de valores, estruturas de repetição e decisões.

A calculadora permite que o usuário informe dois números, escolha uma operação matemática e receba o resultado diretamente no console.

---

## ⚙️ Funcionalidades

A calculadora possui quatro operações matemáticas:

- ➕ Adição
- ➖ Subtração
- ✖️ Multiplicação
- ➗ Divisão

O programa também permite realizar vários cálculos sem precisar reiniciar a aplicação.

Ao final de cada operação, o usuário pode escolher se deseja continuar utilizando a calculadora ou encerrá-la.

---

## 🖥️ Funcionamento

Ao iniciar o programa, o usuário informa dois números:

```text
========================
Qual o primeiro numero?
========================
10

========================
Qual o segundo numero?
========================
5
```

Depois, escolhe a operação:

```text
==================
Qual operador?

1 - Adição
2 - Subtração
3 - Multiplicação
4 - Divisão
==================
```

Por exemplo, escolhendo `1`:

```text
Resultado: 15
```

Depois disso:

```text
Deseja continuar? (s/n):
```

O usuário pode realizar outro cálculo ou encerrar o programa.

---

## 🧠 Conceitos praticados

Durante o desenvolvimento deste projeto, pratiquei:

- `Scanner`
- Variáveis
- `int`
- `double`
- `boolean`
- `char`
- Métodos
- Parâmetros
- `return`
- `if`
- `else if`
- `else`
- `while`
- Operadores matemáticos
- Operadores de comparação
- Casting de tipos
- Entrada de dados pelo teclado

---

## 🔧 Métodos

Cada operação matemática foi separada em seu próprio método.

### ➕ Adição

```java
public static int adição(int num1, int num2)
```

Recebe dois números inteiros e retorna a soma.

### ➖ Subtração

```java
public static int subtração(int num1, int num2)
```

Recebe dois números inteiros e retorna a diferença entre eles.

### ✖️ Multiplicação

```java
public static int multiplicação(int num1, int num2)
```

Recebe dois números inteiros e retorna o resultado da multiplicação.

### ➗ Divisão

```java
public static double divisão(int num1, int num2)
```

Recebe dois números e retorna o resultado da divisão.

Na divisão foi utilizado `double` e casting:

```java
(double) num1 / num2
```

Isso permite que o resultado tenha casas decimais.

Por exemplo:

```text
5 / 2 = 2.5
```

Em vez de:

```text
5 / 2 = 2
```

quando os dois valores são tratados apenas como `int`.

---

## 🔄 Estrutura de repetição

Utilizei um `while` controlado por uma variável `boolean`:

```java
boolean rodando = true;

while (rodando) {
    // calculadora
}
```

Enquanto `rodando` for `true`, a calculadora continua funcionando.

Quando o usuário escolhe encerrar:

```java
rodando = false;
```

o `while` é encerrado e o programa termina.

---

## 🔀 Escolha da operação

Para determinar qual cálculo será realizado, utilizei estruturas condicionais:

```text
1 → Adição
2 → Subtração
3 → Multiplicação
4 → Divisão
```

O programa verifica a opção escolhida e chama o método correspondente.

Exemplo:

```java
if (operacao == 1) {
    int resultado = adição(num1, num2);
}
```

---

## 📚 O que aprendi com este projeto

Este projeto foi importante para colocar em prática vários conceitos que eu havia estudado separadamente.

Principalmente:

- Criar métodos para diferentes responsabilidades;
- Passar valores através de parâmetros;
- Utilizar `return` para devolver resultados;
- Chamar métodos dentro do `main`;
- Utilizar `while` para manter o programa funcionando;
- Utilizar `boolean` para controlar uma repetição;
- Trabalhar com diferentes tipos de dados;
- Entender a diferença entre `int` e `double`;
- Utilizar casting para realizar operações com números decimais.

---

**Linguagem utilizada:** Java ☕
