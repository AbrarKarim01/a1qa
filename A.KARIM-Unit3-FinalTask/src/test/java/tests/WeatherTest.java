package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForecastPage;
import pages.MainPage;

public class WeatherTest extends BaseTest {
    private final String INIT_TEXT = "New York";

    @Test
    public void cityWeatherTest() {
        MainPage weatherMainPage = new MainPage();
        weatherMainPage.clickUnderstandButton();

        weatherMainPage.inputText(INIT_TEXT);
        Assert.assertTrue(weatherMainPage.isSearchResultDisplayed(), "Search results are not displayed.");

        ForecastPage weatherForecastPage = new ForecastPage();
        weatherMainPage.clickOnFirstSearchResult();
        Assert.assertTrue(weatherForecastPage.getHeaderText().contains(INIT_TEXT), "City weather page header does not contain city name from the search.");
    }
}
