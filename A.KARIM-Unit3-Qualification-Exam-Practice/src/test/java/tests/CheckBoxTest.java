package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBoxMainPage;
import pages.CheckBoxPage;

public class CheckBoxTest extends BaseTest{

    @Test
    public void testCheckBox() {
        CheckBoxMainPage checkBoxMainPage = new CheckBoxMainPage();
        checkBoxMainPage.clickCheckBoxLink();

        CheckBoxPage checkBoxPage = new CheckBoxPage();
        Assert.assertTrue(checkBoxPage.isCheckBoxSelected(), "Checkbox 2 is not selected");
    }
}
