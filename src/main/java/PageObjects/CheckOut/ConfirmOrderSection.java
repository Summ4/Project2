package PageObjects.CheckOut;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ConfirmOrderSection {

    public SelenideElement subTotal = $(By.xpath("//tfoot/tr[1]/td[2]")),
            flatShipping = $(By.xpath("//tfoot/tr[2]/td[2]")),
            total = $(By.xpath("//tfoot/tr[3]/td[2]")),
            confirmOrderButton = $(By.id("button-confirm")),
            quantity = $(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr//td[3]")),
            unitPrice = $(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr//td[4]"));


}
