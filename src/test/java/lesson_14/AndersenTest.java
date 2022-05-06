package lesson_14;


import BaseTest.Base;
import com.pagesLesson14.MainPage;
import com.pagesLesson14.PricingPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AndersenTest extends Base {
    Logger logger = LoggerFactory.getLogger(AndersenTest.class);
    MainPage mainPage = new MainPage();
    PricingPage pricingPage = new PricingPage();

    @BeforeAll
    public static void clickOnCookies() {
        new PricingPage().goToMainPage()
                .clickOnEnterButton()
                .clickOnCoockies();
    }

    @Test()
    @DisplayName("Test for checking the correct display of the window 'Request specialists'")

    public void checkRequestSpecialist() {
        new PricingPage().goToMainPage()
                .clickOnEnterButton()
                .clickOnRequestSpecialist()
                .clickOnCloseButton()
                .clickBanner();
        logger.info("Test for checking the correct display of the window 'Request specialists'");
        Assertions.assertTrue(mainPage.getBanner().isDisplayed(), "Banner is not displayed");
        Assertions.assertEquals(mainPage.getBanner().getText(), "Take the software path to your digital future");
    }

    @Test()
    @DisplayName("Test for checking the correct display of the window 'Get price'")
    public void checkGetPrice() {
        new PricingPage().goToMainPage()
                .clickOnEnterButton()
                .clickGetPrice()
                .clickOnClose();
        logger.info("Test for checking the correct display of the window 'Get price'");
        Assertions.assertTrue(pricingPage.getRequestSpecialists().isDisplayed(), "Button 'Request specialists' not exist");
        Assertions.assertTrue(pricingPage.getGetPrice().isDisplayed(), "Button 'Get price' not exist");

    }

}
