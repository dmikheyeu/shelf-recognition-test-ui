package Pages;

import io.qameta.allure.Step;

public class ManagerFlow extends MainPage {

    @Step("User enters username and password")
    public CustomersFlow entersUsernameAndPasswordViaManager() {
        mainPageElement.enterEmail.setValue("mid+AutoManagerEmail12@unicsoft.com");
        mainPageElement.enterPassword.setValue("QwertY22");
        mainPageElement.loginButton.click();
        return new CustomersFlow().createCustomer();
    }
}
