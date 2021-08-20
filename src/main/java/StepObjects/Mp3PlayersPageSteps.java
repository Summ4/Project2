package StepObjects;

import PageObjects.Mp3PlayersPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

public class Mp3PlayersPageSteps {

    Mp3PlayersPage mp3 = new Mp3PlayersPage();

    @Step("Scroll into IpodShuffle item")
    public Mp3PlayersPageSteps scrollToiPodTouch() {
        mp3.iPodTouchImg.scrollTo();
        return this;
    }

    @Step("Mouse Hover on iPod Touch")
    public Mp3PlayersPageSteps iPodTouchleHover() {
        mp3.iPodTouchImg.hover().shouldHave(Condition.attributeMatching("title", "iPod Touch"));
        return this;
    }

    @Step("Check if the text is displayed on hover")
    public Mp3PlayersPageSteps afterHoverTextCheck() {
        Assert.assertTrue(mp3.afterHoverText.isDisplayed());
        return this;
    }

    @Step("Click on Ipod Shuffle link")
    public Mp3PlayersPageSteps iPodTouchLinkClick() {
        mp3.iPodTouch.click();
        return this;
    }

}
