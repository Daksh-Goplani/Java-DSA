# Methods (Functions) in Java

A **method** is a block of code that performs a specific task. Methods help make programs **reusable, organized, and easier to understand**.

## 1. `main()` Method

Every Java program starts execution from the `main()` method.

```java
public static void main(String[] args) {
    // Code
}
```

### Components of `main()`

* **public** → Access modifier.

  * `public` → Can be accessed from anywhere.
  * `private` → Can be accessed only within the same class.

* **static** → Allows the method to be called without creating an object of the class.

* **void** → Return type. It means the method does not return any value.

* **main** → Name of the method. Java looks for this method to start program execution.

* **String[] args** → Used to store command-line arguments.

---

## 2. Creating a Method

```java
public static int sum(int a, int b) {
    int sum = a + b;
    return sum;
}
```

Here:

* `public` → Access modifier
* `static` → Method can be called without creating an object
* `int` → Return type
* `sum` → Method name
* `int a, int b` → Parameters (Formal Arguments)
* `return sum` → Returns the calculated value

### Calling the Method

```java
System.out.println(sum(2, 3));
```

Here:

* `2, 3` → Arguments (Actual Arguments)
* Output → `5`

### Parameter vs Argument

```java
static int sum(int a, int b) {  // a, b → Parameters
    return a + b;
}

sum(2, 3);                     // 2, 3 → Arguments
```

**Parameter:** Variable defined in the method declaration.

**Argument:** Actual value passed when calling the method.

---

## 3. Static vs Non-Static Methods

### Static Method

A `static` method can be called directly using the method name (inside the same class).

```java
static void hello() {
    System.out.println("Hello");
}

public static void main(String[] args) {
    hello();
}
```

No object is required.

### Non-Static Method

For a non-static method, we need to create an **object** and call the method using the object's reference variable.

```java
void hello() {
    System.out.println("Hello");
}

public static void main(String[] args) {
    Main obj = new Main();
    obj.hello();
}
```

**In short:**

```text
Static     → Call directly
Non-static → Create object → Call using object reference
```

---

## 4. Return Type

The return type tells what type of value a method will return.

```java
static int add(int a, int b) {
    return a + b;
}
```

Here, `int` is the return type.

Other examples:

```java
static double getPrice() {
    return 99.5;
}

static String getName() {
    return "Daksh";
}

static boolean isEven(int n) {
    return n % 2 == 0;
}
```

If a method does not return anything, use `void`.

```java
static void printHello() {
    System.out.println("Hello");
}
```

---

## 5. Scope

**Scope** defines the area where a variable or method can be accessed.

### Local Variable

A variable declared inside a method has **local scope**.

```java
static void test() {
    int x = 10;
    System.out.println(x);
}
```

`x` can only be accessed inside the `test()` method.

```java
static void test() {
    int x = 10;
}

System.out.println(x); // Error
```

---

## 6. Pass by Value

Java is **always Pass by Value**.

When a primitive value is passed to a method, a **copy** of that value is passed.

```java
static void change(int x) {
    x = 20;
}

public static void main(String[] args) {

    int a = 10;

    change(a);

    System.out.println(a); // 10
}
```

### Why is the output `10`?

```text
a = 10
 ↓
change(a)
 ↓
copy of a → x = 10
 ↓
x = 20
```

Only the **copy** (`x`) changes. The original variable `a` remains `10`.

> **Remember:** Java does not use pass-by-reference. Java always uses **pass-by-value**.
