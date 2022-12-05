package tests;

import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.WheelSizePage;
import utils.Driver;
import utils.PropertyReader;
import utils.WaitForHelper;

public class BaseTest extends Driver {

    PropertyReader pr = new PropertyReader();

    @Test
    public void viewTireSizesforWheel22() {
        WheelSizePage wheelSizePage = new WheelSizePage();
        getDriver().get(PropertyReader.readItem("url"));
        wheelSizePage.selectWheelSize22();

    }
}
