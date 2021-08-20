import ConfigObects.Config;
import ConfigObects.CustomRetryAnnotation.Retry;
import DataObjects.dbObjects;
import StepObjects.*;
import StepObjects.CheckOut.*;
import io.qameta.allure.*;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static com.codeborne.selenide.Selenide.open;

@Epic("Regression Test")
@Feature("Registration and item buy Test")
public class Main {

    Config config = new Config();
    HomePageSteps homePage = new HomePageSteps();
    RegisterPageSteps registrationPage = new RegisterPageSteps();
    AfterRegistrationSteps afterRegistrationPage = new AfterRegistrationSteps();
    LaptopsAndNotebooksPageSteps laptopsAndNotebooksPage = new LaptopsAndNotebooksPageSteps();
    addUserIntoDatabase userRegistration = new addUserIntoDatabase();
    DesktopsPageSteps desktopsPage = new DesktopsPageSteps();
    Mp3PlayersPageSteps mp3PlayersPage = new Mp3PlayersPageSteps();
    iPodTouchPageSteps iPodShufflePage = new iPodTouchPageSteps();
    ShoppingCartWindowSteps shoppingCartPage = new ShoppingCartWindowSteps();
    BillingDetailsSteps checkOutPage = new BillingDetailsSteps();
    DeliveryDetailsSteps deliveryDetails = new DeliveryDetailsSteps();
    DeliveryMethodSteps deliveryMethod = new DeliveryMethodSteps();
    PaymentMethodSteps paymentMethod = new PaymentMethodSteps();
    ConfirmOrderSectionSteps confirmOrder = new ConfirmOrderSectionSteps();
    OrderPlacedPageSteps orderPlacedpage = new OrderPlacedPageSteps();
    OrderHistoryPageSteps orderHistory = new OrderHistoryPageSteps();

    public Main() {
        config
                .init()
                .setAllureEnvironment();
        open("/demo");
    }

    @Description("This test method is responsible for input data to the database, registration users with the latest database users data" +
            " registration users with the latest database users data")
    @Severity(SeverityLevel.BLOCKER)
    @Story("User registration Test")
    @Test(description = "Registration", priority = 1)
    public void userRegistration() throws SQLException {

        userRegistration
                .insertToDatabase();
        homePage
                .myAccountClick()
                .registerClick();
        registrationPage
                .getDBObjects()
                .firstNameInput(dbObjects.getFirstName())
                .lastNameInput(dbObjects.getLastName())
                .phoneInput(dbObjects.getPhone())
                .emailInput(dbObjects.getEmail())
                .passwordInput(dbObjects.getPassword())
                .passwordConfirmInput(dbObjects.getPassword())
                .checkBoxClick()
                .continueButtonclick();
    }

    @Description("This test method goes to the Laptops section choose the price sort option(High-To-Low) and checks if its working correctly")
    @Story("Price sorting Test")
    @Test(description = "Price sort check", groups = "Regression1", priority = 2)
    public void laptopsSortCheck() {
        afterRegistrationPage
                .laptopsClick()
                .showAllLaptopsClick();
        laptopsAndNotebooksPage
                .sortSectionClick()
                .priceSortClick()
                .sortCheck();
    }

    @Description("This test method goes to the Mp3 players section, chooses 'Ipod Shuffle', and adds to the cart")
    @Story("Buy Mp3 player Test")
    @Test(dependsOnMethods = "userRegistration", description = "Buy Mp3 player", groups = "Regression2", priority = 2)
    public void mp3PlayerToCart() {

        laptopsAndNotebooksPage
                .desktopClick()
                .showAllDesktopsClick();
        desktopsPage
                .mp3PlayerClick();
        mp3PlayersPage
                .scrollToiPodTouch()
                .iPodTouchleHover()
                .afterHoverTextCheck()
                .iPodTouchLinkClick();
        iPodShufflePage
                .addTocartClick()
                .shoppingCartClick();
        shoppingCartPage
                .addedItemsCheck();
    }

    @Description("This test method is responsible for input billing address information, delivery details, payment method, order price check, order date check." +
            "Optional: This test method will retry 3 times in case of failure.")
    @Story("Ordering an item Test")
    @Test(dependsOnMethods = {"mp3PlayerToCart", "userRegistration"}, description = "Checkout", groups = "Regression2", priority = 3, retryAnalyzer = Retry.class)
    public void orderingTheItem() throws SQLException {

        shoppingCartPage
                .checkOutClick();
        checkOutPage
                .getDBObjects()
                .reEnterData()
                .firstNameInput(dbObjects.getFirstName())
                .lastNameInput(dbObjects.getLastName())
                .addressInput(dbObjects.getAddress())
                .cityInput(dbObjects.getCity())
                .postCodeInput(dbObjects.getZip())
                .selectCountry(dbObjects.getCountry())
                .selectState(dbObjects.getState())
                .continueButtonclick();
        deliveryDetails
                .continueButtonClick();
        deliveryMethod
                .continueButtonClick();
        paymentMethod
                .checkBoxClick()
                .continueButtonClick();
        confirmOrder
                .subTotalCheck()
                .flatShippingCheck()
                .totalAmountCheck()
                .confirmOrderButtonClick();
        orderPlacedpage
                .historyLinkClick();
        orderHistory
                .statusCheck()
                .orderDateCheck()
                .continueButtonclick();
    }

}
