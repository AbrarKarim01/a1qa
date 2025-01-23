package pages;

import aquality.selenium.core.elements.ElementState;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IComboBox;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import constants.Languages;
import org.openqa.selenium.By;

public class MainPage extends Form {
    private final ITextBox textField = getElementFactory().getTextBox(By.id("searchInput"), "Input field");
    private final IButton submitButton = getElementFactory().getButton(By.xpath("//button[@type='submit']"), "Submit button");
    private final IComboBox languageButtonSelector = getElementFactory().getComboBox(By.xpath("//select[@id='searchLanguage']"), "Language button selector", ElementState.EXISTS_IN_ANY_STATE);

    public MainPage() {
        super(By.id("www-wikipedia-org"),"Main Page");
    }

    public void inputText(String text) {
        textField.clearAndType(text);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void changeLanguage(Languages language) {
        languageButtonSelector.selectByValue(language.getLanguageCode());
    }
}
