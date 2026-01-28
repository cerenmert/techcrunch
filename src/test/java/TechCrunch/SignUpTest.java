package TechCrunch;

import TechCrunch.Pages.*;
import TechCrunch.Users.User;
import TechCrunch.Users.UserPool;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {

    @Test(enabled = false)
    public void shouldSignUp() throws InterruptedException {
        HomePage homePage = new HomePage(webDriver);
        SignInPage signInPage = homePage.clickSignInButton();
        CreateAccountPage createAccountPage = signInPage.createAnAccount();
        User user = UserPool.getUser1();
        VerificationCodePage verificationCodePage = createAccountPage.createAnAccount(user);
        //Test is passing. But here, code is sent to mock email address
        //We can get the code from there and write manually on the screen while debugging.
        //Another solution will be checked for this.
        verificationCodePage.verifyCode("X");
        webDriver.findElement(By.cssSelector(".puree-button-primary")).click();
        CreatePasswordPage createPasswordPage = new CreatePasswordPage(webDriver);
        HomePage homePage2 = createPasswordPage.createPassword();
        Assert.assertEquals(homePage2.getLoggedInUserName(), user.getFirstName());
        System.out.println("User is successfully signed up!");
    }
}
