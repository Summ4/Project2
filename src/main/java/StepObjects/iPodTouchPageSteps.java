package StepObjects;

import PageObjects.iPodTouchPage;
import io.qameta.allure.Step;

public class iPodTouchPageSteps {

    iPodTouchPage iPodTouchPage = new iPodTouchPage();

    @Step("Click on add to cart")
    public iPodTouchPageSteps addTocartClick() {
        iPodTouchPage.addToCart.click();
        return this;
    }

    @Step("Click on shopping cart")
    public iPodTouchPageSteps shoppingCartClick() {
        iPodTouchPage.shoppingCart.click();
        return this;
    }


}
