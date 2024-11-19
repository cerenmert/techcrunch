# Tech Blog Website Test Automation

This project is a test automation project for a tech blog website. The project is written in Java and uses Selenium WebDriver, TestNG, and Maven. The project is designed to test the functionality of the website and to ensure that the website is working as expected.

## Getting Started

To get started with the project, you will need to have Java, Maven, and an IDE installed on your machine. You will also need to have the Chrome browser installed on your machine.

### Prerequisites

To run the project, you will need to have the following software installed on your machine:

- Java
- Maven
- Chrome browser
- IDE (IntelliJ IDEA, Eclipse, etc.)

## Test Cases

The project includes the following test cases:

### [HomePageTest.java](src/test/java/TechCrunch/HomePageTest.java)

#### verifyEachNewsHasAnAuthor

This test case verifies that each news on the homepage has an author.

#### verifyEachNewsHasAnImage

This test case verifies that each news on the homepage has an image.

### [NewsPageTest.java](src/test/java/TechCrunch/NewsPageTest.java)

#### doesArticleTitleIsSameWithBrowserTitle

This test case verifies that the article title is the same as the browser title.

#### verifyLinksInTheArticle

This test case verifies that the article has any links.

### [EventsPageTest.java](src/test/java/TechCrunch/EventsPageTest.java)

#### verifyListedDatesAndEventNamesContainSelectedYear

This test case verifies that the listed dates and event names contain the selected year after filtering.

### [StoryLinesPageTest.java](src/test/java/TechCrunch/StoryLinesPageTest.java)

#### verifyTheCountOfBlockPosts

This test case verifies that the total count of block posts.

## Author

Created by [Ceren Çakır](mailto:ceren1481@hotmail.com)