# Operators

## What is an Operator?

An **Operator** is a symbol that performs an operation on one or more operands.

**Example:**

```
5 + 5
```

- `5` → Operand
- `+` → Operator
- `5` → Operand

---

## Categories of Operators

### 1. Unary Operator
Works with **one operand**.

**Examples:**

```java
++a
--a
-a
```

### 2. Binary Operator
Works with **two operands**.

**Example:**

```java
10 + 20
```

---

## Arithmetic Operators

| Operator | Meaning |
|----------|---------|
| `+` | Addition |
| `-` | Subtraction |
| `*` | Multiplication |
| `/` | Division |
| `%` | Modulus (Remainder) |
| `++` | Increment |
| `--` | Decrement |

---

## Pre vs Post Increment

### Pre Increment (`++a`)
Increment first, then use.

```java
int a = 5;
System.out.println(++a); // 6
```

### Post Increment (`a++`)
Use first, then increment.

```java
int a = 5;
System.out.println(a++); // 5
System.out.println(a);   // 6
```

---

## Relational Operators

| Operator | Meaning |
|----------|---------|
| `==` | Equal to |
| `!=` | Not Equal to |
| `>` | Greater than |
| `<` | Less than |
| `>=` | Greater than or Equal to |
| `<=` | Less than or Equal to |

---

## `/` and `%` Operators

For `number = 123`

```java
123 / 10 = 12   // Removes last digit
123 % 10 = 3    // Returns last digit
```

---

# Relational Operators

Relational operators compare two values and always return a **boolean** (`true` or `false`).

| Operator | Meaning | Example | Result |
|----------|---------|---------|--------|
| `==` | Equal to | `5 == 5` | `true` |
| `!=` | Not Equal to | `5 != 3` | `true` |
| `>` | Greater than | `10 > 5` | `true` |
| `<` | Less than | `10 < 5` | `false` |
| `>=` | Greater than or Equal to | `10 >= 10` | `true` |
| `<=` | Less than or Equal to | `5 <= 10` | `true` |

### Example

```java
int a = 10;
int b = 20;

System.out.println(a > b);   // false
System.out.println(a < b);   // true
System.out.println(a == b);  // false
System.out.println(a != b);  // true
System.out.println(a >= b);  // false
System.out.println(a <= b);  // true
```

---

# Logical Operators

Logical operators work with **boolean expressions**.

| Operator | Meaning |
|----------|---------|
| `&&` | Logical AND |
| `||` | Logical OR |
| `!` | Logical NOT |

### Example

```java
boolean a = true;
boolean b = false;

System.out.println(a && b); // false
System.out.println(a || b); // true
System.out.println(!a);     // false
System.out.println(!b);     // true
```

---

## Short-Circuit Evaluation

```java
int a = 12, b = 22;

System.out.println(a++ > 12 && b++ > 22);
System.out.println(a + " " + b);
```

**Output**

```text
false
13 22
```

### Explanation

- `a++ > 12`
  - Uses `12 > 12` → `false`
  - Then `a` becomes `13`
- Since the first condition is `false`, Java **does not evaluate** the second condition.
- Therefore `b++` is never executed.

Final Values

```text
a = 13
b = 22
```

---

# Bitwise Operators

Bitwise operators perform operations on the **binary representation** of numbers.

| Operator | Meaning |
|----------|---------|
| `&` | Bitwise AND |
| `|` | Bitwise OR |
| `^` | Bitwise XOR |
| `~` | Bitwise NOT |
| `<<` | Left Shift |
| `>>` | Right Shift |

---

## Bitwise Truth Table

| a | b | `a & b` | `a \| b` | `a ^ b` |
|---|---|---------|----------|---------|
| 0 | 0 | 0 | 0 | 0 |
| 0 | 1 | 0 | 1 | 1 |
| 1 | 0 | 0 | 1 | 1 |
| 1 | 1 | 1 | 1 | 0 |

### XOR (`^`)

Returns **1** only when both bits are different.

Example

```text
5 = 0101
3 = 0011
-----------
^ = 0110 = 6
```

```java
System.out.println(5 ^ 3); // 6
```

---

## Bitwise NOT (`~`)

Flips every bit.

### Trick

```text
~n = -(n + 1)
```

Example

```java
System.out.println(~5);
```

Output

```text
-6
```

Because

```text
~5
= -(5 + 1)
= -6
```

---

# Left Shift (`<<`)

Moves all bits to the **left**.

```text
101
 ↓
1010
```

### Trick

```text
a << n = a × (2^n)
```

Example

```java
System.out.println(5 << 1); // 10
System.out.println(5 << 2); // 20
```

---

# Right Shift (`>>`)

Moves all bits to the **right**.

```text
10000
  ↓
1000
```

### Trick

```text
a >> n = a ÷ (2^n)
```

Example

```java
System.out.println(20 >> 1); // 10
System.out.println(20 >> 2); // 5
```

---

# Shorthand Assignment Operators

Used to update variables quickly.

| Operator | Equivalent |
|----------|------------|
| `+=` | `a = a + value` |
| `-=` | `a = a - value` |
| `*=` | `a = a * value` |
| `/=` | `a = a / value` |
| `%=` | `a = a % value` |

### Example

```java
int a = 10;

a += 5; // 15
a -= 2; // 13
a *= 2; // 26
a /= 2; // 13
a %= 5; // 3
```

---

# Operator Precedence (Highest → Lowest)

| Priority | Operators |
|----------|-----------|
| 1 | `()` |
| 2 | `++ -- ! ~` |
| 3 | `* / %` |
| 4 | `+ -` |
| 5 | `<< >>` |
| 6 | `< <= > >=` |
| 7 | `== !=` |
| 8 | `&` |
| 9 | `^` |
| 10 | `\|` |
| 11 | `&&` |
| 12 | `\|\|` |
| 13 | `= += -= *= /= %=` |

### Example

```java
int result = 5 + 3 * 2;

System.out.println(result);
```

Output

```text
11
```

Explanation

```text
3 * 2 = 6
5 + 6 = 11
```