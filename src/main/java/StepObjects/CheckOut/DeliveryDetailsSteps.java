package StepObjects.CheckOut;

import PageObjects.CheckOut.DeliveryDetails;
import io.qameta.allure.Step;

public class DeliveryDetailsSteps {

    DeliveryDetails deliveryDetails = new DeliveryDetails();

    @Step("Click on continue button")
    public DeliveryDetailsSteps continueButtonClick() {
        deliveryDetails.continueButton.click();
        return this;
    }

}
