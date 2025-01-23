package pages;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class NewWindowPage extends Form {
    private static final By locator = By.className("example");

    public NewWindowPage() {
        super(locator, "New Window");
    }
}
