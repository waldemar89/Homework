package com.pagesLesson14;


import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {
    public PricingPage clickOnEnterButton() {
        findByCss("[class='button-module--button--P1TTA button-module--sizeSM--CuRl3 button-module--theme-header-transparent--a9CXO']").click();
        return new PricingPage();
    }

    public WebElement getBanner() {
        return findByXpath("//*[contains(text(),'Take the software path to your digital future' )]");
    }
}
