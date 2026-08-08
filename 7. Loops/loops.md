# Loops - Repetition

## 📌 Overview
Loops are used to repeat a block of code while a condition is true. They are useful when the same task should run multiple times without writing the same code again.

Java supports three main loop statements:
- `for`
- `while`
- `do-while`

---

## 1. Types of loops

### Entry control loop
The condition is checked before the loop body runs.
- `for`
- `while`

### Exit control loop
The loop body runs first, then the condition is checked.
- `do-while`

---

## 2. `for` loop

### Definition
A `for` loop is best when you know how many times the loop should execute.

### Syntax
```java
for (initialization; condition; update) {
    // code to execute
}
```

### Example
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
```

### Output
```
1
2
3
4
5
```

---

## 3. `while` loop

### Definition
A `while` loop checks the condition first and runs the body only when the condition is `true`.

### Syntax
```java
while (condition) {
    // code to execute
}
```

### Example
```java
public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}
```

### Output
```
1
2
3
4
5
```

---

## 4. `do-while` loop

### Definition
A `do-while` loop runs the body once first, then checks the condition. It is useful when the loop must execute at least one time.

### Syntax
```java
do {
    // code to execute
} while (condition);
```

### Example
```java
public class Main {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}
```

### Output
```
1
2
3
4
5
```

---

## 5. `for` vs `while` vs `do-while`

### When to use `for`
- Use when the number of iterations is known in advance.
- Common for index-based loops.
- Initialization, condition, and update are all in one line.

### When to use `while`
- Use when the number of iterations is not known beforehand.
- The loop continues while a condition remains true.
- Great for reading input until a stop condition or processing until a value changes.

### When to use `do-while`
- Use when the loop body must execute at least once.
- Good when the condition depends on values produced inside the loop.
- Often used for menus or repeated user prompts.

### Summary table

- `for`: entry-controlled, known count, index loops
- `while`: entry-controlled, unknown count, condition-driven
- `do-while`: exit-controlled, runs at least once

---

## 6. `break` and `continue`

### `break`
`break` exits the nearest loop immediately.

#### Example
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }
}
```

#### Output
```
1
2
```

### `continue`
`continue` skips the current iteration and moves to the next one.

#### Example
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
    }
}
```

#### Output
```
1
2
4
5
```

---

## 7. Nested loops

### Definition
A nested loop is a loop inside another loop.

### Example
```java
public class Main {
    public static void main(String[] args) {
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print(row + "," + col + " ");
            }
            System.out.println();
        }
    }
}
```

### Output
```
1,1 1,2 1,3 
2,1 2,2 2,3 
3,1 3,2 3,3 
```

### Use cases
- Printing patterns
- Working with matrices
- Handling multiple dimensions of data

---

## 8. Important notes

- Always update the loop variable in `while` and `for` loops to avoid infinite loops.
- `for` supports `break` and `continue` just like other loops.
- `do-while` is helpful when the body must execute before the condition check.
- Nested loops increase complexity quickly, so keep them simple.
