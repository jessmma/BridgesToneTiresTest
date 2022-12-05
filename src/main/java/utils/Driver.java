package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;

public class Driver {
    protected static ThreadLocal<ChromeDriver> driver = new ThreadLocal<>();

    @BeforeMethod
    public void setUp(){

        try {
            //If the value of 'browser' defined in config.properties is equal to 'chrome'
            //it will setup the Webdriver to Chrome Driver
            if (PropertyReader.readItem("browser").equalsIgnoreCase("chrome")) {
                System.out.println("Chrome Browser Found");
                WebDriverManager.chromedriver().setup();
                driver.set(new ChromeDriver());
            } else {
                try {
                    throw new Exception("Browser or Browser Driver is not supported yet.");
                } catch (Exception e) {
                    e.getMessage( );
                    e.printStackTrace( );
                    System.out.println("Browser launch failure: "+ e);
                }
            }
        } catch (Exception e) {
            System.out.println("Chrome Launch Failure:"+e);
        }
    }

    public static WebDriver getDriver(){
        return driver.get();
    }


    @AfterMethod
    public void tearDown() {
        getDriver().quit();
        driver.remove();
    }
}
