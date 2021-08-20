package StepObjects;

import PageObjects.DesktopsPage;
import io.qameta.allure.Step;

public class DesktopsPageSteps {
    DesktopsPage deskPage = new DesktopsPage();

    @Step("Click on Mp3Players label")
    public DesktopsPageSteps mp3PlayerClick() {
        deskPage.mp3Player.click();
        return this;
    }

}
