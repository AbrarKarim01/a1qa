package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import constants.LocatorConstants;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class AlertPage extends Form {
    private static final String PAGE_NAME = "JavaScript Alerts";
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final By CLICK_FOR_JS_ALERT_BUTTON = By.xpath("//button[@onclick='jsAlert()']");
    private final By SUCCESS_MESSAGE = By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, "You successfully clicked an alert"));
    private final IButton clickForJsAlertBtn = elementFactory.getButton(CLICK_FOR_JS_ALERT_BUTTON, "Click for JS alert");
    private final ILabel successLbl = elementFactory.getLabel(SUCCESS_MESSAGE, "Success");

    public AlertPage() {
        super(By.xpath(String.format(LocatorConstants.PRECISE_TEXT_XPATH, PAGE_NAME)), PAGE_NAME);
    }

    public void clickForJsAlertBtn() {
        clickForJsAlertBtn.click();
    }

    public boolean isSuccessLabelDisplayed() {
        return successLbl.state().isDisplayed();
    }

    @Step ("Accepting alert")
    public void acceptAlert() {
        System.out.println("Accepting alert");
    }
}
