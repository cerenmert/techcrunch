package TechCrunch;

import TechCrunch.Pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyEachNewsHasAnAuthor() {
        HomePage homePage = new HomePage(webDriver);
        List<WebElement> newsItems = homePage.getLatestNewsItems();
        for (WebElement eachNews : newsItems) {
            WebElement author = homePage.getAuthorForEachNews(eachNews);
            Assert.assertNotNull(author, "News item doesn't have author element.");
            String authorName = author.getText();
            Assert.assertFalse(authorName.isEmpty(), "News item doesn't have author name.");
        }
    }

    @Test
    public void verifyEachNewsHasAnImage() {
        HomePage homePage = new HomePage(webDriver);
        List<WebElement> newsItems = homePage.getLatestNewsItems();
        for (WebElement eachNews : newsItems) {
            WebElement image = homePage.getImageForEachNews(eachNews);
            Assert.assertTrue(image.isDisplayed(), "News item doesn't have image element.");
        }
    }
}
