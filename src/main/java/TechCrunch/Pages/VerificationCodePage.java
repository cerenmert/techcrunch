package TechCrunch.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerificationCodePage extends BasePage {

    By verificationCodeBy = By.cssSelector(".input-group");
    By verificationCodeInputBy = By.xpath("//input[@id='verification-code-field']");
    By nextButtonBy = By.id("verify-code-button");

    public VerificationCodePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void verifyCode(String code) throws InterruptedException {
        webDriver.findElement(verificationCodeBy).click();
        Thread.sleep(2000);
        webDriver.findElement(verificationCodeInputBy).sendKeys(code);
        webDriver.findElement(nextButtonBy).click();
        Thread.sleep(2000);
    }
}
