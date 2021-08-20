package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OrderPlacedPage {

    public SelenideElement history = $(By.xpath("//a[text()='history']"));

}
