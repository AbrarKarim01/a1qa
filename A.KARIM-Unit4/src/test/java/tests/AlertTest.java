package tests;

import aquality.selenium.browser.AlertActions;
import pages.AlertPage;
import constants.MainPageNavigation;
import org.testng.Assert;
import org.testng.annotations.Test;

import static aquality.selenium.browser.AqualityServices.getBrowser;
import static io.qameta.allure.Allure.step;
import static io.qameta.allure.Allure.suite;

public class AlertTest extends BaseTest {
    private final AlertPage alertPage = new AlertPage();

    @Test
    public void alertTest() {
        suite("Alert Test");
        step("Click Navigation Link");
        mainPage.clickNavigationLink(MainPageNavigation.JAVASCRIPT_ALERT);
        step("Click for JS Alert");
        alertPage.clickForJsAlertBtn();
        step("Accept Alert");
        getBrowser().handleAlert(AlertActions.ACCEPT);
        Assert.assertTrue(alertPage.isSuccessLabelDisplayed(), "Success msg is not displayed");
        step("Dismiss Alert");
        alertPage.acceptAlert();
    }

    @Test
    public void alertTest1() {
        suite("Alert Test1");
        step("Click Navigation Link");
        mainPage.clickNavigationLink(MainPageNavigation.JAVASCRIPT_ALERT);
        step("Click for JS Alert");
        alertPage.clickForJsAlertBtn();
        step("Accept Alert");
        getBrowser().handleAlert(AlertActions.ACCEPT);
        Assert.assertTrue(alertPage.isSuccessLabelDisplayed(), "Success msg is not displayed");
        step("Dismiss Alert");
        alertPage.acceptAlert();
    }

    @Test
    public void alertTest2() {
        suite("Alert Test");
        step("Click Navigation Link");
        mainPage.clickNavigationLink(MainPageNavigation.JAVASCRIPT_ALERT);
        step("Click for JS Alert");
        alertPage.clickForJsAlertBtn();
        step("Accept Alert");
        getBrowser().handleAlert(AlertActions.ACCEPT);
        Assert.assertTrue(alertPage.isSuccessLabelDisplayed(), "Success msg is not displayed");
        step("Dismiss Alert");
        alertPage.acceptAlert();
    }
}
