# TechCrunch Automation Project

This repository contains the test automation framework for [TechCrunch](https://techcrunch.com/), a leading technology media property, dedicated to obsessively profiling startups, reviewing new internet products, and breaking tech news.

The project is built using Java, Selenium WebDriver, and TestNG, employing the Page Object Model (POM) design pattern for better code maintenance and readability.

## 🛠 Technology Stack

- **Language**: Java 15
- **Automation Tool**: Selenium WebDriver
- **Test Framework**: TestNG
- **Build Tool**: Maven
- **WebDriver Manager**: Bonigarcia WebDriverManager

## 📂 Project Structure

The project follows a standard Maven directory structure.

- `src/main/java/TechCrunch/Pages`: Contains Page Object classes representing web pages (e.g., `HomePage`, `NewsPage`).
- `src/main/java/TechCrunch/Users`: Contains User data models and helper classes.
- `src/test/java/TechCrunch`: Contains the actual test classes (e.g., `HomePageTest`, `NewsPageTest`).

## 🚀 Getting Started

### Prerequisites

Ensure you have the following installed on your local machine:
- **Java Development Kit (JDK) 15**: Verify with `java -version`
- **Maven**: Verify with `mvn -version`
- **Chrome Browser**

### Installation

1. Clone the repository:
   ```bash
   git clone <repository_url>
   ```
2. Navigate to the project directory:
   ```bash
   cd techcrunch
   ```
3. Install dependencies:
   ```bash
   mvn clean install -DskipTests
   ```

## 🧪 Running Tests

To run all tests using Maven:
```bash
mvn test
```

To run a specific test class:
```bash
mvn -Dtest=HomePageTest test
```

## 📝 Test Coverage

### Homepage
- **Verify Authors**: Ensures every news article on the homepage has an author listed.
- **Verify Images**: Ensures every news article on the homepage has an associated image.

### News Page
- **Browser Title Check**: Verifies that the browser title matches the article title.
- **Link Verification**: Checks for the presence of links within the article content.

### Events Page
- **Filter Verification**: Verifies that filtering functionality works correctly (e.g., listing events for a selected year).

### Story Lines Page
- **Block Post Count**: Verifies the correct count of block posts.

### Sign Up
- **Flow Verification**: Validates the user sign-up process.

## 👤 Author

Created by [Ceren Çakır](mailto:ceren1481@hotmail.com)