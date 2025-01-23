package pages;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class InformationPage extends Form {
    private static final By BY_PAGE_UNIQUE_ID = By.xpath("//tr[@id='mw-pageinfo-display-title']// td[2]");

    public InformationPage() {
        super(BY_PAGE_UNIQUE_ID, "Information Page");
    }

    public String getPageTitle() {
        return getElementFactory().getLabel(BY_PAGE_UNIQUE_ID, "Page Title").getText();
    }
}
