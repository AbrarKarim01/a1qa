package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ArticlePage;

import static io.qameta.allure.Allure.step;

public class ArticlePageSteps {
    private final ArticlePage articlePage = new ArticlePage();

    @When("I click on Tool menu and Download as PDF button on the Article Page")
    public void clickOnDownloadAsPDFButton() {
        step("I click on Tool menu");
        articlePage.clickToolButton();
        step("I click on Download as PDF button");
        articlePage.clickDownloadAsPDFButton();
    }

    @When("I click on Tool menu and Page Information button on the Article Page")
    public void clickOnPageInformationButton() {
        step("I click on Tool menu");
        articlePage.clickToolButton();
        step("I click on Page Information button");
        articlePage.clickPageInformationButton();
    }

    @Then("Article Page is opened with {string} title")
    public void articlePageIsOpened(String text) {
        step("Article Page is opened");
        Assert.assertTrue(articlePage.getPageTitle().contains(text),"Article Page is not displayed");
    }
}
