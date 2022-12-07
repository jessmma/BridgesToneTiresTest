package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.TireSizePage;
import pages.TireSizeResultsPage;
import pages.WheelSizePage;
import utils.Driver;
import utils.PropertyReader;
import utils.WaitForHelper;

import java.io.IOException;

public class BaseTest extends Driver {

    PropertyReader pr = new PropertyReader();

    @Test (priority = 1)
    public void viewTireSizesforWheel22() {
        WheelSizePage wheelSizePage = new WheelSizePage();
        TireSizePage tireSizePage = new TireSizePage();
        getDriver().get(PropertyReader.readItem("url"));
        wheelSizePage.setCloseCookiesPopUp();
        wheelSizePage.selectWheelSize22();
        tireSizePage.getTireSizeOptions();
    }

    @Test (priority = 1)
    public void viewTireSizesforWheel21() {
        WheelSizePage wheelSizePage = new WheelSizePage();
        TireSizePage tireSizePage = new TireSizePage();
        getDriver().get(PropertyReader.readItem("url"));
        wheelSizePage.setCloseCookiesPopUp();
        wheelSizePage.selectWheelSize21();
        tireSizePage.getTireSizeOptions();

    }

    @Test (priority = 1)
    public void viewTireSizesforWheel20() {
        WheelSizePage wheelSizePage = new WheelSizePage();
        TireSizePage tireSizePage = new TireSizePage();
        getDriver().get(PropertyReader.readItem("url"));
        wheelSizePage.setCloseCookiesPopUp();
        wheelSizePage.selectWheelSize20();
        tireSizePage.getTireSizeOptions();
    }

    @Test (priority = 1)
    public void viewTireSizesforWheel19() {
        WheelSizePage wheelSizePage = new WheelSizePage();
        TireSizePage tireSizePage = new TireSizePage();
        getDriver().get(PropertyReader.readItem("url"));
        wheelSizePage.setCloseCookiesPopUp();
        wheelSizePage.selectWheelSize19();
        tireSizePage.getTireSizeOptions();
    }

    @Test (priority = 1)
    public void viewTireSizesforWheel18() {
        WheelSizePage wheelSizePage = new WheelSizePage();
        TireSizePage tireSizePage = new TireSizePage();
        TireSizeResultsPage tireSizeResultsPage= new TireSizeResultsPage();
        getDriver().get(PropertyReader.readItem("url"));
        wheelSizePage.setCloseCookiesPopUp();
        wheelSizePage.selectWheelSize18();
        tireSizePage.getTireSizeOptions();
    }

    @Test (priority = 1)
    public void viewTireSizesforWheel17() {
        WheelSizePage wheelSizePage = new WheelSizePage();
        TireSizePage tireSizePage = new TireSizePage();
        getDriver().get(PropertyReader.readItem("url"));
        wheelSizePage.setCloseCookiesPopUp();
        wheelSizePage.selectWheelSize17();
        tireSizePage.getTireSizeOptions();
    }

    @Test (priority = 1)
    public void viewTireSizesforWheel16() {
        WheelSizePage wheelSizePage = new WheelSizePage();
        TireSizePage tireSizePage = new TireSizePage();
        getDriver().get(PropertyReader.readItem("url"));
        wheelSizePage.setCloseCookiesPopUp();
        wheelSizePage.selectWheelSize16();
        tireSizePage.getTireSizeOptions();
    }

    @Test (priority = 1)
    public void viewTireSizesforWheel15() {
        WheelSizePage wheelSizePage = new WheelSizePage();
        TireSizePage tireSizePage = new TireSizePage();
        getDriver().get(PropertyReader.readItem("url"));
        wheelSizePage.setCloseCookiesPopUp();
        wheelSizePage.selectWheelSize15();
        tireSizePage.getTireSizeOptions();
    }

    @Test (priority = 1)
    public void viewTireSizesforWheel14() {
        WheelSizePage wheelSizePage = new WheelSizePage();
        TireSizePage tireSizePage = new TireSizePage();
        getDriver().get(PropertyReader.readItem("url"));
        wheelSizePage.setCloseCookiesPopUp();
        wheelSizePage.selectWheelSize14();
        tireSizePage.getTireSizeOptions();
    }

    @Test (priority = 2)
    public void viewResults() throws IOException {
        TireSizeResultsPage tireSizeResultsPage = new TireSizeResultsPage();
        tireSizeResultsPage.openResultsWindows();
        tireSizeResultsPage.writeToExcel();
    }

}
