package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public SelenideElement myAccount = $(By.xpath("//span[text()='My Account']"));

    public SelenideElement register = $(By.xpath("//a[text()='Register']"));

}
