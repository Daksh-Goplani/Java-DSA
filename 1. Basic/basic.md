# Java Notes

## Comments

### Single Line Comment
```java
// Single Line
```

### Multi Line Comment
```java
/* Multi Line */
```

---

# Variables

## Variable Declaration
```java
int a;
```

## Variable Initialization
```java
a = 10;
```
> Initialization is assigning a value to a variable for the first time. After that, changing its value is called **reinitialization**.

## Declaration and Initialization Together
```java
int a = 10;
```

---

# Variable Naming Convention

A variable name can:
- Start with:
  - `_` (underscore)
  - `$` (dollar sign)
  - Alphabets (`A-Z`, `a-z`)

A variable name can end with:
- Alphabets
- `_`
- `$`
- Numbers (`0-9`)

Rules:
- Spaces are **not allowed**.
- Java **keywords** cannot be used as variable names.

---

# Operators

```text
int + int = int
int + String = Concatenation
```

Example:
```java
int a = 10;
System.out.println(a + 5);      // 15
System.out.println(a + "5");    // 105
```

---

# Java Type System

Java is a **statically typed language**, which means the data type of every variable must be declared before it is used.

Examples of **dynamically typed languages**:
- Python
- JavaScript

---

# Terminology

- **Variable Name** → Identifier
- **Assigned Value** → Literal

Example:
```java
int age = 20;
```

- `age` → Identifier
- `20` → Literal

---
