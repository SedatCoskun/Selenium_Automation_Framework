import org.openqa.selenium.By;

public class HomePage extends BasePage{

    //Locators
    private By emailTextField = By.id("email");
    private By passTextField = By.id("pass");
    private By loginButton = By.id("loginbutton");



    //Constructors

    //Methods
    public void enterEmail(String email) {

        setValue(email, emailTextField);
    }
    public void enterPassword(String password) {

        setValue(password, passTextField);
    }
    public void clickOnLoginButton() {

        clickOn(loginButton);
    }
}
