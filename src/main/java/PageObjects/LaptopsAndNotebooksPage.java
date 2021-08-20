package PageObjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LaptopsAndNotebooksPage {

    public SelenideElement sortSection = $(By.id("input-sort"));

    public SelenideElement highToLowSort = $(By.xpath("//option[text()='Price (High > Low)']"));

    public ElementsCollection prices = $$(By.xpath("//p[@class='price']"));

    public SelenideElement Desktops = $(By.xpath("//a[text()='Desktops']"));

    public SelenideElement showAllDesktops = $(By.xpath("//a[text()='Show All Desktops']"));


}
