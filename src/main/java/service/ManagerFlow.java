package service;

import page.ManagerPageElements;
import io.qameta.allure.Step;

import static service.CustomersFlow.saveManagersEmail;

public class ManagerFlow extends MainPage {

    ManagerPageElements managerPageElements = new ManagerPageElements();

    @Step("Accept invite code")
    public ManagerFlow createPasswordFromManager() {
        managerPageElements.shelfRecognitionIcon.shouldHave().isDisplayed();
        managerPageElements.firstEnterPasswordAsManager.setValue(password);
        managerPageElements.repeatEnterPasswordAsManager.setValue(password);
        managerPageElements.saveButton.click();
        return enterLoginAndPassword();
    }

    @Step("Enter login and password")
    public ManagerFlow enterLoginAndPassword() {
                mainPageElement.logoButton.shouldHave().isDisplayed();
                mainPageElement.enterEmail.shouldHave().isDisplayed();
                mainPageElement.enterPassword.shouldHave().isDisplayed();
                mainPageElement.loginButton.shouldHave().isDisplayed();

                mainPageElement.enterEmail.setValue(saveManagersEmail);
                mainPageElement.enterPassword.setValue(password);
                mainPageElement.loginButton.click();
        return this;
    }
}
