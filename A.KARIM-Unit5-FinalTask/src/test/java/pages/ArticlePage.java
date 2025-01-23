package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class ArticlePage extends Form {
    private static final By PAGE_UNIQUE_ID = By.xpath("//span[@class='mw-page-title-main']");
    private final IButton toolButton = getElementFactory().getButton(By.xpath("//div[@id='vector-page-tools-dropdown']"), "Tool Button");
    private final IButton downloadAsPDFButton = getElementFactory().getButton(By.id("coll-download-as-rl"), "Download PDF Button");
    private final IButton pageInformationButton = getElementFactory().getButton(By.id("t-info"), "Page Information Button");

    public ArticlePage() {
        super(PAGE_UNIQUE_ID, "Article Page");
    }

    public String getPageTitle() {
        return getElementFactory().getLabel(PAGE_UNIQUE_ID, "Page Title").getText();
    }

    public void clickToolButton() {
        toolButton.click();
    }

    public void clickDownloadAsPDFButton() {
        downloadAsPDFButton.click();
    }

    public void clickPageInformationButton() {
        pageInformationButton.click();
    }
}
