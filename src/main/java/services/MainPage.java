package services;

import page.MainPageElements;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class MainPage extends DriverConfig {

    MainPageElements mainPageElement = new MainPageElements();

    @Step("Open to site")
    public MainPage openSite() {
        open("");
        return mainPageIsOpen();
    }

    @Step("Check that Main Page is open")
    public MainPage mainPageIsOpen() {
        mainPageElement.logoButton.shouldHave().isDisplayed();
        mainPageElement.enterEmail.shouldHave().isDisplayed();
        mainPageElement.enterPassword.shouldHave().isDisplayed();
        mainPageElement.loginButton.shouldHave().isDisplayed();
        return this;
    }

    @Step("User enters username and password")
    public CustomersFlow entersUsernameAndPasswordAsAdmin() {
        mainPageElement.enterEmail.setValue("mid@unicsoft.com");
        mainPageElement.enterPassword.setValue("QwertY14");
        mainPageElement.loginButton.click();
        return new CustomersFlow().createCustomer();
    }
}