package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegisterPage {

    public SelenideElement firstName = $(By.id("input-firstname"));

    public SelenideElement lastName = $(By.id("input-lastname"));

    public SelenideElement email = $(By.id("input-email"));

    public SelenideElement phone = $(By.id("input-telephone"));

    public SelenideElement password = $(By.id("input-password"));

    public SelenideElement passwordConfirm = $(By.id("input-confirm"));

    public SelenideElement privacyCheckBox = $(By.xpath("//input[@type='checkbox' and @name ='agree']"));

    public SelenideElement continueButton = $(By.xpath("//input[@value='Continue']"));



}
