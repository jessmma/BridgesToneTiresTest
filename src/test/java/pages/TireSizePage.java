package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class TireSizePage extends BasePage{

    public TireSizePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Adding all Tire Sizes located on the page to tiresSizes
    //tireSizes is a synchronized list, that allows to add elements while running multiple tests in parallel
    public void getTireSizeOptions(){
        List<WebElement> tireSizesOptions = driver.findElements(By.xpath("//a[@class='button button--secondary']"));
        for(WebElement element:tireSizesOptions){
            tiresSizes.add(element.getText());
        }
   }

}
