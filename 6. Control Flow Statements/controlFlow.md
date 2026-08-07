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

---

# 5. switch Statement

### Definition

The `switch` statement is used to execute one block of code from multiple possible options based on the value of an expression.

It is often cleaner and more readable than writing many `if-else-if` statements when checking the same variable against multiple values.

### Syntax

```java
switch (expression) {
    case value1:
        // code
        break;

    case value2:
        // code
        break;

    default:
        // code
}
```

### Example

```java
public class Main {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid Day");
        }
    }
}
```

### Output

```
Wednesday
```

---

# Fall Through

### Definition

If a `break` statement is **not** used, Java continues executing the next case(s) even if their values do not match. This behavior is called **fall through**.

### Example

```java
public class Main {
    public static void main(String[] args) {
        int number = 2;

        switch (number) {
            case 1:
                System.out.println("One");

            case 2:
                System.out.println("Two");

            case 3:
                System.out.println("Three");

            default:
                System.out.println("Done");
        }
    }
}
```

### Output

```
Two
Three
Done
```

**Explanation:** Since there is no `break` after `case 2`, execution falls through to the remaining cases.

---

# switch Flow

```
           Expression
                |
         +------+------+
         |             |
      case 1       case 2 ...
         |             |
      Execute      Execute
         |             |
      break? --------- No
         |             |
       Exit       Next Case
                ...
                  |
              default
```

---

# switch vs if-else

| Feature | switch | if-else |
|---------|--------|---------|
| Best for | Checking one variable against multiple values | Complex conditions and ranges |
| Readability | Cleaner for many fixed values | Better for logical expressions |
| Performance | Generally more optimized for fixed constant values | May require multiple condition checks |
| Supports | Exact value matching | Any boolean expression |

---

# switch Important Points

- `switch` is generally **more optimized** than a long `if-else-if` ladder when comparing a single variable against many constant values.
- `break` is used to stop execution after a matching case.
- Without `break`, execution **falls through** to the next case(s).
- The `default` block is optional and runs if no case matches.
- Each `case` must have a **constant value**.

### Allowed Types

The `switch` expression can use:

- `byte`
- `short`
- `int`
- `char`
- `String`
- `enum`

> Earlier Java versions mainly supported integral types (`byte`, `short`, `int`, `char`) and later versions added support for `String`.

---


# Comparison

| Statement | Number of Conditions | Executes |
|-----------|----------------------|----------|
| if | One | Only if condition is true |
| if-else | One | One of two blocks |
| if-else-if | Multiple | First matching condition |
| Nested if | Multiple (inside another if) | Inner block only if outer condition is true |
| switch | Multiple fixed values | Matching case block |

---

# 6. Modern switch (Arrow Syntax)

### Definition

The **modern switch** (Java 14+) uses the `->` arrow operator. It is cleaner, does not require `break`, and prevents fall through.

### Example

```java
import java.util.Scanner;

public class SwitchUpdated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
            default -> System.out.println("Consonant");
        }

        sc.close();
    }
}
```

### Important Points

- Uses the `->` arrow operator.
- No `break` statement is required.
- Prevents fall through.
- Multiple case labels can be combined using commas.
- Available as a standard feature since **Java 14**.

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
- `switch` → Chooses one block from multiple fixed values and supports **fall through** when `break` is omitted.

Mastering these conditional statements is the foundation for writing decision-making programs in Java.