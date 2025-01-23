package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProviderTest extends BaseTest {
    private final By FULL_NAME = By.id("userName");
    private final By EMAIL = By.id("userEmail");
    private final By CURRENT_ADDRESS = By.id("currentAddress");
    private final By PERMANENT_ADDRESS = By.id("permanentAddress");
    private final By SUBMIT = By.id("submit");
    private final By NAME_OUTPUT = By.id("name");
    private final By EMAIL_OUTPUT = By.id("email");
    private final By OUTPUT = By.id("output");
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }
    @Test(dataProvider = "dpMethod", dataProviderClass = DataProviders.class)
    public void test(String name, String email, String currentAddress, String permanentAddress) {
        driver.findElement(FULL_NAME).sendKeys(name);
        driver.findElement(EMAIL).sendKeys(email);
        driver.findElement(CURRENT_ADDRESS).sendKeys(currentAddress);
        driver.findElement(PERMANENT_ADDRESS).sendKeys(permanentAddress);

        driver.findElement(SUBMIT).click();

        Assert.assertTrue(driver.findElement(NAME_OUTPUT).getText().contains(name));
        Assert.assertTrue(driver.findElement(EMAIL_OUTPUT).getText().contains(email));
        Assert.assertTrue(driver.findElement(OUTPUT).getText().contains(currentAddress));
        Assert.assertTrue(driver.findElement(OUTPUT).getText().contains(permanentAddress));
    }
}
