package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Driver;
import utils.WaitForHelper;

public class BasePage extends Driver{
    WebDriver driver = Driver.getDriver();

    //Conditional wait for one of the elements on the search results page to be present
    public void waitForElementToAppear(WebElement webElement) {
        new WaitForHelper(driver).presenceOfTheElement(webElement);
    }

    //Waits for a set amount of time
    public void waitForTime() {
        new WaitForHelper(driver).implicitWait( );
    }

    //To write text on an element i.e. type a username in a username field
    public void writeText(WebElement webElement, String text) {
        webElement.clear();
        webElement.sendKeys(text);
    }

    //To get the text of an Element
    public String readText(WebElement webElement) {

        return webElement.getText();
    }

    //Moves to the web element specified in the params
    public void moveToElement(WebElement webElement) {

        new Actions(driver).moveToElement(webElement).build( ).perform( );

    }

    public String getCurrentURL(){
        String currentURL = driver.getCurrentUrl();
        return currentURL;
    }
}
