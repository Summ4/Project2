package StepObjects;

import PageObjects.OrderHistoryPage;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OrderHistoryPageSteps {

    OrderHistoryPage orderHistory = new OrderHistoryPage();

    @Step("Check status")
    public OrderHistoryPageSteps statusCheck() {
        Assert.assertEquals(orderHistory.pendingStatus.getText(), orderHistory.pending);
        return this;
    }

    @Step("Check if the order date is correct")
    public OrderHistoryPageSteps orderDateCheck() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);

        Assert.assertEquals(orderHistory.date.getText(), date);

        return this;
    }

    @Step("Click on continue button")
    public OrderHistoryPageSteps continueButtonclick() {
        orderHistory.continueButton.click();
        return this;
    }

}
