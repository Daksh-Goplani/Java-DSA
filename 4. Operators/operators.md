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