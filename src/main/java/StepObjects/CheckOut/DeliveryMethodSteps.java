package StepObjects.CheckOut;

import PageObjects.CheckOut.DeliveryMethod;
import io.qameta.allure.Step;

public class DeliveryMethodSteps {

    DeliveryMethod deliveryMethod = new DeliveryMethod();

    @Step("Click on continue button")
    public DeliveryMethodSteps continueButtonClick() {
        deliveryMethod.continueButton.click();
        return this;
    }

}
