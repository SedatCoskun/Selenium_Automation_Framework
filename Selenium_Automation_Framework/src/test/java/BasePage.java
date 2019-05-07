import org.openqa.selenium.By;

public class BasePage {

    public void clickOn(By locator) {

        DriverWrapper.getDriver().findElement(locator).click();

    }

    public void setValue(String value, By locator) {
        DriverWrapper.getDriver().findElement(locator).sendKeys(value);

    }
    public String getTextFromElement(By locator) {

        return DriverWrapper.getDriver().findElement(locator).getText();
    }
}
