package StepObjects;

import PageObjects.OrderPlacedPage;
import io.qameta.allure.Step;

public class OrderPlacedPageSteps {

    OrderPlacedPage orderPacedPage = new OrderPlacedPage();

    @Step("Click on history link")
    public OrderPlacedPageSteps historyLinkClick() {
        orderPacedPage.history.click();
        return this;
    }


}
