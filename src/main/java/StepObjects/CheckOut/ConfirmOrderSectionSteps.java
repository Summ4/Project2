package StepObjects.CheckOut;

import PageObjects.CheckOut.ConfirmOrderSection;
import io.qameta.allure.Step;
import org.testng.Assert;

public class ConfirmOrderSectionSteps {

    ConfirmOrderSection confirmOrderSect = new ConfirmOrderSection();
    static String flatShipping = "5.00";
    static double subTotal;

    @Step("Check subtotal value")
    public ConfirmOrderSectionSteps subTotalCheck() {


        //Due to a malfunction of the website,sometimes quantity gets empty string value,so there is a need to use if statements
        String quantity = confirmOrderSect.quantity.getText();
        if (quantity.equals("")) quantity = confirmOrderSect.quantity.getText();
        String unitPrice = confirmOrderSect.unitPrice.getText().substring(1);
        if (quantity.equals("")) quantity = confirmOrderSect.quantity.getText();

        subTotal = Double.parseDouble(quantity) * Double.parseDouble(unitPrice);

        Assert.assertEquals(Double.parseDouble(confirmOrderSect.subTotal.getText().substring(1)), subTotal);
        return this;
    }

    @Step("Check flat shipping value")
    public ConfirmOrderSectionSteps flatShippingCheck() {
        Assert.assertEquals(confirmOrderSect.flatShipping.getText().substring(1), flatShipping);
        return this;
    }

    @Step("Check total amount")
    public ConfirmOrderSectionSteps totalAmountCheck() {
        double totalAmount = Double.parseDouble(flatShipping) + subTotal;
        double total = Double.parseDouble(confirmOrderSect.total.getText().substring(1));
        Assert.assertEquals(total, totalAmount);
        return this;
    }

    @Step("Click on confirm order button")
    public ConfirmOrderSectionSteps confirmOrderButtonClick() {
        confirmOrderSect.confirmOrderButton.click();
        return this;

    }

}
