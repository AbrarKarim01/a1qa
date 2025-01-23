package tests;

import org.awaitility.Awaitility;
import org.awaitility.core.ConditionTimeoutException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


import java.io.File;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class FileDownloadTest extends BaseTest {
    private final String FILE_NAME = "test.txt";
    private final By FILE_DOWNLOAD = By.xpath(String.format(PRECISE_TEXT_XPATH, "File Download"));
    private final By FILE_NAME_XPATH = By.xpath(String.format(PRECISE_TEXT_XPATH, FILE_NAME));

    //specifying the root directory
    private final String DOWNLOAD_DIR = "C:\\Users\\arafa\\Downloads\\";

    //RELATIVE_RESOURCES_PATH = baseTest
    //combining for path to the file itself
    private final String FILE_PATH = DOWNLOAD_DIR + FILE_NAME;

    //to verify the file is there
    private final File downloadedFile = new File(FILE_PATH);


    @Test
    public void fileDownloadTest() {
        driver.findElement(FILE_DOWNLOAD).click();
        Assert.assertTrue(driver.findElement(FILE_NAME_XPATH).isDisplayed(), "File is not displayed");
        driver.findElement(FILE_NAME_XPATH).click();
        Assert.assertTrue(isFileExists(downloadedFile), "file is not downloaded");
    }

    //to check the file is there or not
    private boolean isFileExists(File file){
        try {
            Awaitility.await().atMost(MAX_WAIT, TimeUnit.SECONDS).until(file::exists);
        }
        catch (ConditionTimeoutException exception){

            return false;
        }
        return true;
    }

    @AfterMethod
    public void deleteFile() {
        if (downloadedFile.exists()){
            downloadedFile.delete();
        }
    }
}
