package StepObjects;

import PageObjects.ShoppingCartWindow;
import PageObjects.iPodTouchPage;
import io.qameta.allure.Step;
import org.testng.Assert;

public class ShoppingCartWindowSteps {

    ShoppingCartWindow cartWindow = new ShoppingCartWindow();
    iPodTouchPage ipodNanoPage = new iPodTouchPage();

    @Step("Check if the added items quantity and price is correct")
    public ShoppingCartWindowSteps addedItemsCheck() {

        double cartItemPrice = Double.parseDouble(cartWindow.cartItemPrice.getText().substring(1));
        int cartItemQuantity = Integer.parseInt(cartWindow.cartItemQuantiny.getText().substring(2));

        Assert.assertNotNull(ipodNanoPage.itemQuantityElement.getValue());
        int itemquantity = Integer.parseInt(ipodNanoPage.itemQuantityElement.getValue());
        double ipodNanoPrice = Double.parseDouble(ipodNanoPage.itemPrice.getText().substring(1));

        Assert.assertEquals(cartItemPrice, ipodNanoPrice);
        Assert.assertEquals(cartItemQuantity, itemquantity);
        return this;
    }

    @Step("Click on check out")
    public ShoppingCartWindowSteps checkOutClick() {
        if (cartWindow.checkOut.isDisplayed()) cartWindow.checkOut.click();
        return this;
    }

}
