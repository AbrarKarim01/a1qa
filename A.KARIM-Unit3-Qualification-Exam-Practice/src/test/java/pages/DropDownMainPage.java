package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class DropDownMainPage extends Form {
    private static final By locator = By.xpath("//a[@href='/dropdown']");
    private final IButton BTN_DROPDOWN = getElementFactory().getButton(locator, "Dropdown Button");

    public DropDownMainPage() {
        super(locator, "Main Page Locator");
    }

    public void openDropdownPage() {
        BTN_DROPDOWN.click();
    }
}
