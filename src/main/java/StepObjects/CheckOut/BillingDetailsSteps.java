package StepObjects.CheckOut;

import DataObjects.dbObjects;
import PageObjects.CheckOut.BillingDetailsSection;
import io.qameta.allure.Step;

import java.sql.SQLException;

public class BillingDetailsSteps {

    BillingDetailsSection billingDetails = new BillingDetailsSection();
    dbObjects db = new dbObjects();

    public BillingDetailsSteps() {
    }

    @Step("Get Database objects")
    public BillingDetailsSteps getDBObjects() throws SQLException {
        db.getDBObjects();
        return this;
    }

    @Step("Billing data re-enter")
    public BillingDetailsSteps reEnterData() {
        if (!billingDetails.payment_new.exists()) {
            billingDetails.billingDetails.click();
            if (billingDetails.newAddressRadioBtn.exists()) billingDetails.newAddressRadioBtn.click();
        }
        return this;
    }

    @Step("Set First Name: {0}")
    public BillingDetailsSteps firstNameInput(String firstName) {
        billingDetails.fName.setValue(firstName);
        return this;
    }

    @Step("Set Last Name: {0}")
    public BillingDetailsSteps lastNameInput(String lastName) {
        billingDetails.lName.setValue(lastName);
        return this;
    }

    @Step("Set Address: {0}")
    public BillingDetailsSteps addressInput(String address) {
        billingDetails.address.setValue(address);
        return this;
    }

    @Step("Set City: {0}")
    public BillingDetailsSteps cityInput(String city) {
        billingDetails.city.setValue(city);
        return this;
    }

    @Step("Set Post Code: {0}")
    public BillingDetailsSteps postCodeInput(String postCode) {
        billingDetails.postCode.setValue(String.valueOf(postCode));
        return this;
    }

    @Step("Set Country: {0}")
    public BillingDetailsSteps selectCountry(String country) {
        billingDetails.country.selectOptionContainingText(country);
        return this;
    }

    @Step("Set Region: {0}")
    public BillingDetailsSteps selectState(String state) {
        billingDetails.region.selectOptionContainingText(state);
        return this;
    }

    @Step("Click on continue button")
    public BillingDetailsSteps continueButtonclick() {
        billingDetails.continueButton.click();
        return this;
    }


}
