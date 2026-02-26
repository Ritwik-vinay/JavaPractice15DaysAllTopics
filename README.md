# ☕ Java Practice — Basics to Advanced
## SDET Interview Preparation Guide

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white" />
  <img src="https://img.shields.io/badge/TestNG-FF6C37?style=for-the-badge&logo=testng&logoColor=white" />
  <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white" />
  <img src="https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white" />
</p>

<p align="center">
  <img src="https://cydeo.com/wp-content/uploads/2022/06/Java-SDET.png" alt="Java SDET Banner" width="700"/>
</p>

> 🎯 A comprehensive, structured collection of Java practice questions and programs — from **core basics to advanced topics** — tailored specifically for **SDET (Software Development Engineer in Test)** interview preparation.

---

## 📌 Table of Contents

- [About the Project](#about-the-project)
- [Tech Stack](#tech-stack)
- [Java Roadmap](#java-roadmap)
- [Topics Covered](#topics-covered)
- [Project Structure](#project-structure)
- [SDET-Specific Topics](#sdet-specific-topics)
- [Interview Questions by Topic](#interview-questions-by-topic)
- [How to Run](#how-to-run)
- [Contributing](#contributing)

---

## 📖 About the Project

This repository is a **one-stop resource** for anyone preparing for SDET roles at top tech companies. It covers Java programming from the very basics to advanced concepts used in real-world test automation frameworks.

Whether you're a beginner brushing up on Java fundamentals or an experienced tester preparing for a senior SDET role, this guide has you covered.

---

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| ☕ Java (JDK 17+) | Core programming language |
| 🧪 Selenium WebDriver | Browser automation |
| 🔬 TestNG / JUnit 5 | Test frameworks |
| 📦 Maven / Gradle | Build tools |
| 🔁 Git & GitHub | Version control |
| 💡 IntelliJ IDEA | IDE |

---

## 🗺️ Java Roadmap

<p align="center">
  <img src="https://roadmap.sh/roadmaps/java.png" alt="Java Learning Roadmap" width="700"/>
</p>

> 📌 **Image Reference:** Java Developer Roadmap — [roadmap.sh/java](https://roadmap.sh/java)

Follow this roadmap to systematically master Java from scratch to SDET-level expertise.

---

## 📚 Topics Covered

### 🟢 Phase 1 — Java Basics

| # | Topic | Key Concepts |
|---|-------|-------------|
| 01 | Data Types & Variables | `int`, `String`, `double`, `boolean`, `char` |
| 02 | Operators | Arithmetic, Relational, Logical, Bitwise, `x++`, `++x` |
| 03 | Control Flow | `if-else`, `switch-case`, ternary operator |
| 04 | Loops | `for`, `while`, `do-while`, `for-each` |
| 05 | Arrays | 1D, 2D arrays, `Arrays` utility class |
| 06 | Strings | `String`, `StringBuilder`, `StringBuffer`, methods |
| 07 | Methods | Parameters, return types, overloading, varargs |

```java
// Example: Pre vs Post Increment (Common Interview Question)
public class OperatorPractice {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x++ + ++x); // Output: 22
        // x++ → uses 10, then x becomes 11
        // ++x → x becomes 12, uses 12
        // 10 + 12 = 22
    }
}
```

---

### 🔵 Phase 2 — Object-Oriented Programming (OOP)

<p align="center">
  <img src="https://www.scientecheasy.com/wp-content/uploads/2018/06/oops-concepts-in-java.png" alt="OOP Concepts in Java" width="650"/>
</p>

> 📌 **Image Reference:** OOP Concepts in Java — [scientecheasy.com](https://www.scientecheasy.com)

| # | Topic | Key Concepts |
|---|-------|-------------|
| 08 | Classes & Objects | Constructors, `this` keyword, object creation |
| 09 | Inheritance | `extends`, `super`, method overriding |
| 10 | Polymorphism | Compile-time & runtime polymorphism |
| 11 | Abstraction | Abstract classes, Interfaces |
| 12 | Encapsulation | Getters/Setters, access modifiers |
| 13 | Static & Final | `static` methods/blocks, `final` keyword |

```java
// Example: Polymorphism in Test Automation
interface TestAction {
    void execute();
}

class ClickAction implements TestAction {
    public void execute() { System.out.println("Clicking element..."); }
}

class TypeAction implements TestAction {
    public void execute() { System.out.println("Typing into field..."); }
}
```

---

### 🟡 Phase 3 — Core Java Advanced

| # | Topic | Key Concepts |
|---|-------|-------------|
| 14 | Exception Handling | `try-catch-finally`, custom exceptions, `throws` |
| 15 | Collections Framework | `List`, `Set`, `Map`, `Queue`, `Deque` |
| 16 | Generics | Generic classes, methods, wildcards |
| 17 | Java Streams API | `filter()`, `map()`, `collect()`, `reduce()` |
| 18 | Lambda Expressions | Functional interfaces, method references |
| 19 | Multithreading | `Thread`, `Runnable`, `synchronized`, `ExecutorService` |
| 20 | File I/O | `FileReader`, `BufferedReader`, `Files`, `Path` |

```java
// Example: Stream API (Frequently asked in SDET interviews)
List<String> testCases = Arrays.asList("Login_Test", "Logout_Test", "Payment_Test", "Login_Smoke");

List<String> loginTests = testCases.stream()
    .filter(tc -> tc.startsWith("Login"))
    .sorted()
    .collect(Collectors.toList());

System.out.println(loginTests); // [Login_Smoke, Login_Test]
```

---

### 🔴 Phase 4 — SDET-Specific Topics

<p align="center">
  <img src="https://www.testingdocs.com/wp-content/uploads/Selenium-TestNG-Framework.png" alt="Selenium TestNG Framework Architecture" width="700"/>
</p>

> 📌 **Image Reference:** Selenium + TestNG Framework — [testingdocs.com](https://www.testingdocs.com)

| # | Topic | Description |
|---|-------|-------------|
| 21 | Selenium WebDriver | Element locators, waits, actions, navigation |
| 22 | TestNG Framework | Annotations, groups, data providers, listeners |
| 23 | JUnit 5 | `@Test`, `@BeforeEach`, parameterized tests |
| 24 | Page Object Model | POM design pattern for maintainable tests |
| 25 | Data-Driven Testing | Excel, JSON, CSV-driven test execution |
| 26 | API Testing | RestAssured, HTTP methods, JSON parsing |
| 27 | CI/CD Integration | Jenkins, GitHub Actions pipeline setup |
| 28 | Design Patterns | Factory, Singleton, Builder in test frameworks |

---

## 📂 Project Structure

```
JavaPractice-SDET-InterviewPrep/
│
├── src/
│   ├── basics/
│   │   ├── DataTypes.java
│   │   ├── OperatorPractice.java
│   │   ├── StringMethods.java
│   │   └── ArrayPrograms.java
│   │
│   ├── oops/
│   │   ├── InheritanceDemo.java
│   │   ├── PolymorphismDemo.java
│   │   ├── AbstractionDemo.java
│   │   └── EncapsulationDemo.java
│   │
│   ├── advanced/
│   │   ├── CollectionsPractice.java
│   │   ├── StreamApiPractice.java
│   │   ├── LambdaExpressions.java
│   │   ├── ExceptionHandling.java
│   │   └── MultithreadingDemo.java
│   │
│   └── sdet/
│       ├── selenium/
│       ├── testng/
│       ├── pageobjects/
│       └── apiTesting/
│
├── test/
│   ├── unit/
│   └── integration/
│
├── resources/
│   └── testdata/
│
├── pom.xml
├── testng.xml
└── README.md
```

---

## 🎯 SDET-Specific Topics

### Design Patterns Used in Test Automation

```java
// Singleton Pattern — WebDriver Manager
public class DriverManager {
    private static WebDriver driver;

    private DriverManager() {}

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }
}
```

```java
// Page Object Model Pattern
public class LoginPage {
    WebDriver driver;

    @FindBy(id = "username") WebElement usernameField;
    @FindBy(id = "password") WebElement passwordField;
    @FindBy(id = "loginBtn")  WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String user, String pass) {
        usernameField.sendKeys(user);
        passwordField.sendKeys(pass);
        loginButton.click();
    }
}
```

---

## ❓ Interview Questions by Topic

<details>
<summary><strong>☕ Java Basics (Click to Expand)</strong></summary>

1. What is the difference between `==` and `.equals()` in Java?
2. Explain the difference between `String`, `StringBuilder`, and `StringBuffer`.
3. What is the output of `x++ + ++x` when `x = 10`?
4. What are the 8 primitive data types in Java?
5. What is the difference between `break` and `continue`?

</details>

<details>
<summary><strong>🔵 OOP Concepts (Click to Expand)</strong></summary>

1. What is the difference between Abstraction and Encapsulation?
2. Can we override a `static` method in Java?
3. What is the difference between an Interface and an Abstract class?
4. What is method overloading vs. method overriding?
5. Explain the SOLID principles with examples.

</details>

<details>
<summary><strong>🟡 Collections & Streams (Click to Expand)</strong></summary>

1. What is the difference between `ArrayList` and `LinkedList`?
2. How does `HashMap` work internally?
3. What is the difference between `HashSet` and `TreeSet`?
4. How do you remove duplicates from a List using Java Streams?
5. What is the difference between `map()` and `flatMap()`?

</details>

<details>
<summary><strong>🔴 SDET / Automation (Click to Expand)</strong></summary>

1. What are implicit, explicit, and fluent waits in Selenium?
2. How do you handle dynamic web elements in Selenium?
3. Explain the Page Object Model design pattern.
4. What is the difference between `@BeforeMethod` and `@BeforeClass` in TestNG?
5. How do you perform data-driven testing with TestNG `@DataProvider`?
6. What is the difference between `findElement()` and `findElements()`?
7. How do you handle alerts, frames, and multiple windows in Selenium?

</details>

---

## 🚀 How to Run

### Prerequisites
- Java JDK 17+
- Maven 3.8+
- IntelliJ IDEA / Eclipse

### Clone the Repository

```bash
git clone https://github.com/YourUsername/JavaPractice-SDET-InterviewPrep.git
cd JavaPractice-SDET-InterviewPrep
```

### Run All Tests

```bash
mvn clean test
```

### Run a Specific Test Class

```bash
mvn -Dtest=OperatorPractice test
```

### Run via TestNG XML

```bash
mvn test -DsuiteXmlFile=testng.xml
```

---

## 📈 Progress Tracker

| Phase | Topics | Status |
|-------|--------|--------|
| Phase 1 | Java Basics | ✅ Complete |
| Phase 2 | OOP Concepts | ✅ Complete |
| Phase 3 | Advanced Java | 🔄 In Progress |
| Phase 4 | SDET / Automation | 🔄 In Progress |
| Phase 5 | Mock Interviews | 📅 Planned |

---

## 🤝 Contributing

Contributions are welcome! If you'd like to add more questions, solutions, or improvements:

1. Fork the repository
2. Create a feature branch: `git checkout -b feature/add-collections-questions`
3. Commit your changes: `git commit -m "Add HashMap internal working example"`
4. Push to the branch: `git push origin feature/add-collections-questions`
5. Open a Pull Request

---

## Author: Ritwik Vinay 
### Email : vinayritwik@gmail.com 


---

<p align="center">
  Made with ❤️ for the SDET Community | Happy Testing! 🧪
</p>