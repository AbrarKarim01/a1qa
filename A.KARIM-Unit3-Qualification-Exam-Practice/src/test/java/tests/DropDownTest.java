package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.DropDownMainPage;

public class DropDownTest extends BaseTest {

    @Test
    public void dropDownTest() {
        DropDownMainPage dropDownMainPage = new DropDownMainPage();
        dropDownMainPage.openDropdownPage();

        DropDownPage dropDownPage = new DropDownPage();
        Assert.assertTrue(dropDownPage.state().isDisplayed(), "Dropdown page is not displayed");

        dropDownPage.clickDropdown();
        dropDownPage.clickOption();
        Assert.assertTrue(dropDownPage.isOptionSelected(), "Option 2 is not selected");
    }
}
