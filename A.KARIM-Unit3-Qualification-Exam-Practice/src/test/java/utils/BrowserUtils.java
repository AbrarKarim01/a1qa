package utils;

import static aquality.selenium.browser.AqualityServices.getBrowser;
import static aquality.selenium.browser.AqualityServices.getConditionalWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class BrowserUtils {

    public void newWindow(){
        String mainWindow = getBrowser().getDriver().getWindowHandle();
        getConditionalWait().waitFor(numberOfWindowsToBe(2));
        for (String windowHandle : getBrowser().getDriver().getWindowHandles()) {
            if (!mainWindow.contentEquals(windowHandle)) {
                getBrowser().getDriver().switchTo().window(windowHandle);
                break;
            }
        }
        getConditionalWait().waitFor(titleIs("New Window"));
    }
}
