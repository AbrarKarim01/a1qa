package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class DownloadPDFPage extends Form {
    private static final By DOWNLOAD_BUTTON = By.xpath("//button[contains(@class, 'oo-ui-buttonElement-button')]");
    private final IButton downloadButton = getElementFactory().getButton(DOWNLOAD_BUTTON, "Download PDF Button");
    private final ILabel downloadLabel = getElementFactory().getLabel(By.xpath("//div[@class='mw-electronpdfservice-selection-label-desc']"), "Download PDF Label");

    public DownloadPDFPage() {
        super(DOWNLOAD_BUTTON, "Download PDF Page");
    }

    public void clickDownloadButton() {
        downloadButton.click();
    }

    public String getDownloadLabel() {
        return downloadLabel.getText();
    }
}
