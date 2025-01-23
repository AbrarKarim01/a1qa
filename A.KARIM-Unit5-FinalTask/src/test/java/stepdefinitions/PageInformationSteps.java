package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.InformationPage;

import static io.qameta.allure.Allure.step;

public class PageInformationSteps {
    private final InformationPage informationPage = new InformationPage();

    @Then("Information page for {string} article is displayed")
    public void checkPageInformationPage(String text) {
        step("I should see the information page");
        Assert.assertTrue(informationPage.getPageTitle().contains(text),"Page Information is not displayed");
    }
}
