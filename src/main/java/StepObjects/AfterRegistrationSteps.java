package StepObjects;

import PageObjects.AfterRegistrationPage;
import io.qameta.allure.Step;

public class AfterRegistrationSteps {

    AfterRegistrationPage afterReg = new AfterRegistrationPage();

    @Step("Click on Laptops item")
    public AfterRegistrationSteps laptopsClick() {
        afterReg.laptopsNnotebooks.click();
        return this;
    }

    @Step("Click on show all laptops")
    public AfterRegistrationSteps showAllLaptopsClick() {
        afterReg.showAllLaptops.click();
        return this;
    }

}
