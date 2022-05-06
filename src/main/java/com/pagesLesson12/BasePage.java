package com.pagesLesson12;

import com.driver_manager.DriverManager;
import org.openqa.selenium.*;


public class BasePage {

    protected String startPage = "https://www.bbc.com/";

    protected WebDriver driver;

    public BasePage(){
         this.driver = DriverManager.getDriver();
    }

    public WebElement findByXpath(String xpath){
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement findByCss(String css){
        return driver.findElement(By.cssSelector(css));
    }


    public StartPage goToStartPage(){
        DriverManager.getDriver().get(startPage);
        return new StartPage();
    }
}
