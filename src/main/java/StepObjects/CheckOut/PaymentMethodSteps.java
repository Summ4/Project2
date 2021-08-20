package StepObjects.CheckOut;

import PageObjects.CheckOut.PaymentMethod;
import io.qameta.allure.Step;

public class PaymentMethodSteps {

    PaymentMethod paymentMethod = new PaymentMethod();

    @Step("Click on Checkbox")
    public PaymentMethodSteps checkBoxClick() {
        paymentMethod.termsNConditionsCheckbox.click();
        return this;
    }

    @Step("Click on continue button")
    public PaymentMethodSteps continueButtonClick() {
        paymentMethod.continueButton.click();
        return this;
    }

}
