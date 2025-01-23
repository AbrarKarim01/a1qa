package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class CheckBoxMainPage extends Form {
    private static final By CHECK_BOX_LINK = By.xpath("//a[@href='/checkboxes']");
    private final IButton checkBoxLink = getElementFactory().getButton(CHECK_BOX_LINK, "Checkboxes");

    public CheckBoxMainPage() {
        super(CHECK_BOX_LINK, "Checkboxes");
    }

    public void clickCheckBoxLink() {
        checkBoxLink.click();
    }
}
