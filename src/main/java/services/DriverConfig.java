package services;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class DriverConfig {

    @BeforeAll
    @Step(value = "Configuration driver")
    public static void beforeAll() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
        Configuration.startMaximized = true;
        Configuration.baseUrl="https://dev.marketcapp.ai/login";
        Configuration.timeout = 7000;
        Configuration.pageLoadTimeout = 5000;
    }

    @AfterAll
    @Step(value = "Close driver")
    public static void afterEach () {
        closeWebDriver();
    }
}
