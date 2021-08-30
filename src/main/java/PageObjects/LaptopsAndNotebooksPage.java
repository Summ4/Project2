package PageObjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LaptopsAndNotebooksPage {

    public SelenideElement sortSection = $(By.id("input-sort")),
            highToLowSort = $(By.xpath("//option[text()='Price (High > Low)']")),
            Desktops = $(By.xpath("//a[text()='Desktops']")),
            showAllDesktops = $(By.xpath("//a[text()='Show All Desktops']"));

    public ElementsCollection prices = $$(By.xpath("//p[@class='price']"));
}
