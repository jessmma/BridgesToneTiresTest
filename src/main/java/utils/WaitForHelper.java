package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitForHelper extends Driver{
    WebDriver driver = Driver.getDriver();

    public WaitForHelper(WebDriver driver) {

    }
    //Method for driver to wait for a set amount of time defined in config properties 'elementLoadTimeout'
    public void implicitWait()
    {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt(PropertyReader.readItem("elementLoadTimeout")), TimeUnit.SECONDS);
    }

    public void waitForSeconds(int secs) {
        try {
            Thread.sleep(1000 * secs);
        } catch (InterruptedException e) {
        }
    }

    //Method for driver to wait until a Web Element is visible
    public WebElement presenceOfTheElement(WebElement elementIdentifier) {
        return new WebDriverWait(driver, 20)
                .until(ExpectedConditions.visibilityOf(elementIdentifier));
    }

    public WebElement waitUntilClickable(WebElement elementIdentifier){
        return new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(elementIdentifier));
    }
}