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
