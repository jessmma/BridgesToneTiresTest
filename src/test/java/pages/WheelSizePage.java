package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.WaitForHelper;

import java.util.List;

public class WheelSizePage extends BasePage{

    public WheelSizePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //Locators
    @FindBy(linkText = "22\"")
    WebElement WheelSize22;

    @FindBy(linkText = "21\"")
    WebElement WheelSize21;

    @FindBy(linkText = "20\"")
    WebElement WheelSize20;

    @FindBy(linkText = "19\"")
    WebElement WheelSize19;

    @FindBy(linkText = "18\"")
    WebElement WheelSize18;

    @FindBy(linkText = "17\"")
    WebElement WheelSize17;

    @FindBy(linkText = "16\"")
    WebElement WheelSize16;

    @FindBy(linkText = "15\"")
    WebElement WheelSize15;

    @FindBy(linkText = "14\"")
    WebElement WheelSize14;

    @FindBy(className = "cc-close__btn")
    WebElement closeCookiesPopUp;

    public void setCloseCookiesPopUp(){
        waitForElementToAppear(closeCookiesPopUp);
        closeCookiesPopUp.click();
    }
    public void selectWheelSize22(){
        waitForElementToAppear(WheelSize22);
        WheelSize22.click();
    }

    public void selectWheelSize21(){
        waitForElementToAppear(WheelSize21);
        WheelSize21.click();
    }

    public void selectWheelSize20(){
        waitForElementToAppear(WheelSize20);
        WheelSize20.click();
    }

    public void selectWheelSize19(){
        waitForElementToAppear(WheelSize19);
        WheelSize19.click();
    }

    public void selectWheelSize18(){
        waitForElementToAppear(WheelSize18);
        WheelSize18.click();
    }

    public void selectWheelSize17(){
        waitForElementToAppear(WheelSize17);
        WheelSize17.click();
    }

    public void selectWheelSize16(){
        waitForElementToAppear(WheelSize16);
        WheelSize16.click();
    }

    public void selectWheelSize15(){
        waitForElementToAppear(WheelSize15);
        WheelSize15.click();
    }

    public void selectWheelSize14(){
        waitForElementToAppear(WheelSize14);
        WheelSize14.click();
    }

}
