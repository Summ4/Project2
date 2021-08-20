package PageObjects.CheckOut;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ConfirmOrderSection {

    public SelenideElement subTotal = $(By.xpath("//tfoot/tr[1]/td[2]"));

    public SelenideElement flatShipping = $(By.xpath("//tfoot/tr[2]/td[2]"));

    public SelenideElement total = $(By.xpath("//tfoot/tr[3]/td[2]"));

    public SelenideElement confirmOrderButton = $(By.id("button-confirm"));

    public SelenideElement quantity = $(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr//td[3]"));

    public SelenideElement unitPrice = $(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr//td[4]"));


}
