package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class WindowPage extends Form {
    private static final By locator = By.xpath("//a[@href='/windows/new']");
    private final IButton newWindowButton = getElementFactory().getButton(locator, "New Window");

    public WindowPage() {
        super(locator, "New Window");
    }

    public void openNewWindow() {
        newWindowButton.click();
    }
}
