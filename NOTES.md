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

# Data Types

Java data types are classified into two categories:

## 1. Primitive Data Types
- Predefined by Java
- Fixed size
- Stores actual values

## 2. Non-Primitive Data Types
- User-defined or built-in reference types
- No fixed size
- Stores references to objects

Examples:
- String
- Array
- Class
- Interface

---

# Types of Data

- Numeric
- Non-Numeric

---

# Memory

```text
1 Byte = 8 Bits
```

A **bit** is the smallest unit of data and can hold either:
- `0`
- `1`

---

# Primitive Data Types

## Integer Types

| Data Type | Size |
|-----------|------|
| `byte` | 1 Byte |
| `short` | 2 Bytes |
| `int` | 4 Bytes |
| `long` | 8 Bytes |

---

## Floating-Point Types

| Data Type | Size |
|-----------|------|
| `float` | 4 Bytes |
| `double` | 8 Bytes |

---

## Character Type

| Data Type | Size |
|-----------|------|
| `char` | 2 Bytes |

---

## Boolean Type

| Data Type | Size |
|-----------|------|
| `boolean` | JVM-dependent (commonly treated as 1 byte in memory representation) |

---

## Number Types in Java

- All **non-decimal numbers** are treated as `int` (integer) by default.
- All **decimal (floating-point) numbers** are treated as `double` by default.
- To declare a decimal number as a `float`, append `f` or `F` to the value.

### Examples

```java
int a = 10;          // int by default
double b = 1.4;      // double by default
float c = 1.4f;      // float
float d = 1.4F;      // float
```

## Using Underscores in Numeric Literals

Underscores (`_`) can be used to improve the readability of large numbers.

### Example

```java
int population = 1_23_456;
```

This is equivalent to:

```java
int population = 123456;
```

---

# ASCII (American Standard Code for Information Interchange)

ASCII assigns numeric values to characters.

| Character | ASCII Value |
|-----------|------------:|
| `'a'` | 97 |
| `'A'` | 65 |
| `'0'` | 48 |

### ASCII Character Range

- Uppercase letters: `A–Z`
- Lowercase letters: `a–z`
- Digits: `0–9`
- Special characters: `#`, `$`, `@`, etc.

---

# Unicode

Unicode is a universal character encoding standard that includes:

- All ASCII characters
- Characters from many languages (Hindi, Latin, Chinese, Arabic, etc.)
- Symbols and emojis

**Java uses Unicode** for character representation, allowing programs to work with text from virtually any language.

## Number System

| Number System | Base | Digits |
|---------------|------|--------|
| Binary | 2 | 0, 1 |
| Octal | 8 | 0–7 |
| Decimal | 10 | 0–9 |
| Hexadecimal | 16 | 0–9, A–F |

---

## Decimal Conversion

### Decimal → Binary
Example: `25₁₀ = 11001₂`

```java
int n = 25;
System.out.println(Integer.toBinaryString(n));
```

### Decimal → Octal
Example: `25₁₀ = 31₈`

```java
System.out.println(Integer.toOctalString(n));
```

### Decimal → Hexadecimal
Example: `255₁₀ = FF₁₆`

```java
int n = 255;
System.out.println(Integer.toHexString(n).toUpperCase());
```

---

## Java Number Representation

```java
int decimal = 25;
int binary = 0b11001;
int octal = 031;
int hex = 0x19;
```

---

## Implicit Type Conversion (Widening)

- Automatic conversion from **smaller → larger** data type.
- No data loss.

```java
int a = 100;
double b = a;
```

---

## Explicit Type Conversion (Casting)

- Manual conversion from **larger → smaller** data type.
- May cause data loss.

```java
double x = 25.99;
int y = (int) x;
```

---

## Difference

| Implicit | Explicit |
|----------|----------|
| Automatic | Manual |
| Safe | May lose data |
| `int → double` | `double → int` |
| No casting | Casting required |

# Taking Input(Scanner)

## Import
```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
```

## Read Input
```java
int a = sc.nextInt();           // Integer
char ch = sc.next().charAt(0);  // Character
String word = sc.next();        // Single word
String line = sc.nextLine();    // Full line
```

## Example
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Name: " + name + ", Age: " + age);

        sc.close();
    }
}
```

## Note
After `nextInt()`, `nextDouble()`, etc., call:

```java
sc.nextLine();
```

to consume the leftover newline before using `nextLine()`.

## Common Scanner Methods

| Method | Purpose |
|--------|---------|
| `nextInt()` | Read integer |
| `nextDouble()` | Read double |
| `next()` | Read single word |
| `nextLine()` | Read full line |
| `next().charAt(0)` | Read character |
