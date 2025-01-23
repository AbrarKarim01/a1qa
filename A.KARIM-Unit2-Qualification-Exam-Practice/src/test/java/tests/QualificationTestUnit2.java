package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class QualificationTestUnit2 extends BaseTest{
    private final By SAMPLE_APP_BTN = By.xpath("//a[@href='/sampleapp']");
    private final By USER_NAME_INPUT = By.xpath("//input[@type='text']");
    private final By PASSWORD_INPUT = By.xpath("//input[@type='password']");
    private final String RANDOM_TEXT = UUID.randomUUID().toString();
    private final String PASSWORD = "pwd";
    private final By LOGIN_BTN = By.xpath("//button[@id='login']");
    private final By TEXT_SUCCESS = By.xpath("//label[@id='loginstatus']");

    @Test
    public void testQualification2() {
        driver.findElement(SAMPLE_APP_BTN).click();
        Assert.assertTrue(driver.findElement(USER_NAME_INPUT).isDisplayed(), "Page is not Displayed");

        driver.findElement(USER_NAME_INPUT).sendKeys(RANDOM_TEXT);

        driver.findElement(PASSWORD_INPUT).sendKeys(PASSWORD);

        driver.findElement(LOGIN_BTN).click();
        wait.until(driver -> driver.findElement(TEXT_SUCCESS).isDisplayed());
        Assert.assertTrue((driver.findElement(TEXT_SUCCESS).getText()).contains(RANDOM_TEXT), "Text is not displayed");
    }
}
