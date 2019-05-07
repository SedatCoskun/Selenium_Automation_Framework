import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverWrapper {

    private static WebDriver driver = null;
    private static final String url = "https://www.facebook.com/";

    @BeforeClass
    public void before() {

        //Set chromeDriver
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        //Initialize webDriver interface
        driver = new ChromeDriver( );


        //Navigate to url
        driver.navigate( ).to(url);

    }
    @AfterClass
    public void tearDown(){

        driver.quit();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static String getUrl() {
        return url;
    }




}
