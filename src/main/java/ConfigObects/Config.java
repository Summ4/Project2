package ConfigObects;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.google.common.collect.ImmutableMap;
import io.qameta.allure.selenide.AllureSelenide;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

public class Config {

    public Config init() {
        Configuration.timeout = 6000;
        Configuration.baseUrl = "http://tutorialsninja.com/";
        Configuration.startMaximized = true;
//        Configuration.holdBrowserOpen = true;
        Configuration.savePageSource = false;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
        return this;
    }

    public void setAllureEnvironment() {
        allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("Browser", "Chrome")
                        .put("Browser.Version", " 92.0.4515.131")
                        .put("URL", "http://tutorialsninja.com/demo/")
                        .put("Stand", "Production")
                        .build(), System.getProperty("user.dir")
                        + "/target/allure-results/");
    }
}