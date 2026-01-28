package TechCrunch;

import TechCrunch.Pages.HomePage;
import TechCrunch.Pages.StoryLinesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StoryLinesPageTest extends BaseTest {

   @Test(enabled = false)
   public void verifyTheCountOfBlockPosts() {
       HomePage homePage = new HomePage(webDriver);
       StoryLinesPage storyLinesPage = homePage.clickOnStoryLines(0);
       int countOfAllBlockPosts = storyLinesPage.getCountOfAllBlockPosts();
       int countOfBlockPostsWithoutImageOrVideo = storyLinesPage.getCountOfBlockPostsWithoutImageOrVideo();
       int countOfBlockPostsWithImageOrVideo = storyLinesPage.getCountOfBlockPostsWithImageOrVideo();
       Assert.assertEquals(countOfAllBlockPosts, countOfBlockPostsWithoutImageOrVideo + countOfBlockPostsWithImageOrVideo);
   }
}
