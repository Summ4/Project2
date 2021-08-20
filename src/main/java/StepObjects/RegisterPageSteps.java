package StepObjects;

import DataObjects.dbObjects;
import PageObjects.RegisterPage;
import io.qameta.allure.Step;

import java.sql.SQLException;

public class RegisterPageSteps {

    RegisterPage register = new RegisterPage();
    dbObjects db = new dbObjects();

    public RegisterPageSteps() {
    }

    public RegisterPageSteps getDBObjects() throws SQLException {
        db.getDBObjects();
        return this;
    }

    @Step("Set First Name: {0}")
    public RegisterPageSteps firstNameInput(String firstName) {
        register.firstName.setValue(firstName);
        return this;
    }

    @Step("Set Last Name: {0}")
    public RegisterPageSteps lastNameInput(String lastName) {
        register.lastName.setValue(lastName);
        return this;
    }

    @Step("Set Phone Number: {0}")
    public RegisterPageSteps phoneInput(String phoneNumber) {
        register.phone.setValue(phoneNumber);
        return this;
    }

    @Step("Set Email: {0}")
    public RegisterPageSteps emailInput(StringBuilder email) {
        register.email.setValue(String.valueOf(email));
        return this;
    }

    @Step("Set Password: {0}")
    public RegisterPageSteps passwordInput(String password) {
        register.password.setValue(password);
        return this;
    }

    @Step("Set confirm Password: {0}")
    public RegisterPageSteps passwordConfirmInput(String password) {
        register.passwordConfirm.setValue(password);
        return this;
    }

    @Step("Clink on checkbox")
    public RegisterPageSteps checkBoxClick() {
        register.privacyCheckBox.click();
        return this;
    }

    @Step("Click on continue button")
    public RegisterPageSteps continueButtonclick() {
        register.continueButton.click();
        return this;
    }

}
