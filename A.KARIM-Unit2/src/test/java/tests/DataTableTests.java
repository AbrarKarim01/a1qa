package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DataTableTests extends BaseTest {
    private final By SORTABLE_DATA_TABLES = By.xpath(String.format(PRECISE_TEXT_XPATH, "Sortable Data Tables"));


    //Creating another locator for locating the elements of table1 where all the 4th elements are in the table1.
    private final By DUE_ELEMENTS_LOCATOR = By.xpath("//*[@id='table1']//td[4]");
    //Expected Result
    private final Double EXPECTED_SUM = 251.0;

    //for removing the symbols from string the with regular expression "[^\\d.]"
    private final String CURRENCY_REGEX =  "[^\\d.]";


    @Test
    public void dataTableTest() {
        driver.findElement(SORTABLE_DATA_TABLES).click();

        //Grab all elements with the locator using findElement
        List <WebElement> dueList = driver.findElements(DUE_ELEMENTS_LOCATOR);

        //Storing the sum of the grabbed elements
        Double actualSum = 0.0;

        for (int i = 0; i < dueList.size(); i++) {

            //Retrieve the WebElement at index 'i' from the dueList
            //creating an object of the WebElement interface
            WebElement element = dueList.get(i);

            //Extract the text content of the current WebElement
            String elementText = element.getText();

            //Adding the elements
            //Converting the text to double
            //Removing the symbols such as $
            actualSum = actualSum + Double.parseDouble(elementText.replaceAll(CURRENCY_REGEX, ""));
        }

        Assert.assertEquals(actualSum, EXPECTED_SUM, "Sum is not correct");
    }
}
