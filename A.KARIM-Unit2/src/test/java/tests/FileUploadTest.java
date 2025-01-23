package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class FileUploadTest extends BaseTest {
    private final String FILE_NAME = "file.json";
    private final String UPLOAD_DIR = "D:\\Files_Abrar\\MdAbrarKarim_JOB\\A1QA\\Unit2\\javaUnit_Selenium\\src\\test\\java\\tests\\resources\\";
    private final String FILE_PATH = UPLOAD_DIR + FILE_NAME;

    private final By FILE_UPLOAD = By.xpath(String.format(PRECISE_TEXT_XPATH, "File Upload"));

    //3 more locators for interaction with elements
    private final By CHOOSE_FILE = By.id("file-upload");
    private final By FILE_SUBMIT = By.id("file-submit");
    private final By UPLOAD_FILE = By.id("uploaded-files");


    @Test
    public void fileUploadTest() {
        driver.findElement(FILE_UPLOAD).click();
        File fileToUpload = new File(FILE_PATH);

        // to interact with element that uploads files on the page
        driver.findElement(CHOOSE_FILE).sendKeys(fileToUpload.getAbsolutePath());

        //click on the submit button
        driver.findElement(FILE_SUBMIT).click();

        Assert.assertEquals(driver.findElement(UPLOAD_FILE).getText(), FILE_NAME, "File Name is incorrect");
    }
}
