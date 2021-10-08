package Pages;

import PagesElements.ManagerPageElements;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.sleep;

public class ManagerFlow extends MainPage {

    ManagerPageElements managerPageElements = new ManagerPageElements();

    @Step("Accept invite code")
    public ManagerFlow createPasswordFromManager() {
        managerPageElements.shelfRecognitionIcon.shouldHave().isDisplayed();
        managerPageElements.firstEnterPasswordAsManager.setValue("QwertY14");
        managerPageElements.repeatEnterPasswordAsManager.setValue("QwertY14");
        managerPageElements.saveButton.click();
        return enterLoginAndPassword();
    }

    @Step("Enter login and password")
    public ManagerFlow enterLoginAndPassword() {
                mainPageElement.logoButton.shouldHave().isDisplayed();
                mainPageElement.enterEmail.shouldHave().isDisplayed();
                mainPageElement.enterPassword.shouldHave().isDisplayed();
                mainPageElement.loginButton.shouldHave().isDisplayed();

                mainPageElement.enterEmail.setValue("mid+AutoManager7123@unicsoft.com");
                mainPageElement.enterPassword.setValue("QwertY14");
                mainPageElement.loginButton.click();
                sleep(5000);
        return this;
    }
}
