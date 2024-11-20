package TechCrunch.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    By latestNewsItems = By.cssSelector(".latest-news-section .wp-block-column:first-of-type .wp-block-post");
    By author = By.cssSelector(".loop-card__author");
    By image = By.cssSelector(".loop-card__figure img");
    By storyLinesItems = By.cssSelector(".wp-techcrunch-storyline-posts__item");
    By upcomingEventsSeeMoreButton = By.cssSelector(".upcoming-events-header-section .wp-block-buttons");
    By signInButton = By.cssSelector(".wp-block-techcrunch-sign-in[aria-hidden=\"false\"]");
    By loggedInUserNameSpanBy = By.cssSelector(".wp-block-techcrunch-sign-in[aria-hidden=\"false\"] .wp-block-techcrunch-sign-in__profile__first-name");

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

    private List<WebElement> getStoryLinesItems() {
        return webDriver.findElements(storyLinesItems);
    }

    public StoryLinesPage clickOnStoryLines(int indexOfStoryLines) {
        List<WebElement> storyLinesItems = getStoryLinesItems();
        if (storyLinesItems.isEmpty()) {
            throw new IllegalStateException("No storylines found on the Storylines list.");
        }

        storyLinesItems.get(indexOfStoryLines).click();
        return new StoryLinesPage(webDriver);
    }

    public EventsPage clickOnUpcomingEventsSeeMoreButton() {
        webDriver.findElement(upcomingEventsSeeMoreButton).click();
        return new EventsPage(webDriver);
    }

    public SignInPage clickSignInButton() throws InterruptedException {
        Thread.sleep(2000);
        webDriver.findElement(signInButton).click();
        return new SignInPage(webDriver);
    }

    public String getLoggedInUserName() {
        return webDriver.findElement(loggedInUserNameSpanBy).getText().replace("Hi, ", "");
    }

}
