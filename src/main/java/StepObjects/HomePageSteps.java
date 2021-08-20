package StepObjects;

import PageObjects.HomePage;
import io.qameta.allure.Step;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Step("Click on my account")
    public HomePageSteps myAccountClick() {
        homePage.myAccount.click();
        return this;
    }

    @Step("Click on register")
    public HomePageSteps registerClick() {
        homePage.register.click();
        return this;
    }


}
