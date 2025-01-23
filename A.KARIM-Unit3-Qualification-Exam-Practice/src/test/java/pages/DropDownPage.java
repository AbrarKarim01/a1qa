package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class DropDownPage extends Form{
    private static final By locator = By.xpath("//select[@id='dropdown']");
    private final IButton BTN_DROPDOWN = getElementFactory().getButton(locator, "Dropdown Button");
    private final IButton BTN_OPTION = getElementFactory().getButton(By.xpath("//option[@value='2']"), "Option 2");
    private final IButton BTN_SELECTED = getElementFactory().getButton(By.xpath("//option[@value='2' and @selected='selected']"), "Selected Option 2");

    public DropDownPage() {
        super(locator, "Dropdown Page Locator");
    }

    public void clickDropdown() {
        BTN_DROPDOWN.click();
    }

    public void clickOption() {
        BTN_OPTION.click();
    }

    public boolean isOptionSelected() {
        return BTN_SELECTED.state().isDisplayed();
    }
}
