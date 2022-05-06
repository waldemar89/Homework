package com.pagesLesson12;


public class LoginPage extends BasePage {
    public LoginPage setLogin(String login){
        findByXpath("//*[@type='email']").sendKeys(login);
        return this;
    }
    public LoginPage setPassword(String password){
        findByXpath("//*[@type='password']").sendKeys(password);
            return this;
        }

    public LoginPage clickOnSubmitButton(){
        findByXpath("//button[@class='sb-button sb-button--full-width']").click();
        return this;
    }
    public LoginPage clickOnAccountPage(){
        findByXpath("//*[@id='idcta-username']").click();
        return this;
    }
    public LoginPage clickOnSingOut(){
        findByXpath("//*[contains(text(), 'Sign out')]").click();
        return this;
    }
    public LoginPage clickOnContinue(){
        findByCss("[class='button']").click();
        return this;
    }




}
