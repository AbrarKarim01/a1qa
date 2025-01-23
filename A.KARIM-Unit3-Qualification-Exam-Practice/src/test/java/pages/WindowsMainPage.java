package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class WindowsMainPage extends Form {
    private static final By WINDOWS_LINK = By.xpath("//a[@href='/windows']");
    private final IButton windowsLink = getElementFactory().getButton(WINDOWS_LINK, "Windows");

    public WindowsMainPage() {
        super(WINDOWS_LINK, "Windows");
    }

    public void clickWindowsLink() {
        windowsLink.click();
    }
}
