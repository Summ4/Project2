package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OrderHistoryPage {

    public String pending = "Pending";
    public SelenideElement pendingStatus = $(By.xpath("//td[text()='" + pending +"']"));
    public SelenideElement date = $(By.xpath("//tbody//tr//td[6]"));
    public SelenideElement continueButton = $(By.xpath("//a[text()='Continue']"));


}
