package StepObjects;

import PageObjects.LaptopsAndNotebooksPage;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.testng.Assert;

public class LaptopsAndNotebooksPageSteps {

    LaptopsAndNotebooksPage LapsNNotebooksPage = new LaptopsAndNotebooksPage();
    ElementsCollection sortedPricesCollection;

    @Step("Click on sorting section")
    public LaptopsAndNotebooksPageSteps sortSectionClick() {
        LapsNNotebooksPage.sortSection.click();
        return this;
    }

    @Step("Choose sort option High-To-Low")
    public LaptopsAndNotebooksPageSteps priceSortClick() {
        LapsNNotebooksPage.highToLowSort.click();
        return this;
    }

    @Step("Check if the sort works properly")
    public LaptopsAndNotebooksPageSteps sortCheck() {
        sortedPricesCollection = LapsNNotebooksPage.prices;

        String unModifiedFirstPrice = sortedPricesCollection.first().getText().replace(",", "");
        double greaterPrice = Double.parseDouble(unModifiedFirstPrice.substring(unModifiedFirstPrice.indexOf('$') + 1, unModifiedFirstPrice.indexOf('.') + 4));

        for (SelenideElement i : sortedPricesCollection) {

            String nextElementPrice = i.getText().replace(",", "");
            double modifiedNextElementPrice = Double.parseDouble(nextElementPrice.substring(nextElementPrice.indexOf('$') + 1, nextElementPrice.indexOf('.') + 4));

            Assert.assertTrue(greaterPrice >= modifiedNextElementPrice, "Sorting doesnt work properly");
        }
        return this;
    }

    @Step("Click on desktop section")
    public LaptopsAndNotebooksPageSteps desktopClick() {
        LapsNNotebooksPage.Desktops.click();
        return this;
    }

    @Step("Click on show all desktops")
    public LaptopsAndNotebooksPageSteps showAllDesktopsClick() {
        LapsNNotebooksPage.showAllDesktops.click();
        return this;
    }


}
