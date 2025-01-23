package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.ElementType;
import aquality.selenium.elements.interfaces.*;
import org.openqa.selenium.By;

import java.util.List;

public class MainPage {
    private final IElementFactory elementFactory = AqualityServices.getElementFactory();
    private final IButton understandBtn = elementFactory.getButton(By.className("banner-button"), "I Understand");
    private final ITextBox textField = elementFactory.getTextBox(By.className("search-input"), "Input field");
    private final By SEARCH_RESULT_XPATH = By.className("search-bar-result__name");

    public void clickUnderstandButton() {
        understandBtn.click();
    }

    public void inputText(String text) {
        textField.clearAndType(text);
    }

    public boolean isSearchResultDisplayed() {
        return elementFactory.getLabel(SEARCH_RESULT_XPATH, "Search Results").state().waitForDisplayed();
    }

    public void clickOnFirstSearchResult() {
        getSearchResults().get(0).click();
    }

    private List<ILabel> getSearchResults() {
        return elementFactory.findElements(SEARCH_RESULT_XPATH, ElementType.LABEL);
    }
}
