package tests;

import org.awaitility.Awaitility;
import org.awaitility.core.ConditionTimeoutException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DownloadPdfTest extends BaseTest {
    private final By WEBPAGE_UNIQUEELEMENT = By.id("www-wikipedia-org");
    private final String INIT_TEXT = "Albert Einstein";
    private final By SEARCH_FIELD = By.id("searchInput");
    private final By SUBMIT_BUTTON = By.xpath("//button[@type='submit']");
    private final By TOOL_BUTTON = By.id("vector-page-tools-dropdown-checkbox");
    private final By DOWNLOADASPDF_BUTTON = By.id("coll-download-as-rl");
    private final By DOWNLOAD_BUTTON = By.xpath("//button[contains(@class, 'oo-ui-buttonElement-button')]");
    private final By GENERATEDPDF_NAME = By.className("mw-electronpdfservice-selection-label-desc");

    @Test
    public void finalTest() {
        List<WebElement> webpageUniqueId = driver.findElements(WEBPAGE_UNIQUEELEMENT);
        Assert.assertTrue(webpageUniqueId.size() <= 1, "Webpage is not displayed");

        WebElement textField = driver.findElement(SEARCH_FIELD);
        textField.sendKeys(INIT_TEXT);
        driver.findElement(SUBMIT_BUTTON).click();

        driver.findElement(TOOL_BUTTON).click();
        driver.findElement(DOWNLOADASPDF_BUTTON).click();

        WebElement pdfNameElement = driver.findElement(GENERATEDPDF_NAME);
        String pdfName = pdfNameElement.getText();
        String filePath = RELATIVE_RESOURCE_PATH + pdfName;
        File downloadedFile = new File(filePath);
        driver.findElement(DOWNLOAD_BUTTON).click();
        Assert.assertTrue(isFileExists(downloadedFile), "file is not downloaded");
    }

    private boolean isFileExists(File file) {
        try {
            Awaitility.await().atMost(MAX_WAIT, TimeUnit.SECONDS).until(file::exists);
        } catch (ConditionTimeoutException exception) {
            return false;
        }
        return true;
    }
}
