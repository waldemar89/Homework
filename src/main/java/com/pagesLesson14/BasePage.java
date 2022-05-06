package com.pagesLesson14;

import com.driver_manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected String mainPage = "https://andersenlab.com/";

    protected WebDriver driver;

    public BasePage() {
        this.driver = DriverManager.getDriver();
    }

    public WebElement findByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    public WebElement findByCss(String css) {
        return driver.findElement(By.cssSelector(css));
    }

    public MainPage goToMainPage() {
        DriverManager.getDriver().get(mainPage);
        return new MainPage();
    }
    // public WebElement findByText(String text){
    // return driver.findElement(By.xpath(String.format("//*[@text='%s']",text)));
    // }

}
