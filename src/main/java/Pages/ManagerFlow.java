package Pages;

import PagesElements.ManagerPageElements;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.sleep;

public class ManagerFlow extends MainPage {

    ManagerPageElements managerPageElements = new ManagerPageElements();

    @Step("Accept invite code")
    public void createPasswordFromManager() {
        managerPageElements.shelfRecognitionIcon.shouldHave().isDisplayed();
        sleep(500);
        managerPageElements.firstEnterPassword.click();
        managerPageElements.firstEnterPassword.setValue("QwertY12");
        managerPageElements.repeatEnterPassword.setValue("QwertY12");
    }

//    @Step("Enter login and password")
//    public void enterLoginAndPassword() {
//
//    }
}
