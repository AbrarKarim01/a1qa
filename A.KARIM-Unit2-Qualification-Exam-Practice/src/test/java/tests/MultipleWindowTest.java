package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class MultipleWindowTest extends BaseTest {
    private final By MULTIPLE_WINDOW_LINK = By.linkText("Multiple Windows");
    private final By CLICK_HERE_LINK = By.xpath("//a[@href='/windows/new']");
    private final By NEW_WINDOW_TEXT = By.xpath("//h3[text()='New Window']");

    @Test
    public void multipleWindowTest() {
        driver.findElement(MULTIPLE_WINDOW_LINK).click();

        driver.findElement(CLICK_HERE_LINK).click();
        String mainWindow = driver.getWindowHandle();
        wait.until(numberOfWindowsToBe(2));
        for (String windowHandle : driver.getWindowHandles()) {
            if (!mainWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        wait.until(titleIs("New Window"));
        Assert.assertTrue(driver.findElement(NEW_WINDOW_TEXT).isDisplayed(), "New window text is not displayed");
    }
}
