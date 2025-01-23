package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.elements.interfaces.ILabel;
import org.openqa.selenium.By;

public class ForecastPage {
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final ILabel header = elementFactory.getLabel(By.className("header-loc"), "Header");

    public String getHeaderText() {
        return header.getText();
    }
}
