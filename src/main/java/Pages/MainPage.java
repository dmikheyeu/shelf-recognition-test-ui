package Pages;

import PagesElements.MainPageElement;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class MainPage extends DriverConfig {

    MainPageElement mainPageElement = new MainPageElement();

    @Step ("Open to site")
    public MainPage openSite() {
        open("");
        return mainPageIsOpen();
    }

    @Step ("Check that Main Page is open")
    public MainPage mainPageIsOpen() {
        mainPageElement.logoButton.shouldHave().isDisplayed();
        mainPageElement.enterEmail.shouldHave().isDisplayed();
        mainPageElement.enterPassword.shouldHave().isDisplayed();
        mainPageElement.loginButton.shouldHave().isDisplayed();
        return this;
    }

    @Step ("User enters username and password")
    public MainPage entersUsernameAndPassword() {
        mainPageElement.enterEmail.setValue("mid@unicsoft.com");
        mainPageElement.enterPassword.setValue("QwertY22");
        return clickOnLoginButton();
    }

    @Step ("User click on Login Button")
    public MainPage clickOnLoginButton() {
        mainPageElement.loginButton.click();
        sleep(5000);
        return this;
    }
}