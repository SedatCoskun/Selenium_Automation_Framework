import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    //Locators
    private By recoveryEmailLink = By.linkText("Recover Your Account");


    //Methods
    public String getRecoveryLinkText() {
        return getTextFromElement(recoveryEmailLink);
    }
}
