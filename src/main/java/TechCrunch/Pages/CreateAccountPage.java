package TechCrunch.Pages;

import TechCrunch.Users.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage {

    By nextButtonBy = By.id("reg-submit-button");
    By fullnameBy = By.id("usernamereg-fullname");
    By firstNameBy = By.cssSelector("#usernamereg-firstName.icon-name");
    By lastNameBy = By.id("usernamereg-lastName");
    By emailBy = By.cssSelector("#usernamereg-email.icon-email");
    By birthyearBy = By.id("usernamereg-birthYear");

    public CreateAccountPage(WebDriver webDriver) {
        super(webDriver);
    }

    public VerificationCodePage createAnAccount(User user) {
        webDriver.findElement(fullnameBy).click();
        webDriver.findElement(firstNameBy).sendKeys(user.getFirstName());
        webDriver.findElement(lastNameBy).sendKeys(user.getLastName());
        webDriver.findElement(emailBy).sendKeys(user.getEmail());
        webDriver.findElement(birthyearBy).sendKeys(user.getBirthYear());
        webDriver.findElement(nextButtonBy).click();
        return new VerificationCodePage(webDriver);

    }
}
