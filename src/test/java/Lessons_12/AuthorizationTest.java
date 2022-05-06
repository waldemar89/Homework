package Lessons_12;


import com.pagesLesson12.LoginPage;
import BaseTest.Base;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AuthorizationTest extends Base {
    @Test()
    @DisplayName("Authentication with correct password/login")
    public void checkCorrectDate() {
        new LoginPage().goToStartPage()
                .clickOnEnterButton()
                .setLogin("kvpua89@gmail.com")
                .setPassword("Kvp_1381989")
                .clickOnSubmitButton()
                .clickOnAccountPage()
                .clickOnSingOut()
                .clickOnContinue();
    }

    @Test()
    @DisplayName("Authentication with incorrect password")
    public void checkIncorrectPassword() {
        new LoginPage().goToStartPage()
                .clickOnEnterButton()
                .setLogin("kvpua89@gmail.com")
                .setPassword("Kvp_0000000")
                .clickOnSubmitButton();
    }
}

