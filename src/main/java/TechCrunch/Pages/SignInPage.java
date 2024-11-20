package TechCrunch.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {

    By createAnAccountButtonBy = By.cssSelector(".sign-up-link");

    public SignInPage(WebDriver webDriver) {
        super(webDriver);
    }

    public CreateAccountPage createAnAccount() {
        webDriver.findElement(createAnAccountButtonBy).click();
        return new CreateAccountPage(webDriver);
    }
}
