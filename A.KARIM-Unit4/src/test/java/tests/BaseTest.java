package tests;

import aquality.selenium.browser.AqualityServices;
import pages.MainPage;
import utils.SettingsTestData;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static aquality.selenium.browser.AqualityServices.getBrowser;
import static io.qameta.allure.Allure.step;

public abstract class BaseTest {
    protected MainPage mainPage = new MainPage();

    @BeforeMethod
    public void setup() {
        step("Open the browser and go to the URL");
        getBrowser().goTo(SettingsTestData.getEnvData().getHost());
        step("Maximize the browser window");
        getBrowser().maximize();
    }

    @AfterMethod
    public void teardown() {
        step("Close the browser");
        if (AqualityServices.isBrowserStarted()) {
            getBrowser().quit();
        }
    }
}
