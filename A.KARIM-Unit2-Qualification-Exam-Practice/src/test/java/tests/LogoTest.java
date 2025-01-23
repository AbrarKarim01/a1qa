package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoTest extends BaseTest{
    private final By IFRAME_ID = By.xpath("//iframe[@id='frame2']");
    private final By LOGO = By.xpath("//img[@class='Image Logo NavBar__Logo Logo__lg']");

    @Test
    public void logoTest() {
        driver.switchTo().frame(driver.findElement(IFRAME_ID));
        Assert.assertTrue(driver.findElement(LOGO).isDisplayed(), "Logo is not displayed");
    }
}
