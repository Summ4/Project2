package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DesktopsPage {

    public SelenideElement mp3Player = $(By.xpath("//a[contains(text(),'MP3 Players ') and @class='list-group-item' ]"));

}
