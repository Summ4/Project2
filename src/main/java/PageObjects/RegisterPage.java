package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {

    public SelenideElement firstName = $(By.id("input-firstname")),
            lastName = $(By.id("input-lastname")),
            email = $(By.id("input-email")),
            phone = $(By.id("input-telephone")),
            password = $(By.id("input-password")),
            passwordConfirm = $(By.id("input-confirm")),
            privacyCheckBox = $(By.xpath("//input[@type='checkbox' and @name ='agree']")),
            continueButton = $(By.xpath("//input[@value='Continue']"));


}
