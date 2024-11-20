package TechCrunch.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StoryLinesPage extends BasePage {

    By allBlockPosts = By.cssSelector(".wp-block-column:nth-of-type(1) .wp-block-post");
    By blockPostsWithoutImageOrVideo = By.cssSelector(".wp-block-column:nth-of-type(1) .wp-block-post.has-post-thumbnail");
    By blockPostsWithImageOrVideo = By.cssSelector(".wp-block-column:nth-of-type(1) .wp-block-post.tc_snippet");

    public StoryLinesPage(WebDriver webDriver) {
        super(webDriver);
    }

    public int getCountOfAllBlockPosts() {
        return webDriver.findElements(allBlockPosts).size();
    }

    public int getCountOfBlockPostsWithoutImageOrVideo() {
        return webDriver.findElements(blockPostsWithoutImageOrVideo).size();
    }

    public int getCountOfBlockPostsWithImageOrVideo() {
        return webDriver.findElements(blockPostsWithImageOrVideo).size();
    }
}
