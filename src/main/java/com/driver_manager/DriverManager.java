package com.driver_manager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager {
    private static WebDriver driver;

    private static void setDriver(){
        driver = new ChromeDriver(WebDriverConfig.configChrome());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public static WebDriver getDriver(){
        if (driver == null){
            setDriver();
        }
        return driver;
    }
    public static void closeDriver(){
        driver.close();
        driver = null;
    }

}
