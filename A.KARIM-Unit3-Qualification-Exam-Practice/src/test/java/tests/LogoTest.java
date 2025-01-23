package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogoMainPage;

public class LogoTest extends BaseTest {

    @Test
    public void testLogo() {
        LogoMainPage logoTest = new LogoMainPage();

        logoTest.switchToFrame();

        Assert.assertTrue(logoTest.isDisplayed(), "Logo is not displayed");
    }
}
