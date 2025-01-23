package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NewWindowPage;
import pages.WindowPage;
import pages.WindowsMainPage;
import utils.BrowserUtils;

public class WindowsTest extends BaseTest {

    @Test
    public void testWindows() {
        WindowsMainPage windowsMainPage = new WindowsMainPage();
        windowsMainPage.clickWindowsLink();

        WindowPage windowPage = new WindowPage();
        windowPage.openNewWindow();

        BrowserUtils browserUtils = new BrowserUtils();
        browserUtils.newWindow();

        NewWindowPage newWindowPage = new NewWindowPage();
        Assert.assertTrue(newWindowPage.state().waitForDisplayed(), "New window is not opened");
    }
}

