package TechCrunch;

import TechCrunch.Pages.HomePage;
import TechCrunch.Pages.NewsPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class NewsPageTest extends BaseTest {

    @Test
    public void doesArticleTitleIsSameWithBrowserTitle() {
        HomePage homePage = new HomePage(webDriver);
        NewsPage newsPage = homePage.clickOnNews(1);
        String articleTitle = newsPage.getArticleTitle();
        String browserTitle = newsPage.getBrowserTitle();
        Assert.assertEquals(articleTitle, browserTitle, "Article title is different from browser title!");
    }

    @Test
    public void verifyLinksInTheArticle() {
        HomePage homePage = new HomePage(webDriver);
        NewsPage newsPage = homePage.clickOnNews(0);
        List<WebElement> linkList = newsPage.getNewsContentLinks();
        Assert.assertFalse(linkList.isEmpty(), "There is no link in the article!");
    }
}
