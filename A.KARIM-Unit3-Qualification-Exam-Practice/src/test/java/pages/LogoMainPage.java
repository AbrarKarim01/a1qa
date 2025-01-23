package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class LogoMainPage extends Form {
    private static final By IFRAME_ID = By.xpath("//iframe[@id='frame2']");
    private final ILabel frame = getElementFactory().getLabel(IFRAME_ID, "Logo");
    private final ILabel logo = getElementFactory().getLabel(By.xpath("//img[contains(@class, 'NavBar')]"), "Logo");

    public LogoMainPage() {
        super(IFRAME_ID, "Logo");
    }

    public void switchToFrame() {
        getBrowser().getDriver().switchTo().frame(frame.getElement());
    }

    public boolean isDisplayed() {
        return logo.state().isDisplayed();
    }
}
