package stepdefinitions;

import constants.Languages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;

import static io.qameta.allure.Allure.step;

public class MainPageSteps {
    private final MainPage mainPage = new MainPage();

    @Then("Main Page is open")
    public void mainPageIsOpened() {
        step("Main Page is opened");
        Assert.assertTrue(mainPage.state().isDisplayed(),"Main Page is not displayed");
    }

    @When("I search for {string} on the Main Page")
    public void inputText(String text) {
        step(String.format("I search for %s on the Main Page", text));
        mainPage.inputText(text);
    }

    @When("I change the language to {string}")
    public void changeLanguage(String language) {
        step("I click on the language button selector");
        mainPage.changeLanguage(Languages.valueOf(language.toUpperCase()));
    }

    @When("I click on the submit button")
    public void clickSubmitButton() {
        step("I click on the submit button");
        mainPage.clickSubmitButton();
    }
}
