package com.pagesLesson14;


import org.openqa.selenium.WebElement;

public class PricingPage extends BasePage {
    public PricingPage clickOnRequestSpecialist() {
        findByXpath("//*[text()='Request specialists']").click();
        return this;
    }

    public PricingPage clickOnCoockies() {
        findByXpath("//*[text()='Accept cookies']").click();
        return this;
    }

    public PricingPage clickOnCloseButton() {
        findByXpath("//button[@class='CloseButton-module--close--4GI9o CloseButton-module--themeDark--Gr8Dp']").click();
        return this;
    }

    public PricingPage clickGetPrice() {
        findByXpath("//*[@class='button-module--button--P1TTA']").click();
        return this;
    }

    public PricingPage clickBanner() {
        findByXpath("//*[@class='Header-module--logo--7bOtT']").click();
        return this;
    }

    public PricingPage clickOnClose() {
        findByXpath("//button[@class='CloseButton-module--close--4GI9o']").click();
        return this;
    }

    public WebElement getRequestSpecialists() {
        return findByXpath("//*[contains(text(),'Request specialists' )]");
    }

    public WebElement getGetPrice() {
        return findByXpath("//*[contains(text(),'Get price')]");
    }
}
