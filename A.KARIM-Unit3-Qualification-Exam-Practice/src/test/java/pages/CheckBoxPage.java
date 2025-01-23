package pages;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class CheckBoxPage extends Form {
    private static final By CHECK_BOX_SELECTED = By.xpath("//form[@id='checkboxes']/input[2]");

    public CheckBoxPage() {
        super(CHECK_BOX_SELECTED, "Check Box 2");
    }

    public boolean isCheckBoxSelected() {
        return getElementFactory().getCheckBox(CHECK_BOX_SELECTED, "Check Box 2").isChecked();
    }
}
