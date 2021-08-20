package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AfterRegistrationPage {

    public SelenideElement laptopsNnotebooks = $(By.xpath("//a[text()='Laptops & Notebooks']"));

    public SelenideElement showAllLaptops = $(By.xpath("//a[text()='Show All Laptops & Notebooks']"));

}
