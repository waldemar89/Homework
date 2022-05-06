package com.pagesLesson12;

public class StartPage extends BasePage {
    public LoginPage clickOnEnterButton() {
        findByXpath("//*[@id='idcta-link']").click();
        return new LoginPage();
    }

}
