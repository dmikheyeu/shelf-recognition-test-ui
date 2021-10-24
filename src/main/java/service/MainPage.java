package service;

import io.qameta.allure.Step;
import page.MainPageElements;

import static com.codeborne.selenide.Selenide.open;

public class MainPage extends DriverConfig {

    public static String adminEmail = "mid@unicsoft.com";
    public static String password = "QwertY14";

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
        mainPageElement.enterEmail.setValue(adminEmail);
        mainPageElement.enterPassword.setValue(password);
        mainPageElement.loginButton.click();
        return new CustomersFlow().createCustomer();
    }
}