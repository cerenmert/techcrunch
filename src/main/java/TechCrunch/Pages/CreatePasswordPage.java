package TechCrunch.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreatePasswordPage extends BasePage {

    By passwordFieldBy = By.cssSelector("#cpwd-password.password");
    By continueButton = By.id("ch-pwd-submit-btn");
    String password = "letsdothis123.";

    public CreatePasswordPage(WebDriver webDriver) {
        super(webDriver);
    }

    public HomePage createPassword() throws InterruptedException {
        webDriver.findElement(passwordFieldBy).sendKeys(password);
        Thread.sleep(3000);
        webDriver.findElement(continueButton).click();
        return new HomePage(webDriver);
    }
}
