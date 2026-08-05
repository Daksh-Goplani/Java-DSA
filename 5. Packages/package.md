# Packages

## What is a Package?

A **package** in Java is a collection of related classes and interfaces. It is used to organize code, avoid naming conflicts, and provide access protection.

---

# Types of Packages

There are two types of packages in Java:

1. Built-in (Predefined) Packages
2. User-Defined Packages

---

# 1. Built-in Packages

These packages are provided by Java.

## java.util

The `java.util` package contains utility classes such as collections, scanner, random, date, etc.

### Example: Scanner

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello " + name);

        sc.close();
    }
}
```

**Common Classes**
- Scanner
- ArrayList
- LinkedList
- HashMap
- Random

---

## java.lang

The `java.lang` package is imported automatically by Java.

### Example: Math Class

```java
public class Main {
    public static void main(String[] args) {

        System.out.println(Math.sqrt(25));
        System.out.println(Math.pow(2, 5));
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));
    }
}
```

**Common Classes**
- Math
- String
- Object
- System
- Integer
- Double

---

# 2. User-Defined Package

A user-defined package is created by the programmer.

### Step 1: Create a package

File: `mypackage/Message.java`

```java
package mypackage;

public class Message {

    public void display() {
        System.out.println("Welcome to User Defined Package");
    }
}
```

---

### Step 2: Use the package

File: `Main.java`

```java
import mypackage.Message;

public class Main {

    public static void main(String[] args) {

        Message obj = new Message();
        obj.display();

    }
}
```

---

# Advantages of Packages

- Organizes Java programs.
- Avoids class name conflicts.
- Improves code readability.
- Makes code reusable.
- Provides access protection.

---

# Summary

| Package Type | Example |
|-------------|---------|
| Built-in | `java.util.Scanner`, `java.lang.Math` |
| User-Defined | `mypackage.Message` |