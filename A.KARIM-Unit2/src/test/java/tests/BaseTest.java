package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class BaseTest {
    protected final String URL = "https://the-internet.herokuapp.com/"; // website URL
    protected final int MAX_WAIT = 10; // wait for managing browser on different devices
    protected final String PRECISE_TEXT_XPATH = "//*[text()='%s']"; // blueprint for locator
    protected final String PARTICULAR_TEXT_XPATH = "//*[contains(text(),'%s')]"; // blueprint for locator
    protected final String RELATIVE_RESOURCE_PATH = "src/test/resources/"; // resources we are going to use
    protected WebDriver driver;
    protected WebDriverWait wait;

    // Branch Creation Test
    //Push Check!

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver(); // creating a new instance of driver
        driver.manage().window().maximize(); //changing the size of the window, easier to locate the element
        wait = new WebDriverWait(driver, Duration.ofSeconds(MAX_WAIT));
        driver.get(URL); // getting the website itself
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    } //destroy the driver
}
