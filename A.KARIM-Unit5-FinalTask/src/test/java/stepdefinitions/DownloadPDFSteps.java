package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.DownloadPDFPage;
import utils.FileUtils;

import java.io.File;

import static aquality.selenium.browser.AqualityServices.getBrowser;
import static io.qameta.allure.Allure.step;

public class DownloadPDFSteps {
    private final DownloadPDFPage downloadPDFPage = new DownloadPDFPage();

    @When("I click on Download button")
    public void clickOnDownloadButton() {
        step("I click on Download button");
        downloadPDFPage.clickDownloadButton();
    }

    @Then("I should see the file downloaded")
    public void downloadFile() {
        String fileName = getBrowser().getDownloadDirectory() + File.separator + downloadPDFPage.getDownloadLabel();
        File downloadedFile = new File(fileName);
        step("I should see the file downloaded");
        Assert.assertTrue(FileUtils.isFileExist(downloadedFile),"File is not downloaded");
    }
}
