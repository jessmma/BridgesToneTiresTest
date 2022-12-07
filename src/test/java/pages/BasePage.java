package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Driver;
import utils.WaitForHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasePage extends Driver{
    WebDriver driver = Driver.getDriver();
    static List<String> tiresSizes = Collections.synchronizedList(new ArrayList<>());

    //Conditional wait for one of the elements on the search results page to be present
    public void waitForElementToAppear(WebElement webElement) {
        new WaitForHelper(driver).presenceOfTheElement(webElement);
    }

    //Conditional wait until element is clickable
    public void waitUntilIsClickable(WebElement webElement) {
        new WaitForHelper(driver).waitUntilClickable(webElement);
    }

    //Scroll page to a web element
    public void scrollToElement(WebElement webElement) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", webElement);
    }

    //Moves to the web element specified in the params
    public void moveToElement(WebElement webElement) {

        new Actions(driver).moveToElement(webElement).build( ).perform( );

    }

    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }
}
