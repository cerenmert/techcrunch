package TechCrunch.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    By latestNewsItems = By.cssSelector(".latest-news-section .wp-block-column:first-of-type .wp-block-post");
    By author = By.cssSelector(".loop-card__author");
    By image = By.cssSelector(".loop-card__figure img");

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public List<WebElement> getLatestNewsItems() {
        return webDriver.findElements(latestNewsItems);
    }

    public WebElement getAuthorForEachNews(WebElement newsItem) {
        return newsItem.findElement(author);
    }

    public WebElement getImageForEachNews(WebElement newsItem) {
        return newsItem.findElement(image);
    }

    public NewsPage clickOnNews(int indexOfNews) {
        List<WebElement> newsItems = getLatestNewsItems();
        if (newsItems.isEmpty()) {
            throw new IllegalStateException("No news found on the Latest News list.");
        }

        newsItems.get(indexOfNews).click();
        return new NewsPage(webDriver);
    }
}
