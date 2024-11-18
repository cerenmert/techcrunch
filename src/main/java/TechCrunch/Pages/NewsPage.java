package TechCrunch.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewsPage extends BasePage {

    By articleTitle = By.cssSelector(".wp-block-post-title.has-body-1-font-size");
    By articleLinks = By.cssSelector(".entry-content a");

    public NewsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getArticleTitle() {
         return webDriver.findElement(articleTitle).getText();
    }

    public List<WebElement> getNewsContentLinks() {
        return  webDriver.findElements(articleLinks);
    }

    public String getBrowserTitle() {
        // The page has postfix with website name which is ` | TechCrunch`. Remove that part.
        return webDriver.getTitle().replace(" | TechCrunch", "");
    }
}
