# Control Flow - Conditional Statements

## 📌 Overview
Control flow statements allow a program to make decisions based on conditions. Java provides several conditional statements to execute different blocks of code depending on whether a condition is `true` or `false`.

---

# 1. if Statement

### Definition
The `if` statement executes a block of code only if the given condition is `true`.

### Syntax
```java
if (condition) {
    // code to execute
}
```

### Example
```java
public class Main {
    public static void main(String[] args) {
        int age = 20;

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }
    }
}
```

### Output
```
You are eligible to vote.
```

---

# 2. if-else Statement

### Definition
The `if-else` statement executes one block if the condition is `true`, otherwise another block.

### Syntax
```java
if (condition) {
    // executes if true
} else {
    // executes if false
}
```

### Example
```java
public class Main {
    public static void main(String[] args) {
        int number = 15;

        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
```

### Output
```
Odd Number
```

---

# 3. if-else-if Ladder

### Definition
Used when there are multiple conditions. Java checks each condition from top to bottom and executes the first matching block.

### Syntax
```java
if (condition1) {
    // code
}
else if (condition2) {
    // code
}
else if (condition3) {
    // code
}
else {
    // default code
}
```

### Example
```java
public class Main {
    public static void main(String[] args) {
        int marks = 82;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }
    }
}
```

### Output
```
Grade B
```

---

# 4. Nested if Statement

### Definition
An `if` statement inside another `if` statement is called a nested `if`.

### Syntax
```java
if (condition1) {
    if (condition2) {
        // code
    }
}
```

### Example
```java
public class Main {
    public static void main(String[] args) {
        int age = 20;
        boolean hasLicense = true;

        if (age >= 18) {
            if (hasLicense) {
                System.out.println("You can drive.");
            }
        }
    }
}
```

### Output
```
You can drive.
```

---

# Flow of Execution

```
            Condition?
                |
        +-------+-------+
        |               |
      True            False
        |               |
 Execute Block      Skip Block
```

### if-else Flow

```
         Condition?
          /      \
      True       False
       |            |
   if Block     else Block
```

### if-else-if Ladder Flow

```
Condition 1?
   |
True ---> Execute Block 1
   |
False
   |
Condition 2?
   |
True ---> Execute Block 2
   |
False
   |
Condition 3?
   |
True ---> Execute Block 3
   |
False
   |
Default (else)
```

---

# Comparison

| Statement | Number of Conditions | Executes |
|------------|----------------------|----------|
| if | One | Only if condition is true |
| if-else | One | One of two blocks |
| if-else-if | Multiple | First matching condition |
| Nested if | Multiple (inside another if) | Inner block only if outer condition is true |

---

# Important Points

- Conditions must evaluate to a `boolean` (`true` or `false`).
- Curly braces `{}` are optional for a single statement but recommended.
- In an `if-else-if` ladder, only the **first true condition** is executed.
- The `else` block is optional.
- Nested `if` statements help when one condition depends on another.

---

# Summary

- `if` → Executes code only when the condition is true.
- `if-else` → Chooses between two blocks.
- `if-else-if` → Chooses among multiple conditions.
- `Nested if` → An `if` inside another `if` for dependent decisions.

Mastering these conditional statements is the foundation for writing decision-making programs in Java.