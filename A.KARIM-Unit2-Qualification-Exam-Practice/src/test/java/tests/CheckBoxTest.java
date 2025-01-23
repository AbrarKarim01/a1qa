package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {
    private final By CHECK_BOX_LINK = By.xpath("//a[@href='/checkboxes']");
    private final By CHECK_BOX_SELECTED = By.xpath("//form[@id='checkboxes']/input[2]");

    @Test
    public void checkBoxTest() {
        driver.findElement(CHECK_BOX_LINK).click();

        Assert.assertTrue(driver.findElement(CHECK_BOX_SELECTED).isSelected(), "Check box is not selected");
    }
}
